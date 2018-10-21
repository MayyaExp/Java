
import java.sql.*;
import java.io.*;

class InsertingUsingResultSetExample
{

public static void main(String arg[])
{

Connection con=null;
Statement st=null;
ResultSet rs=null;

int empno;
String ename;
float basic;
char ans='y';

BufferedReader y=new BufferedReader(new InputStreamReader(System.in));

try
{
Class.forName("sun.jdbc.odbc.JbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");
st=con.createStetemnt(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
rs=st.executeQuery("select * from emp");

while(ans=='y')
{

empno=Integer.parseInt(y.readLine());
ename=y.readLine();
basic=Float.parseFloat(y.readLine());

rs.insertRow();
rs.updateInt("empno", empno);
rs.updateString("ename", ename);
rs.updateFloat("basic", basic);
rs.updateRow();

System.out.println("Do you want to continue<y/n>?");
ans=y.readLine().charAt(0);
}

rs.beforeFirst();

while(rs.next())
{

System.out.println( rs.getInt("empno") + rs.getString("ename") + rs.getFloat("basic") );

}

rs.close();
st.close();
con.close);

}
catch(Exception e)
{
System.out.println(e);
}

}
}








