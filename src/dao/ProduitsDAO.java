package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import main.Client;
import main.Produit;

public class ProduitsDAO 
{



	//private static Connection connection = (Connection) new dao.Connection().connect();
	private static  Connection connect= ConnectionSGBD.connect();
	
	public static  ArrayList<Produit> CLientAll() throws SQLException
	{

		ArrayList<Produit> produits = new ArrayList<>();

		Statement statement = connect.createStatement() ; 
		ResultSet resulat = statement.executeQuery("SELECT * FROM produits ; "); // prepared statement qui gere les choix (nom id , libelle etc ) 
		while (resulat.next())
		{
			int id = resulat.getInt("id");
			String nom = resulat.getString("nom");
			String reference = resulat.getString("reference");
			String libele = resulat.getString("libele");
			double prix = resulat.getInt("prix");
			int stock = resulat.getInt("stock");
			produits.add(new Produit(id ,nom, reference, libele, prix ,stock));
			//System.out.println(id  +nom +prenom);

		}
		return produits ; 
	}

}


