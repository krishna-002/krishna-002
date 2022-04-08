import java.sql.*;
import java.util.*;
class Emp1
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
			System.out.println("enter your id");
			int id=s.nextInt();
			Statement sc=c.createStatement();
			String sql="select * from emp where id="+id;
			ResultSet rs=sc.executeQuery(sql);
			System.out.println(rs.next());
			boolean result=false;
			while(rs.next())
			{
				System.out.println("u r valid user");
				System.out.println("kittu"+rs.getString(2));
				result=true;
				break;
			}
			if(result==false)
			{
				System.out.println("u r invalid user");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}