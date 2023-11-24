package tn.tuniprob.gestionmagasin.Exercice1prod;

public class Date {
    public int jour;
    public int mois;
    public int annee;

    public Date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
    public void Afficher_Date(){
        System.out.println("La date d'expiration :"+jour+"/"+mois+"/"+annee);
    }
}
