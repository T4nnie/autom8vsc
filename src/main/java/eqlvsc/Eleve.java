package eqlvsc;

public class Eleve extends Personne {

    private agePossible age;
    private boolean absent;
    private NiveauClasse niveauClasse;

    //Constructor
    public Eleve(String nom, String prenom, agePossible age){
        super(nom, prenom);
        this.age = age;
    }

    public Eleve(String nom, String prenom, byte age) throws ExceptionAgeNonValide{
        super(nom, prenom);
        if(age<6) throw new ExceptionAgeNonValide("Trop jeune");
        else if (age>10) throw new ExceptionAgeNonValide("Trop vieux");
        switch(age){
            case (byte) 6 : this.age = agePossible.SIX; break;
            case (byte) 7 : this.age = agePossible.SEPT; break;
            case (byte) 8 : this.age = agePossible.HUIT; break;
            case (byte) 9 : this.age = agePossible.NEUF; break;
            case (byte) 10 : this.age = agePossible.DIX; break;
        }
    }


    /*
    ***SETTER***
    */
    public void setAbsent(boolean abs){
        this.absent = abs ;
    }

    public void setNiveau_classe(NiveauClasse niveau){
        this.niveauClasse = niveau;
    }
    
    /*
    ***Getter***
    */
    public boolean getAbsent(){
        return this.absent;
    }

    public NiveauClasse getNiveauClasse(){
        return this.niveauClasse;
    }

    public byte getAge(){
        return this.age.getValue() ;
    }


    public void apprendre(){

    }
    
}
