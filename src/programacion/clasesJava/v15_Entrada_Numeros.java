package programacion.clasesJava;

import javax.swing.*;
public class v15_Entrada_Numeros {
    public static void main(String[] args) {

        String num1=JOptionPane.showInputDialog("Introduce un nùmero");

        double num2=Double.parseDouble(num1);

        System.out.print("La raiz de " + num2 + " es ");

        System.out.printf("%1.2f",Math.sqrt(num2));


    }
}
