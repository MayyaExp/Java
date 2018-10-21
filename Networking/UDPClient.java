
import java.net.*;
import java.net.*;
class UDPClient
{
public static void main(String arg[])
{

try
{
String clientmessage="Where is my stuff?";

byte[] buffer=clientmessage.getBytes();

DatagramSocket socket=new DatagramSocket();

//InetAddress server=InetAddress.getByName("server1");

InetAddress server=InetAddress.getLocalHost();

DatagramPacket packet=new DatagramPacket(buffer,buffer.length,server,9999);

socket.send(packet);

packet=new DatagramPacket(buffer,buffer.length);

socket.receive(packet);

System.out.println(new String(packet.getData()));
}
catch(Exception e)
{
}
}
}
