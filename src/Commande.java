import java.util.HashMap;
import java.util.Date;

public class Commande 
{
	
 
    private Date date = new Date();

    public Commande( Client client  , Date date  , HashMap listeProduits  )
    {
         
        this.client = client ; 
        this.date = date ;
        this.listeProduits = listeProduits;

    }

    public double getSomme(HashMap listeProduits)
    {
        double somme = 0 ; 
        for (Produit i : listeProduits.keySet())
            somme +=  i.prix()  ;  // ajouter la quantiter produit pour le calul
        return somme;  
    }

  
    
}