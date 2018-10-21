
import java.rmi.*;
import java.rmi.server.*;

public class AddImpl extends UnicastRemoteObject implements AddInt
{

public AdImpl() thows RemoteException
{

}
public int add(int a, int b) throws RemoteException
{
return(a+b);
}
}
