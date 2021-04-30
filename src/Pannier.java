import java.util.HashMap;
import java.util.Map;

public class Pannier 
{
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
        this.listeProduits.put(produit, quantiter);
        
    }
	public void  retirerPannier(Produit produit , int quantiter)
	{
		
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
	
}	
