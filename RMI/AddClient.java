import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
class AddClient
{
public static void main(String arg[])
{
int a=20,b=30,c;
try
{
AddInt i=(AddInt)Naming.lookup("rmi://200.00.50.2","calculate");

c=i.add(a,b);

System.out.println("Sum is "+ c);
}
catch(Exception e)
{
System.out.println(e);

}
}
c AddClient.java

javac AddInt.java
AddInt.class

javac AddImpl.java
AddImpl.class

rmic AddImpl
AddImpl_Stub.class
AddImpl_Skel.class



javc AddClient.java
AddClient.cladd

javac AddReg.java
AddReg.class

