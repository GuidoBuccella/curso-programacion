package programacion._2_Facil;

import javax.swing.*;

public class probandoEjercicios {
    public static void main(String[] args) {

        //System.out.println(checkEnding("Mariposa","posa"));
        //System.out.println(discount(1500.345,20.23));
        //System.out.printf("Debes recargar " + (calculateFuel()) + " litros de combustible");
        //System.out.println(canCapture("A8","A9"));
        //System.out.println(fizzBuzz(15));
        //System.out.println(equal(2, 1, 2));
    }

    public static boolean checkEnding(String a, String b) {


        String finalA = a.substring(a.length() - b.length());

        return finalA.equals(b);

    }

    public static double discount(double price, double discount) {

        double finalPrice = price - (discount * price) / 100;

        return ((double) Math.round(finalPrice * 100)) / 100;
    }

    public static double calculateFuel() {

        double distance = 1;

        do {
            distance = Double.parseDouble(JOptionPane.showInputDialog("Cuantos km de distancia tenes que recorrer?"));
        } while (distance <= 0);

        double recarga=0;

        if (distance > 10) {
            recarga = 10 * distance;
        } else if (distance <= 10) {
            recarga = 100;
        }
        return recarga;
    }

    public static boolean canCapture(String Rook1, String Rook2) {

        String firstLetter1 = Rook1.substring(0, 1);
        String secondLetter1= Rook1.substring(1,2);
        String firstLetter2= Rook2.substring(0,1);
        String secondLetter2= Rook2.substring(1,2);

        boolean canAttack = firstLetter1.equalsIgnoreCase(firstLetter2)||secondLetter1.equalsIgnoreCase(secondLetter2);

        return canAttack;

    }

    public static String fizzBuzz(int a) {


        if (a % 3 == 0 && a % 5 == 0) {

            return "FizzBuzz";

        }
        if (a % 3 == 0) {

            return "Fizz";
        }

        if (a % 5 == 0) {

            return "Buzz";
        }


        String resto = Integer.toString(a);

        return resto;


    }

    public static String fizzBuzz2(int a) {

        String result = "";

        if (a % 3 == 0 || a % 5 == 0) {
            if (a % 3 == 0) {
                result += "Fizz";
            }
            if (a % 5 == 0) {
                result += "Buzz";
            }
        } else {
            result = Integer.toString(a);
        }

        return result;
    }

    public static int equal(int a, int b, int c) {

        int contador = 0;

        if (a == b && b == c) {

            contador = 3;
        } else if (a == b || b == c || c == a) {

            contador = 2;
        }

        return contador;

    }





}
