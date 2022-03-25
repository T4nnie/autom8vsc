package eqlvsc;

public final class Ecole {
    
    /*
    Prends un employé et un montant en paramètre augment l'employé du montant
    */
    public static void augmentation(Employe e, int montant){
        e.setSalaire(e.getSalaire()+montant);
    }

    /*
    Assigne un niveau de classe à un élève en fonction de son age
    */
    public static void assigneClasse(Eleve e){

        switch (e.getAge()){
            case 6 : e.setNiveau_classe(NiveauClasse.CP);break;
            case 7 : e.setNiveau_classe(NiveauClasse.CE1);break;
            case 8 : e.setNiveau_classe(NiveauClasse.CE2);break;
            case 9 : e.setNiveau_classe(NiveauClasse.CM1);break;
            case 10: e.setNiveau_classe(NiveauClasse.CM2);break;
        }

    }

}
