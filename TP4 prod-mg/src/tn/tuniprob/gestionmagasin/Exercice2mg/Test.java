package tn.tuniprob.gestionmagasin.Exercice2mg;

import tn.tuniprob.gestionmagasin.EXRCICE3.Caisser;
import tn.tuniprob.gestionmagasin.EXRCICE3.Responsable;
import tn.tuniprob.gestionmagasin.EXRCICE3.Vendeur;
import tn.tuniprob.gestionmagasin.Exercice1prod.Produit;

public class Test {
    public static void main(String[] args) {
        Produit prod1=new Produit(1542,"Lait","Delice",800);
        Produit prod2=new Produit(2510,"Yaourt","Vitalait",500);
        Produit prod3=new Produit(3250,"Tomate","Sicam",1.200);
        Magasin MG1=new Magasin(1524,"Sousse");
        MG1.ajouter(prod1);
        MG1.ajouter(prod2);
        MG1.ajouter(prod3);
        MG1.Affch_mg();
        System.out.println("le nombre des produits du magasin"+MG1.num+" est"+MG1.nbr_produit);


    }
}



