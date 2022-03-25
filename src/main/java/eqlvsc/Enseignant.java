package eqlvsc;

public class Enseignant extends Employe {


    public Enseignant(String nom, String prenom) {
        super(nom, prenom);
    }

    /*
    *** Fonction se présenter qui affiche en console le nom et prénom, suivit du poste et salaire***
    */
    public void sePresenter(){
        System.out.println("\n***** PRESENTATION *****\nBonjour,\nJe m'appelle "+getPrenom()+", est mon nom de famille est "+getNom()+"\nJe suis Enseignant et je gagne : "+this.getSalaire());
    }

}
