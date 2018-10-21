
import java.sql.*;
import java.io.*;

class BatchingWithPreparedStatementExample
{

public static void main(String arg[])
{
Connection con=null;
PreparedStatement st=null;


try
{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:oradsn","scott","tiger");

st=con.prepareStatement("insert into emp values(?, ?, ?)");
con.setAutoCommit(false);

st.setInt(1, 101);
st.setString(2, 'ann');
st.setFloat(3, 3000);
st.addBatch();

st.setInt(1, 102);
st.setString(2, 'beena');
st.setFloat(3, 4000);
st.addBatch();

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

