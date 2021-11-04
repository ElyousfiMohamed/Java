import org.omg.CORBA.ORB;
import java.util.*;
import javax.naming.*;

public class factclient{
public static void main(String [] args) throws Exception{
Fact objdistant;
ORB orb=ORB.init(args,null);

Properties env=System.getProperties();
env.put("java.naming.factory.initial","com.sun.jndi.cosnaming.CNCtxFactory");
env.put("java.naming.provider.url","iiop://localhost:900");
Context ctx=new InitialContext(env);
objdistant=(Fact) ctx.lookup("Fact");
for(int i=0;i<=10;i++)
System.out.println(i+" ! = "+objdistant.factoriel(i));
}
}
