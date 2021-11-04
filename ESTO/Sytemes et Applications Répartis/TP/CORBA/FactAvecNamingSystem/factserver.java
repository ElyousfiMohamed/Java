import org.omg.CORBA.ORB;
import java.util.*;
import javax.naming.*;

public class factserver implements FactOperations{
public long factoriel(int N){
	if(N==0)
		return 1;
	else 
		return N*factoriel(N-1);
} 
public static void main(String [] args){
try{
	ORB orb=ORB.init(args,null);

	factserver Fact=new factserver();
	Fact factRef=new Fact_Tie(Fact);
	orb.connect(factRef);

	Properties env=System.getProperties();
	env.put("java.naming.factory.initial","com.sun.jndi.cosnaming.CNCtxFactory");

	Context ctx=new InitialContext(env);
	ctx.rebind("Fact",factRef);
while(true) 
	Thread.sleep(1000);
}
catch(Exception e){
System.err.println("Error:"+e);
e.printStackTrace();
}
}
}
