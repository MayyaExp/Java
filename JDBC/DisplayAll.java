class DisplayAll
{
public static void main(String arg[])
{
int empno;
String ename;
float basic,da,hra,net;
Connection con=null;
Statement st=null;
ResultSet rs=null;
try
{
Class.forName(“sun.jdbc.odbc.JdbcOdbcDriver”);
con=DriverManager.getConnection(“jdbc:odbc:Acc_Dsn”,”Admin”,” “);

st=con.createStatement();

rs=st.executeQuery(“select * from emp”);
while(rs.next()==true)
{
empno=rs.getInt("empno");
ename=rs.getString(“ename”);
basic=rs.getFloat(“basic”);
da=rs.getFloat(“da”);
hra=rs.getFloat(“hra”);
net=rs.getFloat(“net”);
System.out.println(empno+ename+basic+da+hra+net);
}
}
catch(ClassNotFoundException e)
{
System.er.println(e);
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


