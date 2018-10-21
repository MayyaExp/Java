import java.io.*;
import java.net.*;

class MathClient
{
public static void main(String arg[])
{

Socket sc;


InputStream is;
OutputStream os;


DataInputStream dis;
DataOutputStream dos;

//BufferedReader y=new BufferedReader(new InputStreamReader(System.in));

try
{
sc=new Socket("localhost",9999);


is=sc.getInputStream();
dis=new DataInputStream(is);
os=sc.getOutputStream();
dos=new DataOutputStream(os);


System.out.println(dis.readUTF());

sc.close();
dis.close();

}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
