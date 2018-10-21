import java.sql.*;
import java.io.*;
class InsertDemo
{
public static void main(String arg[])
{
int empno;
String ename;
float basic,da,hra,net;
BufferedReader y=new BufferedReader(new InputStreamReader(System.in));

Connection con=null;
Statement st=null;
try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
con=DriverManager.getConnection(“jdbc:odbc:Acc_Dsn”,”Admin”,” “);
st=con.createStatement();

empno=Integer.parseInt(y.readLine());
ename=y.readLine();
basic=Float.parseFloat(y.readLine());

da=0.05f*basic;
hra=0.07f*basic;
net=basic+da+hra;

//st.executeUpdate("insert into emp values(101,'ann',2000,100.2,200.50,2500.20)");
st.executeUpdate(“insert into emp values(“+empno+”,’”+ename+”’,”+basic+”,”+da+”,”+hra+”,”+net+”)”);
con.commit();

}
catch(ClassNotFoundException e)
{
System.err.println(e);
}
catch(SQLException e)
{
System.err.println(e);
}
catch(IOException e)
{
Sysem.out.println(e);
}
finally
{
con.close();
st.close();
}
}
}







