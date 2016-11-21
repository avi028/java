import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
public class client {
    private final static String host="localhost";
    public static void main(String s[])
    { String a=new String();
	  Scanner in=new Scanner(System.in);
	
        try{
            hello greet=(hello)Naming.lookup("rmi://"+host+"/hello");
            System.out.printf("Enter ur msg");  
            a=in.nextLine();
    	    System.out.printf("message received = %s", greet.greetings(a));
        }
        catch(ConnectException ex)
        {
            System.out.printf("Unable to connect");
        }
        catch(NotBoundException | MalformedURLException | RemoteException ec)
        {
        ec.printStackTrace();
        System.exit(1);
        }
        
    }
    
}
