//Server for MultiThreading

import java.io.*;
import java.net.*;

class MultiThreadedMathServer
{
public static void main(String arg[])
{

ServerSocket ss;
Socket sc;
MathThread t;
try
{
ss=new ServerSocket(9999);
System.out.println("Server is Listening at" + ss.getINetAddress().getHostAddress()+ " at port" + ss.getLocalPort());

while(true)
{
sc=ss.accept();
t=new MathThread(sc);
}
}
catch(Exception e)
{
}
}
}

