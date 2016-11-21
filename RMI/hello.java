
import java.rmi.*;


public interface hello extends Remote
        {
    public String greetings(String s) throws RemoteException;

}