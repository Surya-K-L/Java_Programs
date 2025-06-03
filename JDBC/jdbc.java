package defaultpackage;
import java.sql.*;
public class jdbc {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select * from books");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		}
		catch(Exception e)
		{
			System.out.print(e.toString());
		}
	}
}
