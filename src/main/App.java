package main;

import java.sql.Connection;
import java.sql.SQLException;
import dao.*;



public class App 
{
	public static void main(String[] args) throws SQLException 
	{
		
		Client c1 = new Client(0, "test", "lorenzo", null, null);
		Produit p1 = new Produit(0, "pomme", "miam miam ", null, 0.5, 0);
		Produit p2 = new Produit(0, "poire", "miam miam ", null, 0.5, 0);
		Pannier pa1 = new Pannier(c1, 0) ;
		
		
		ClientDAO.CLientAll();
		
		
		
		
		
		 
		
	}

}
