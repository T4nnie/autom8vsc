package eqlvsc;

public class Personne {

    private String nom;
    private String prenom;

    public Personne(String nom, String prenom){
        this.nom = nom ;
        this.prenom = prenom;
    }

    /*
    *** GETTER***
    */
    public String getNom(){
        return this.nom;
    }

    public String getPrenom(){
        return this.prenom;
    }
    
}
