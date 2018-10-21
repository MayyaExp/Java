//HelloThread


import java.io.*;
import java.net.*;

class MathThread extends Thread
{

Socket sc;

OutputStream os;
DataOutputStream dos;
InputStream is;
DataInputStream dis;
int a,b,c;

MathThread(Socket sc)
{
this.sc=sc;
start();
}
public void run()
{
try
{

os=sc.getOutputStream();
dos=new DataOutputStream(os);
is=sc.getInputStream();
dis=new DataInputStream(is);

dos.writeUTF("Hello from Server!!!");
dos.writeUTF("Enter First Number");
a=dis.readInt();
dos.writeUTF("Enter Second Number");
b=dis.readInt();

c=a+b;

dos.writeUTF("The sum is " +c);


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