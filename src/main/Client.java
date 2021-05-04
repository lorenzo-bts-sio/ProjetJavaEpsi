package main;
import java.util.Date;

public class Client
{
	private int id ;
    private String nom  = "Inconu"; 
    private String prenom  = "Inconu" ; 
    private String email = "Inconu" ;
    private Date dateNaissance = null  ; 
    private boolean commande = false ; 
    private boolean actif = true ; 

    public Client( int id ,String nom , String prenom , String email , Date dateNaissance )
    {
        this.id = id ;
    	this.nom = nom ;
        this.prenom = prenom ;
        this.email = email ; 
        this.dateNaissance = dateNaissance ;
    }

    
    //  MÉTHODE LIER AU PRODUIT 
    public void getProduit(Produit produit)
    {
    	System.out.println(getnomProduit(produit));
    	System.out.println(getReference(produit));
    	System.out.println(getPrixHT(produit));
    	
    	
    	
    	
    }
    public String  getnomProduit(Produit produit)
    
    {
    	return produit.getNom();
    	
    }
    public String  getReference(Produit produit)
    
    {
    	return produit.getReference();
    	
    }
    public String  getlibelle(Produit produit)
    
    
    {
    	return produit.getLibelle();
    	
    }
    public double getPrixHT(Produit produit)
    {
    	return produit.getPrixHT();
    }
    
    
    
     // GETTERS  ET SETTERS 
    
    public int getId()
    {
    	return this.id ; 
    }
    public String getNom()
    {
        return this.nom;
    }
    public String getPrenom()
    {
        return this.prenom;
    }
    public void getEmail()
    {
        System.out.println(this.email);
    }
    
    public void setNom(String nom )
    {
        this.nom = nom ; 
    }
  
   
    public void setEmail(String email)
    {
       this.email = email ; 
    }


	public boolean getCommande() {
		return commande;
	}


	public void setCommande(boolean commande) {
		this.commande = commande;
	}


	public boolean getActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}
    
}