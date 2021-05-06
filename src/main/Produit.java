package main;

import java.util.Currency;
import java.util.HashMap;

public class Produit
    {

//ATTRIBUTS
        private int idProduit;
        private String nom;
        private String reference;
        private String libelle;
        private double prixHT;
        private int stock ; 
       

//CONSTRUCTEUR
        public Produit(int idProduitValue, String nomValue, String referenceValue, String libelleValue, double prixHTValue, int stock)
            {
                this.idProduit = idProduitValue;
                this.nom = nomValue;
                this.reference = referenceValue;
                this.libelle = libelleValue;
                this.prixHT = prixHTValue;
                this.stock = stock ;
                
            }


//GETTER & SETTER
        public int getIdProduit()
            {
                return idProduit;
            }

        public void setIdProduit(int idProduit)
            {
                this.idProduit = idProduit;
            }
        public String getReference()
            {
                return reference;
            }

        public String getNom()
            {
                return nom;
            }

        public void setNom(String nom)
            {
                this.nom = nom;
            }
        public void setReference(String reference)
            {
                this.reference = reference;
            }

        public String getLibelle()
            {
                return libelle;
            }

        public void setLibelle(String libelle)
            {
                this.libelle = libelle;
            }

        public double getPrixHT()
            {
                return prixHT;
            }

        public void setPrixHT(double prixHT)
            {
                this.prixHT = prixHT;
            }
       
    }