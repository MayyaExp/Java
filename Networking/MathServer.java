import java.io.*;
import java.net.*;

class MathServer
{
public static void main(String arg[])
{
ServerSocket ss;
Socket sc;

OutputStream os;
InputStream is;

DataOutputStream dos;
DataInputStream dis;



try
{
ss=new ServerSocket(9999);

//System.out.println("Server is Listening at " + INetAddress.getLocalHost().getHostAddress());
sc=ss.accept();

os=sc.getOutputStream();
//dos=new DataOutputStream(os);
is=sc.getInputStream();
dis=new DataInputStream(is);

dos.writeUTF("Hello from Server!!!");




dos.flush();
dos.close();

sc.close();



}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
