
import java.sql.*;
import java.io.*;

class BatchingWithStatementExample
{

public static void main(String arg[])
{
Connection con=null;
Statement st=null;


try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

st=con.createStatement();
con.setAutoCommit(false);

st.addBatch("insert into emp values(101,'ann',2000)");
st.addBatch("update emp set basic=basic+5000");
st.addBatch("insert into emp values(102,'harish',3000)");

int count[]=st.executeBatch();

con.commit();

st.close();
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}

