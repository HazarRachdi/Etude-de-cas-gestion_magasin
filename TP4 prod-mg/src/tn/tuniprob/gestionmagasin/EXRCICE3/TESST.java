package tn.tuniprob.gestionmagasin.EXRCICE3;

import tn.tuniprob.gestionmagasin.Exercice1prod.Produit;
import tn.tuniprob.gestionmagasin.Exercice2mg.Magasin;

public class TESST {
    public static void main(String[] args) {
        Magasin Carrefour=new Magasin(1225,"Centre-Ville");
        Magasin Monoprix=new Magasin(1356,"Menzah6");
        //int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse
        Caisser C1=new Caisser(4,"hazar","bouzid",7,2);
        Caisser C2=new Caisser(2,"wael","kasserine",3,4);
        Vendeur V1=new Vendeur(8,"naziha","sousse",4,5);
        Responsable R1=new Responsable(1254,"assma","nabel",5,65);

        Caisser C3=new Caisser(3,"maryem","jandouba",4,6);
        Vendeur V2=new Vendeur(7,"ahmed","monastir",4,9);
        Vendeur V3=new Vendeur(6,"chayma","kef",6,4);
        Vendeur V4=new Vendeur(3,"bourak","gafsa",5,4);
        Responsable R2=new Responsable(3,"hajer","kairouan",4,32);
        Carrefour.AjouterEmp(C1);
        Carrefour.AjouterEmp(C2);
        Carrefour.AjouterEmp(V1);
        Carrefour.AjouterEmp(R1);
        Monoprix.AjouterEmp(C3);
        Monoprix.AjouterEmp(V2);
        Monoprix.AjouterEmp(V3);
        Monoprix.AjouterEmp(V4);
        Monoprix.AjouterEmp(R2);
        System.out.println("les donnes des employers de careefour");
        int i;
        for(i=0;i<Carrefour.nbr_employers;i++){
            Carrefour.Emp[i].aff();
        }
        System.out.println("les donnes des employers de monoprix");
        for(i=0;i< Monoprix.nbr_employers;i++){
            Monoprix.Emp[i].aff();
        }
        Produit produitt1=new Produit(12,"lait","vitalait");
        Produit produitt2=new Produit(1,"yaourt","delice");
        Produit produitt3=new Produit(4,"yaourt","vitalait");
        Carrefour.ajouter(produitt1);
        Carrefour.ajouter(produitt2);
        Carrefour.ajouter(produitt3);
        Monoprix.ajouter(produitt1);
        Monoprix.ajouter(produitt2);
        Monoprix.ajouter(produitt3);
        Monoprix.Affch_mg();
        Carrefour.Affch_mg();
        System.out.println("les differents salaires des emlpoyers du carrefour");
        for(i=0;i<Carrefour.nbr_employers;i++){
            System.out.println(Carrefour.Emp[i].nom+""+Carrefour.Emp[i].calculer_salaire());
        }
        System.out.println("les differents salaires des emlpoyers du monoprix");
        for(i=0;i<Carrefour.nbr_employers;i++){
            System.out.println(Monoprix.Emp[i].nom+""+Monoprix.Emp[i].calculer_salaire());
        }

    }

}


