import java.sql.*;
class Idu
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfuly");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC73","IPC73");
			System.out.println("Connection is established");
			Statement s=c.createStatement();
			String sql="update kittu set grade='A' where sid=73";
			s.executeUpdate(sql);
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}