import java.rmi.*;

public class server {
 private static final String host="localhost";
 public static void main(String s[] ) throws Exception
 {
	home temp= new home();
	String ron="rmi://"+host+"/hello";
	Naming.rebind(ron , temp);
	System.out.printf("Binding complete\n");
 }
}