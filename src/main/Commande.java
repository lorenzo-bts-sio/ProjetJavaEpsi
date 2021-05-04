package main;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;

public class Commande 
{
	
 
    private Date date = new Date();
    private HashMap<Produit, Integer> listeProduits;
	private Client client;

    public Commande( Client client  , Date date  , HashMap listeProduits  )
    {
         
        this.client = client ; 
        this.date = date ;
        this.listeProduits = listeProduits;

    }

    public double getSomme()
    {
        double somme = 0 ; 
        for (Map.Entry<Produit, Integer>  i : this.listeProduits.entrySet() )
        {
            somme +=  (i.getKey().getPrixHT() * i.getValue() * 1.20)  ;  
            System.out.println("Votre commande est de " + somme +"€");
        }
        return somme;  
    }
    
    public void validerCommande()
    {
    	System.out.println("Commande valider ");
    	client.setCommande(true);
    }

    public void commanderecue()
    {
    	System.out.println("Heureux que vous avez recue votre commande ");
    	client.setCommande(false);
    }
//  //Soldes
//  public void reductionObtenue(int reductionValue, int prixredduit)
//  {
//       prixreduit = prixHT * reductionValue;
//      return;
//  }
//
////TVA
//  public void tvaApliquée(Currency tvaValue, Currency prixttc)
//  {
//
//      prixTTC = prixHT * tvaValue;
//      return;
//  }
    
}