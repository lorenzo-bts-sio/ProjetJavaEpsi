
public class App 
{
	public static void main(String[] args) 
	{
		ConnectionSGBD connection = new ConnectionSGBD(); 
		connection.connect();
		
		Client client1 = new Client("triton ", "lorenzo", "test@gmail.fr" , null  );
		Produit p1 = new Produit(0, "Banane ", "c'est bon ", "", 3.2, "1.2");
		Produit p2 = new Produit(1, "Pomme ", "c'est bon ", "", 1, "1.2");
		Pannier panier = new Pannier(client1, 0);
		Admin admin = new Admin("lorenzo", "admin", null, null) ; 
		
		
	
		//client1.getProduit(p2);
		
		panier.ajoutPannier(p1, 12);
		panier.ajoutPannier(p2, 5);
		panier.ajoutPannier(p1, 6);
		
		panier.retirerPannier(p2, 6);
		
		panier.retirerPannier(p2, 6);
		panier.etatPannier();
		
		//admin.getPrenom();
	
		Commande c1 = new Commande(client1, null, panier.validerPanier());
		c1.getSomme();
		 
		
	}

}
