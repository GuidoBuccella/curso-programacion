import javax.swing.*;

public class JuancitoFInalTest {
    public static void main(String[] args) {

        boolean sosHombre= v20_Peso_Ideal.sosHombre();

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Que edad tienes?"));


        boolean podesPasar = Patova(sosHombre, edad);

        if (podesPasar) {
            System.out.println("Podes Pasar");
        } else {
            System.out.println("No podes pasar");
        }
    }

    public static boolean Patova(boolean sosHombre, int edad) {

        if (sosHombre == true) {

            if (edad >= 21) {

                return true;
            }
        } else {

            if (edad >= 18) {

                return true;
            }
        }
        return false;

    }


}
