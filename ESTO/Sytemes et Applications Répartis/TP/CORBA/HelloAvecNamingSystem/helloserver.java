import org.omg.CORBA.ORB;
import java.util.*;
import javax.naming.*;

public class helloserver implements helloOperations{
public String sayhello (){
System.out.println("Salam ya kaoum!");
return "Salam ya kaoum!";
} 
public static void main(String [] args){
try{
	ORB orb=ORB.init(args,null);

	helloserver Hello=new helloserver();
	hello helloRef=new hello_Tie(Hello);
	orb.connect(helloRef);

	Properties env=System.getProperties();
	env.put("java.naming.factory.initial","com.sun.jndi.cosnaming.CNCtxFactory");

	Context ctx=new InitialContext(env);
	ctx.rebind("Hello",helloRef);
while(true) 
	Thread.sleep(1000);
}
catch(Exception e){
System.err.println("Error:"+e);
e.printStackTrace();
}
}
}
