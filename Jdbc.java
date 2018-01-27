import java.sql.*;
public class Jdbc{
		
		static final String url = "jdbc:mysql://localhost/ujjwal";
		static final String username = "root";
		static final String password = "lnmiit";
		static Statement stat = null;
		void connecting() throws SQLException
		{
			Connection conn =null;
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch(ClassNotFoundException ex){
				System.out.println("Error: unable to load driver class!");
				System.exit(1);
			}
			
			try{
			System.out.println("Connecting....");
			conn = DriverManager.getConnection(url,username,password);
			}
			
			catch(Exception e)
			{
				System.out.println("Error in connecting");
			}
			
			try
			{
				stat = conn.createStatement();
			}
			
			catch(Exception e)
			{
				System.out.println("Error in creating Statement.");
			}
		}
	}

