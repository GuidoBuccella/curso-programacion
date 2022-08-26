import javax.swing.*;
public class v18_Acceso_Aplicacion {
    public static void main(String[] args) {

        String clave="Guido123";

        String password="";

        while (clave.equals(password)==false){

            password=JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(password)==false){
                System.out.println("Contrasena incorrecta");

            }
        }
        System.out.println("Contrasena correcta, acceso permitido");

    }
}
