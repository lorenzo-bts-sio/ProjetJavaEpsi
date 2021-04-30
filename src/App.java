
public class App 
{
	public static void main(String[] args) 
	{
		ConnectionSGBD connection = new ConnectionSGBD(); 
		connection.connect();
		
		Client client1 = new Client("triton ", "lorenzo", "test@gmail.fr" , null  );
		Produit p1 = new Produit(0, "Banane ", "c'est bon ", "", 1, "1.2");
		Produit p2 = new Produit(0, "Pomme ", "c'est bon ", "", 1, "1.2");
	
		
		Pannier panier = new Pannier(client1, 0);
		panier.ajoutPannier( p1, 2);
		panier.ajoutPannier( p2, 5);
		panier.etatPannier();
		
		 
		
		
		 
		
	}

}
