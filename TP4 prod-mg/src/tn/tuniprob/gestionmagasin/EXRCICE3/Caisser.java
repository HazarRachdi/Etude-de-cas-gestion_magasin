package tn.tuniprob.gestionmagasin.EXRCICE3;

public class Caisser extends Employe {
    public int numeroDeCaisse;

    public Caisser(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public void aff(){
        super.aff();
        System.out.println( "le numero de caisse:"+numeroDeCaisse);
    }
    public double calculer_salaire(){
        double salaire=nbr_heures*5;
        if (nbr_heures>180){
            return salaire+(salaire*0.15);
        }else{
            return salaire;
        }
    }
}
