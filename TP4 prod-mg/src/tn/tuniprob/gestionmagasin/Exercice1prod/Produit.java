package tn.tuniprob.gestionmagasin.Exercice1prod;

public class Produit {
    private int identifiant;
    private String libellé;
    private String marque;
    private Date date_expiration;
    private double prix;
    public static int nbr;

    public Produit() {
        nbr++;
    }

    public Produit(int identifiant, String libellé, String marque) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        nbr++;
    }

    public Produit(int identifiant, String libellé, String marque, double prix) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        this.prix = prix;
        nbr++;


    }

    public Produit(int identifiant, String libellé, String marque, Date date_expiration, double prix) {
        this.identifiant = identifiant;
        this.libellé = libellé;
        this.marque = marque;
        this.date_expiration = date_expiration;
        this.prix = prix;
        nbr++;
    }

    public void Afficher(){
        System.out.println("l'identifiant:"+identifiant+"\nlibellé:"+libellé+"\nLa marque:"+marque+"\nPrix:"+prix);
    }

    @Override
    public String toString() {
        return "Produit{" +
                "identifiant=" + identifiant +
                ", libellé='" + libellé + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibellé() {
        return libellé;
    }

    public void setLibellé(String libellé) {
        this.libellé = libellé;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Date getDate_expiration() {
        return date_expiration;
    }

    public void setDate_expiration(Date date_expiration) {
        this.date_expiration = date_expiration;
    }
    public boolean Comparer(Produit pro){
        return identifiant==pro.identifiant && libellé==pro.libellé && prix==pro.prix;
    }
    public boolean Comparer(Produit pro1,Produit pro2){
        return pro1.identifiant==pro2.identifiant && pro1.libellé==pro2.libellé && pro1.prix==pro2.prix;
    }



}
