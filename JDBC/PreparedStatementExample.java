
import java.sql.*;
import java.io.*;

class PreparedStatementExample
{

public static void main(String arg[])
{
Connection con=null;
PreparedStatement st=null;

int empno;
String ename;
float basic;
char ans='y';
BufferedReader y=new BufferedReader(new InputStreamReader(System.in));


try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

st=con.prepareStatement("insert into emp values(?, ?, ?)");

while(ans=='y')
{
empno=Integer.parseInt(y.readLine());
ename=y.readLine();
basic=Float.parseFloat(y.readLine());

st.setInt(1, empno);
st.setString(2, ename);
st.setFloat(3, basic);
st.executeUpdate();

System.out.println("Do you want to continue<y/n>?");
ans=y.readLine().charAt(0);
}

st.cloae();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

