package tn.tuniprob.gestionmagasin.EXRCICE3;

public class Vendeur extends Employe{
    public int tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, int tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }
    public void aff(){
        super.aff();
        System.out.println( "le tauxDeVente :"+tauxDeVente );
    }
    public double calculer_salaire(){
        return 450*tauxDeVente;
    }
}
