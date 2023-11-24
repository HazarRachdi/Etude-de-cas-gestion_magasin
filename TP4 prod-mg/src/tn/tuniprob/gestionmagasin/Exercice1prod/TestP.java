package tn.tuniprob.gestionmagasin.Exercice1prod;

public class TestP {
    public static void main(String[] args) {
        Produit p1=new Produit();
        Produit p2=new Produit(1021,"Lait","Delice");
        Produit p3=new Produit(2510,"Yaourt","Vitalait");
        Produit p4=new Produit(3250,"Tomate","Sicam",1.200);
        p1.Afficher();
        p2.Afficher();
        p3.Afficher();
        p4.Afficher();
        p2.setPrix(0.700);
        p2.Afficher();
        p3.setPrix(0.400);
        p1.setIdentifiant(5468);
        p1.setLibellé("Fromage");
        p1.setMarque("Delice");
        p1.setPrix(300);
        p3.Afficher();
        p1.Afficher();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        p1.setDate_expiration(new Date(28,05,2023));
        p2.setDate_expiration(new Date(15,03,2023));
        p3.setDate_expiration(new Date(19,05,2023));
        p4.setDate_expiration(new Date(24,02,2023));
        p1.getDate_expiration().Afficher_Date();
        p2.getDate_expiration().Afficher_Date();
        p3.getDate_expiration().Afficher_Date();
        p4.getDate_expiration().Afficher_Date();
        System.out.println("les deux produits sont:"+p1.Comparer(p1));
        System.out.println("les deux produits sont:"+p1.Comparer(p1,p2));

    }
}
