import org.omg.CORBA.ORB;
import java.util.*;
import javax.naming.*;

public class helloclient{
public static void main(String [] args) throws Exception{
hello objdistant;
ORB orb=ORB.init(args,null);

Properties env=System.getProperties();
env.put("java.naming.factory.initial","com.sun.jndi.cosnaming.CNCtxFactory");
env.put("java.naming.provider.url","iiop://localhost:900");
Context ctx=new InitialContext(env);
objdistant=(hello) ctx.lookup("Hello");
while(true)
System.out.println(objdistant.sayhello());
}
}
