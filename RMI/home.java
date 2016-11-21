
import java.rmi.*;
import java.rmi.server.*;
import java.util.Scanner;


public class home  extends UnicastRemoteObject implements hello
{
    public home() throws RemoteException
    {
    } 

    public String greetings(String s) throws RemoteException
    
    {
//	String  s= new String();
    Scanner in= new Scanner(System.in);
      
	System.out.printf("%s-- user greetings/n",s);
	
	System.out.printf("REPLY TO USER/n");
	
	
	s=in.nextLine();
	
	
        return s;
    }
}
