package tn.tuniprob.gestionmagasin.EXRCICE3;

public class Responsable extends Employe {
    public double prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, double prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }
    public void aff(){
        super.aff();
        System.out.println( "le prime:"+prime);
    }
    public double calculer_salaire(){
        double salaire=nbr_heures*10;
        if (nbr_heures>160){
            return salaire+(salaire*0.2);
        }else{
            return salaire;
        }
    }

}
