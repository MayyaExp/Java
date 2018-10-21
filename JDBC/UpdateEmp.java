import java.io.*;
import java.sql.*;
class UpdateEmp
{
public static void main(String arg[])
{
int mempno;
float mbasic,da,hra,net;
BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
Connection con=null;
Statement st=null;

try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
con=DriverManager.getConnection(“jdbc:odbc:Acc_Dsn”,”Admin”,” “);
st=con.createStatement();
mempno=Integer.parseInt(y.readLine());
mbasic=Float.parseFloat(y.readLine());

da=0.05f*mbasic;
hra=0.07f*mbasic;
net=mbasic+da+hra;
st.executeUpdate(“update emp set basic=“+mbasic+”, da=“+da+”, hra=“+hra + “, net=“ +net +” where empno=“+mempno);
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
rs.close();
}
}
}








