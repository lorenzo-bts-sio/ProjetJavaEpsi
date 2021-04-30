import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSGBD {

	private String url = "jdbc:mysql://127.0.0.1:3306/javaProjet"; 
	private String login = "lorenzo"; 
	private String password = "lorenzo"; 
	
	
	public ConnectionSGBD() 
	{
		
		this.url = url ; 
		this.login = login ; 
		this.password  = password ; 
			
	}
	
	public Statement connect() 
	{
		try
		{
			Connection connection= DriverManager.getConnection(this.url, this.login, this.password);
			Statement requete = connection.createStatement();
			return requete ;
		}
		catch(SQLException e )
		{
			System.out.println("Impossible de ce connecter a la base de données ");
			return null ; 
		}
	}
	
	public void requete(String requete)
	{
		// code a mettre 
	}
	

}
