package programacion;

import javax.swing.*;

public class v22_Comprueba_Mail {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto=false;

        String mail = JOptionPane.showInputDialog("Introduce tu mail");

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {

                arroba++;

            }
            if (mail.charAt(i)=='.'){
                punto=true;
            }

        }
        if (arroba == 1 && punto) {

            System.out.println("Es correcto");

        } else {
            System.out.println("No es correcto");
        }


    }
}
