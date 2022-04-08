import java.sql.*;
class Example
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
			ResultSet rs=s.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(2));
				System.out.println(rs.getString(1));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
				