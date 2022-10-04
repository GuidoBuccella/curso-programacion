package programacion.clasesJava;

import java.util.Scanner;

public class v14_Entrada_Ejemplo_1 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("introduce tu nombre, por favor");

        String nombre_usuario= entrada.nextLine();

        System.out.println("Introduce edad, por favor");

        int edad=entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + " El ano que viene tendras " + (edad+1) + " anos");





    }
}
