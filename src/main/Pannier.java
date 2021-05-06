package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pannier 
{
	
	// TODO  REMPLACER LES APPELLE PRODUIT PAR ID PRODUIT  POUR RENDRE  LA MAP PLUS LEGERE ET OPTI //
	private HashMap<Produit ,Integer > listeProduits = new HashMap<Produit, Integer>();
	private Client client;
	private  int id ; 
	private double prixPannier  = 0 ; 
	
	public Pannier(Client client , int id ) 
	{
		this.client = client ; 
		this.id = id ; 
		this.listeProduits = listeProduits ; 
		this.prixPannier = prixPannier ; 
			
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
			if (changement <=0 )
			{
				this.listeProduits.remove(produit);
				
				System.out.println("Produit retirer du pannier ");
			}
		
		}	
		else 
			System.out.println("Le produit "+ produit.getNom() +" n'est pas dans le panier ");	
	}
	
	public void  etatPannier()
	{
		double somme = 0 ; 
        for (Map.Entry<Produit, Integer> entry : this.listeProduits.entrySet()) 
        {
            String key = entry.getKey().getNom();
            int value = entry.getValue();
            for (Map.Entry<Produit, Integer>  i : this.listeProduits.entrySet())
            {
                somme +=  (i.getKey().getPrixHT() * i.getValue() * 1.20)  ;  
                System.out.println("le produit " +key + " x " + value);
            }
           if (somme >0 )
            {
        	   System.out.println("Votre commande est de " + somme +"€");
        	   this.prixPannier = somme ; 
            }
           else
              System.out.println("Commande inutilie  ");
            
            
           
            
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
