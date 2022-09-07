package poo.ejercicios.people;

import poo.ejercicios.people.People;

public class PeopleService {
    public static int getButgets(People[] personas){
        int butgetTotal=0;
        for (int i=0;i< personas.length;i++){
            butgetTotal=butgetTotal +personas[i].getBudget();
        }
        return butgetTotal;
    }
    public static int getAgeAvarage(People[] personas){
        int ageAvarage=0;
        int totalAge=0;
        for (int i=0;i<personas.length;i++){
            totalAge=totalAge+personas[i].getAge();
        }
        ageAvarage=totalAge/ personas.length;
        return ageAvarage;
    }

}
