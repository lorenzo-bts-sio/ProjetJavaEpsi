package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import main.*;



public class ClientDAO

{
	//private static Connection connection = (Connection) new dao.Connection().connect();
	private static  Connection connect= ConnectionSGBD.connect();
	public static  ArrayList<Client> CLientAll() throws SQLException
	{
		
		ArrayList<Client> clients = new ArrayList<>();
		
		Statement statement = connect.createStatement() ; 
		ResultSet resulat = statement.executeQuery("SELECT * FROM client ; ");
		while (resulat.next())
		{
			int id = resulat.getInt("id");
			String nom = resulat.getString("nom");
			String prenom = resulat.getString("prenom");
			String email = resulat.getString("email");
			String date = resulat.getString("dateNaissance");
			boolean actif = resulat.getBoolean("actif");
			clients.add(new Client(id ,nom, prenom, email, null));
			//System.out.println(id  +nom +prenom);
			
		}
		return clients ; 
	}
	
}
