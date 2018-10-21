class DisplayEmp
{
public static void main(String arg[])
{
int empno, mempno;
String ename;
float basic,da,hra,net;

Connection con=null;
Statement st=null;
ResultSet rs=null;
try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
con=DriverManager.getConnection(“jdbc:odbc:Acc_Dsn”,”Admin”,” “);
//st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
st=con.createStatement();
mempno=Integer.parseInt(y.readLine());
rs=st.executeQuery(“select * from emp where empno=”+mempno);

if(rs.next()==true)
{
empno=rs.getInt(“empno”);
ename=rs.getString(“ename”);
basic=rs.getFloat(“basic”);
da=rs.getFloat(“da”);
hra=rs.getFloat(“hra”);
net=rs.getFloat(“net”);
System.out.println(empno+ename+basic+da+hra+net);
}
else
System.out.println(“Employee Not Found!!!”);
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








