package programacion;

import java.util.*;
public class v20_AdivinaNumero2_Do_While {
    public static void main(String[] args) {

        int aleatorio=(int)(Math.random()*100);

        Scanner entrada=new Scanner(System.in);

        int numero=0;
        int intentos=0;

        do {
            intentos++;

            System.out.println("introduce un numero, por favor");

            numero=entrada.nextInt();

            if(aleatorio<numero) {

                System.out.println("Mas bajo");
            }

            else if(aleatorio>numero) {

                System.out.println("Mas alto");
            }
        } while (numero != aleatorio);

        System.out.println("Numero Correcto, lo has logrado en " + intentos + " intentos");


    }
}

