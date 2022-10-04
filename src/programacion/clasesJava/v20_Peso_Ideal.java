package programacion.clasesJava;

import javax.swing.*;
import java.lang.*;

public class v20_Peso_Ideal {
    public static void main(String[] args) {


        boolean tuGenero=sosHombre();

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Cuantos centimetros medis?"));

        int tuPeso= PesoFinal(tuGenero, altura);

        System.out.println("Tu peso ideal es " + tuPeso + "kg");
    }

    public static int PesoFinal(boolean sosHombre, int altura) {

        int pesoIdeal;

        if (sosHombre) {

            pesoIdeal = altura - 110;

        } else {

            pesoIdeal = altura - 120;

        }
        return pesoIdeal;
    }



    public static boolean sosHombre() {

        String hombre = "hombre";
        String mujer = "mujer";
        String genero = "";


        while (genero.equalsIgnoreCase(hombre) == false && genero.equalsIgnoreCase(mujer) == false) {

            genero = JOptionPane.showInputDialog("Cual es tu genero, hombre o mujer?");
        }


        if (genero.equalsIgnoreCase(hombre)) {
            return true;
        } else {
            return false;
        }





    }
}

