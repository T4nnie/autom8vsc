package eqlvsc;

import java.util.logging.Logger;

public class Enseignant extends Employe {

    static Logger log = Logger.getLogger(Enseignant.class.getName());

    public Enseignant(String nom, String prenom) {
        super(nom, prenom);
    }

    /*
    *** Fonction se présenter qui affiche en console le nom et prénom, suivit du poste et salaire***
    */
    public void sePresenter(){
        log.info("\n***** PRESENTATION *****\nBonjour,\nJe m'appelle "+getPrenom()+", est mon nom de famille est "+getNom()+"\nJe suis Enseignant et je gagne : "+this.getSalaire());
    }

}
