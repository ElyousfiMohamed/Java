public class factclient{
public static void main(String [] args)
{
	java.util.Properties props=System.getProperties();
	int status=0;
	org.omg.CORBA.ORB orb=null;
	try	{
		orb=org.omg.CORBA.ORB.init(args,props);
		status=run(orb);
		}
	catch(Exception ex){
		ex.printStackTrace();
		status=1;
		}
	System.exit(status);
}

static int run(org.omg.CORBA.ORB orb) 
{
	org.omg.CORBA.Object obj=null;
	String ref="";
	try	{
		String refFile="fact.ref";
		java.io.BufferedReader in=new java.io.BufferedReader(new java.io.FileReader(refFile));
		ref=in.readLine();
		obj=orb.string_to_object(ref);
		}
	catch(java.io.IOException ex){
		ex.printStackTrace();
		return 1;
		}
	fact FACT=factHelper.narrow(obj);
	for(int i=0;i<=5000;i++)
	{
		System.out.println(i+"! = "+FACT.calculfact(i));
	}
	return 0;
}

}