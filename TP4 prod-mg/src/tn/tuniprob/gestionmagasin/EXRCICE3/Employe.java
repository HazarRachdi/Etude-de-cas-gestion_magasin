package tn.tuniprob.gestionmagasin.EXRCICE3;
import tn.tuniprob.gestionmagasin.Exercice2mg.Magasin;

public abstract class Employe {
   public  int identifiant ;
   public String nom;
   public String adresse;

   public int nbr_heures;

    public Employe(int identifiant, String nom, String adresse,int nbr_heures ) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures=nbr_heures;
    }
    public  void aff(){
        System.out.println(
                "identifiant:"+identifiant
                +"\nnom:"+nom
                +"adresse:"+adresse
                +"\nnombre d'heures"+nbr_heures
        );
    }
    public abstract double calculer_salaire();


    }

