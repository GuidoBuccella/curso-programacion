package poo.coche;

import javax.swing.*;

public class Uso_Vehiculo {
    public static void main(String[] args) {

        /*Coche miCoche=new Coche();//INSTANCIAR UNA CLASE; EJEMPLAR DE UNA CLASE

        miCoche.establece_color(JOptionPane.showInputDialog("Introduce color del coche"));

        System.out.println(miCoche.dime_datos_generales());

        System.out.println(miCoche.dimeColor());

        miCoche.setAsientos_cuero(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        System.out.println(miCoche.isAsientos_cuero());

        miCoche.setClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        System.out.println(miCoche.isClimatizador());

        System.out.println(miCoche.dime_peso_coche());

        System.out.println("El precio final del coche es: " + miCoche.precio_coche());

        //System.out.println("Este coche tiene " + Renault.ruedas + " ruedas");*/

        Coche auto1=new Coche();

        auto1.establece_color("azul");

        Furgoneta furgoneta1=new Furgoneta(7,580);

        furgoneta1.establece_color("rojo");
        furgoneta1.setAsientos_cuero("Si");
        furgoneta1.setClimatizador("Si");

        System.out.println(auto1.dime_datos_generales() +"\n"+auto1.dime_peso_coche());

        System.out.println(furgoneta1.dime_datos_generales()+"\n"+furgoneta1.getDatosFurgoneta());
    }
}
