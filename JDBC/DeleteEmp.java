class DeleteEmp
{
public static void main(String arg[])
{
int mempno;

Connection con=null;
Statement st=null;
try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
con=DriverManager.getConnection(“jdbc:odbc:Acc_Dsn”,”Admin”,” “);

st=con.createStatement();

mempno=Integer.parseInt(y.readLine());

int rno=st.executeUpdate("delete from emp where empno="+mempno);


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








