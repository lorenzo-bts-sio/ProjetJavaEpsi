package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class ConnectionSGBD {

	private String url = "jdbc:mysql://127.0.0.1:3306/javaProjet"; 
	private String login = "lorenzo"; 
	private String password = "lorenzo"; 
	private Connection connection ; 
	
	
	public ConnectionSGBD() 
	{
		
		this.url = url ; 
		this.login = login ; 
		this.password  = password ; 
		this.connection = connection ; 
			
	}
	
	public ArrayList<Client> connect() 
	{
		try
		{
			Connection connection= DriverManager.getConnection(this.url, this.login, this.password);
		//	Statement requete = connection.createStatement();
		//	return this.connection ;
			ArrayList<Client> produit = new ArrayList<>();
			
			Statement statement = connection.createStatement();
			ResultSet resulat = statement.executeQuery("SELECT * FROM client ; ");
			while (resulat.next())
			{
				int id = resulat.getInt("id");
				String nom = resulat.getString("nom");
				String prenom = resulat.getString("prenom");
				String email = resulat.getString("email");
				String date = resulat.getString("dateNaissance");
				boolean actif = resulat.getBoolean("actif");
				produit.add(new Client(id ,nom, prenom, email, null));
				//System.out.println(id  +nom +prenom);
				
			}
			return produit ; 
		}
		catch(SQLException e )
		{
			System.out.println("Impossible de ce connecter a la base de données ");
			return null ; 
		}
	}
	
	
	

}
