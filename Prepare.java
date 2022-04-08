import java.sql.*;
import java.util.*;
class Prepare
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded successfuly");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC73","IPC73");
			System.out.println("Connection is established");
			Scanner s=new Scanner(System.in);
			int a=s.nextInt();
			Statement sc=c.createStatement();
			PreparedStatement ps=c.prepareStatement("insert into emp values(?,?,?)");
			ps.setInt(1,a);
			ps.setString(2,"kittu");
			ps.setInt(3,500);
			int noofrows=ps.executeUpdate();
			System.out.println("success");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}