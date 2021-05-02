import java.util.HashMap;
import java.util.Map;

public class Pannier 
{
	
	// TODO  REMPLACER LES APPELLE PRODUIT PAR ID PRODUIT  POUR RENDRE  LA MAP PLUS LEGERE ET OPTI //
	private HashMap<Produit ,Integer > listeProduits = new HashMap<Produit, Integer>();
	private Client client;
	private  int id ; 
	
	public Pannier(Client client , int id ) 
	{
		this.client = client ; 
		this.id = id ; 
		this.listeProduits = listeProduits ; 
			
	}

	
	public  void ajoutPannier( Produit produit, int quantiter)
    {
		
		if (this.listeProduits.get(produit)!=null)	
			
			this.listeProduits.replace(produit, this.listeProduits.get(produit) + quantiter);
		else 
			this.listeProduits.put(produit, quantiter);		
    }
	
	public void  retirerPannier(Produit produit , int quantiter)
	{
		if (this.listeProduits.get(produit)!=null)	
		{
			int changement = this.listeProduits.replace(produit, this.listeProduits.get(produit) - quantiter);
			if (changement >=0 )
			{
				this.listeProduits.remove(produit);
			}
		
		}	
		else 
			System.out.println("Le produit "+ produit.getNom() +" n'est pas dans le panier ");	
	}
	
	public void etatPannier()
	{
		
        for (Map.Entry<Produit, Integer> entry : listeProduits.entrySet()) 
        {
            String key = entry.getKey().getNom();
            int value = entry.getValue();
            System.out.println("le produit " +key + " x " + value);
        }
	}
	
	public HashMap validerPanier()
	{
		if (this.listeProduits !=null)
		{
			System.out.println("Validation du panier ");
			return listeProduits ; 
		}
		else
		{
			System.out.println("votre pannier est vide ");
			return null ; 
		}
	}
	
	
}	
