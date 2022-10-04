package programacion.clasesJava;

import java.util.*;
public class v16_Evalua_Edad {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad= entrada.nextInt();

        if (edad>=18){

            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }
    }
}
