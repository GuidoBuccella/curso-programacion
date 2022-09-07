package poo.ejercicios;

import poo.ejercicios.people.People;
import poo.ejercicios.people.PeopleService;

public class PeopleApp {
    public static void main(String[] args) {
        People persona1=new People("John",21,23000);
        People persona2=new People("Steve",32,40000);
        People persona3=new People("Martin",16,2700);

    People[] personas={persona1,persona2,persona3};
    System.out.println("El presupuesto total es: $" + PeopleService.getButgets(personas)+"\n"+
            "Y la edad promedio es: "+ PeopleService.getAgeAvarage(personas)+ " años");
    }
}
