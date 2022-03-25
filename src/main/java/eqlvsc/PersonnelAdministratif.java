package eqlvsc;

public class PersonnelAdministratif extends Employe {
    
    public PersonnelAdministratif(String nom, String prenom) {
        super(nom, prenom);
    }

    /*
    *** Fonction se présenter qui affiche en console le nom et prénom, suivit du poste et salaire***
    */
    public void sePresenter(){
        System.out.println("\n***** PRESENTATION *****\nBonjour,\nJe m'appelle "+getPrenom()+", est mon nom de famille est "+getNom()+"\nJe suis du personnel administratif et je gagne : "+this.getSalaire());
    }
}
