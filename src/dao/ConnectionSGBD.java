package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionSGBD 
{

	private static String connectionUrl = "jdbc:mysql://localhost:3306/javaProjet";
	private static String dbUser = "lorenzo";
	private static String dbPwd = "lorenzo";
	private static Connection connectionSGBD = null;
	

	public static Connection connect()
	{
		if (connectionSGBD == null) 
		{
			try
			{
				connectionSGBD  = DriverManager.getConnection(connectionUrl, dbUser, dbPwd);
				
			}
			catch(SQLException e )
			{
				System.out.println("Impossible de ce connecter a la base de données ");
				 
			}
		}
		return connectionSGBD ;
			
	}

}







}
