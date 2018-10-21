import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
class AddReg
{
public static void main(String arg[])
{

try
{
AddImpl x=new AddImpl();

Naming.rebind("calculate",x);

System.out.println("Calculate registerd in" +InetAddress.getLocalHost().getHostAddress());
}
catch(Exception e)
{
System.out.println(e);

}
}