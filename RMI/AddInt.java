

import java.rmi.*;
import java.rmi.server.*;

interface AddInt extends Remote
{

int add(int a, int b) throws RemoteException;

}