package eqlvsc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class CaTest {

    private static Logger log = LoggerFactory.getLogger(CaTest.class);

    /*
    *** Test des GET & SET de l'absence d'un élève ***
    */
    @Test
    public void testAbsence(){
        //instanciation d'un objet élève
        Eleve el = new Eleve("Makhno", "Nestor", agePossible.SIX);

        //on met la variable absence de l'objet en "true"
        el.setAbsent(true);

        //on affiche la valeur dans la console
        log.trace("la valeur de l'absence : "+el.getAbsent());

        //On vérifie que la variable absent est bien "True"
        assertTrue(el.getAbsent());
    }

    /*
    ***  Test des SET & GET nbdrAbsenceEnCours d'un Personnel Administratif ***
    */
    @Test
    public void testNbAbsenceEnCours_PA(){
        //instanciation d'un Personnel Administratif
        PersonnelAdministratif en = new PersonnelAdministratif("Makhno", "Nestor");

        int nbrAbsence = 7;
        //set setNbAbsencesMoisEnCours
        en.setNbAbsencesMoisEnCours(nbrAbsence);

        //vérification du nbrAbsence
        assertEquals(en.getNbAbsencesMoisEnCours(), nbrAbsence);

    }

    /*
    ***  Test des SET & GET nbdrAbsenceEnCours d'un Enseignant ***
    */
    @Test
    public void testNbAbsenceEnCours_En(){
        //instanciation d'un Enseignant
        Enseignant en = new Enseignant("Makhno", "Nestor");

        int nbrAbsence = 5;
        //set setNbAbsencesMoisEnCours
        en.setNbAbsencesMoisEnCours(nbrAbsence);


        //vérification du nbrAbsence
        assertEquals(en.getNbAbsencesMoisEnCours(), nbrAbsence);


    }

    /*
    ***  Test des SET & GET d'un salire d'un Personnel Administratif ***
    ***  Test de l'augmentation d'un Personnel Administratif d'une école ***
    */
    @Test
    public void testSalaireEtAugmentation_PA(){
         //instanciation d'un Personnel administratif
        PersonnelAdministratif pa = new PersonnelAdministratif("Makhno", "Nestor");

        //salaire établi et attribué
        int salaire = 3000;
        pa.setSalaire(salaire);

        pa.sePresenter();
        
        //verification du salaire donné au départ
        assertEquals(pa.getSalaire(), salaire);

        //augmentation établie et donnée
        int augmentation = 500;
        Ecole.augmentation(pa, augmentation);

        pa.sePresenter();

        //vérification de l'augmentation
        assertEquals(pa.getSalaire(), salaire+augmentation);
    }

    /*
    ***  Test des SET & GET d'un salire d'un Enseignant ***
    ***  Test de l'augmentation d'un Enseignant d'une école ***
    */
    @Test
    public void testSalaireEtAugmentation_En(){
         //instanciation d'un Enseignant
        Enseignant en = new Enseignant("Makhno", "Nestor");

        //salaire établi et attribué
        int salaire = 4000;
        en.setSalaire(salaire);

        en.sePresenter();
        
        //verification du salaire donné au départ
        assertEquals(en.getSalaire(), salaire);

        //augmentation établie et donnée
        int augmentation = 800;
        Ecole.augmentation(en, augmentation);

        en.sePresenter();

        //vérification de l'augmentation
        assertEquals(en.getSalaire(), salaire+augmentation);
    }

    @Test
    public void testMiseANiveau(){
        Eleve el = new Eleve("Chirac","Jacques", agePossible.SEPT);
        el.setNiveau_classe(NiveauClasse.CE2);
        log.trace(el.getPrenom() +" est en " + el.getNiveauClasse());

        assertEquals(el.getNiveauClasse(), NiveauClasse.CE2);

        el.setNiveau_classe(NiveauClasse.CM1);

        log.trace(el.getPrenom() +" est en " + el.getNiveauClasse());

        assertEquals(el.getNiveauClasse(), NiveauClasse.CM1);
    }

    @Test
    public void testAssignation(){
        Eleve el = new Eleve("Tapis","Bernard",agePossible.NEUF);
        Ecole.assigneClasse(el);

        log.trace(el.getNiveauClasse().toString());

        assertEquals(el.getNiveauClasse(), NiveauClasse.CM1);
    }



    @Test
    public void testList(){
        /*
        *Instanciation de 4 Enseignant et 3 Personnel administratif*
        */
        String[] noms = {"Lundi","Martedi","Mercurdi","Jovedi","Venerdi","Saturdi","Soldi"};
        String[] prenoms = {"premidi","duodi","tridi","quartidi","quintidi","sextidi","septidi"};
        List<Employe> coll = new ArrayList<Employe>();
        for(byte i=0;i<4;i++){ coll.add(new Enseignant(noms[i],prenoms[i])) ;}
        for(byte i=4;i<7;i++){ coll.add(new PersonnelAdministratif(noms[i],prenoms[i])) ;}

        coll.forEach(e->e.sePresenter());   
    }


    @Test
    public void testErreurAge(){
        Eleve el = null;

        //boolean pour tracer qu'on passe bien par les catch
        boolean a = false ;

        try{
            el = new Eleve("Mozart", "Wolfgang", (byte)12);
        }catch(ExceptionAgeNonValide e){log.warn(e.getMessage()); a = true;}

        assertTrue("un eleve trop vieux a bien déclenché une exception", a);

        a = false ;

        try{
            el = new Eleve("Mozart", "Wolfgang", (byte)4);
        }catch(ExceptionAgeNonValide e){log.warn(e.getMessage()); a = true;}

        assertTrue("un eleve trop jeune a bien déclenché une exception", a);
;

        try{
            el = new Eleve("Mozart", "Wolfgang", (byte)8);
        }catch(ExceptionAgeNonValide e){log.error(e.getMessage());}

        assertFalse(el.equals(null));
    }
}
