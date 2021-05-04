package dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection 
{

	private static String url = "jdbc:mysql://127.0.0.1:3306/javaProjet"; 
	private  static String login = "lorenzo"; 
	private  static String password = "lorenzo"; 
	
				
	public  static Connection connect() 
	{
		try
		{
			Connection connection= DriverManager.getConnection(url, login, password) ; 
			return connection ;
		}
		catch(SQLException e )
		{
			System.out.println("Impossible de ce connecter a la base de données ");
			return null ; 
		}
	}
	
}
