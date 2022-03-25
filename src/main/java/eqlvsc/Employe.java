package eqlvsc;

public abstract class Employe extends Personne {
    
    private int salaire;
    private int nbAbsencesMoisEnCours;

    public Employe(String nom, String prenom){
        super(nom, prenom);
    }

    /*
        GETTER & SETTER : nbAbsencesMoisEnCours
    */
    public int getNbAbsencesMoisEnCours() {
        return nbAbsencesMoisEnCours;
    }

    public void setNbAbsencesMoisEnCours(int nbAbsencesMoisEnCours) {
        this.nbAbsencesMoisEnCours = nbAbsencesMoisEnCours;
    }
    //EOF: GETTER & SETTER : nbAbsencesMoisEnCours

    /*
        GETTER & SETTER : salaire
    */
    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }
    //EOF: GETTER & SETTER : salaire


    /*
    *** Fonction se présenter qui affiche en console le nom et prénom, suivit du poste et salaire***
    */
    public abstract void sePresenter();

    public void demanderAugmentation(int montant){
        if (this.getNbAbsencesMoisEnCours()<=4) Ecole.augmentation(this, montant);
    }
}
