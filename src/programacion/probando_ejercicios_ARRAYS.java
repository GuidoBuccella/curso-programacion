package programacion;

import java.lang.*;
import java.util.*;


import static java.lang.Character.getNumericValue;

public class probando_ejercicios_ARRAYS {
    public static void main(String[] args) {

        /*int[] matriz= {3,6,-2,-5,7,3};
        System.out.println(solution(matriz));*/

        /*boolean[]  matriz={false,true,true,true,false};
        System.out.println(countTrue(matriz));*/

        /*int[] matriz = {4, 11, 6, 2, 5};
        System.out.println(countStatues(matriz));*/

        /*int [] array={5,3,15,22,4};
        System.out.println(existHigher(array,10));*/

        /*int[] array = {30, 40, 20, 5};
        System.out.println(changeEnough(array, 12.55));*/

        /*int[] array={10,4,1,4,-10,-50,32,21};
        System.out.println(differenceMaxMin(array));*/

        /*int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Tu numero de celular es " + formatPhoneNumber2(array));*/

        /*String[] array = {"i", "love", "tesh", "ilovetesh"};
        System.out.println(matchLastItem(array));*/

        //System.out.println(countVowels("AcapulcO"));

        //System.out.println(getXO("xXOoaaa"));

        //System.out.println(getDecimalPlaces("430"));

        /*int [] arrays={80,29,4,-95,-24,85};
        System.out.println(Arrays.toString(sortNumAscending(arrays)));
        System.out.println(Arrays.toString(arrays));
        int [] array={80,29,4,-95,-24,85};
        System.out.println(Arrays.toString(sortNumAscending2(null)));
        System.out.println(Arrays.toString(sortNumAscending2(array)));
        System.out.println(Arrays.toString(array));
        int [] Array={};
        System.out.println(Arrays.toString(sortNumAscending2(Array)));*/

        int[] matriz={1,1,0,3,10,10,10,10,1};
        System.out.println(maxTotal(matriz));

    }

    public static int solution(int[] inputArray) {

        int valorAlto = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++) {

            if (inputArray[i] * (inputArray[i + 1]) > valorAlto) {
                valorAlto = inputArray[i] * inputArray[i + 1];

            }
        }
        return valorAlto;

    }

    public static int countTrue(boolean[] matriz) {

        int cuenta = 0;

        for (int i = 0; i < matriz.length; i++) {

            if (matriz[i]) {

                cuenta++;
            }
        }
        return cuenta;
    }

    public static int countStatues(int[] matriz) {

        int valorBajo = Integer.MAX_VALUE;
        int valorAlto = Integer.MIN_VALUE;


        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] < valorBajo) {
                valorBajo = matriz[i];
            }
            if (matriz[i] > valorAlto) {
                valorAlto = matriz[i];
            }
        }
        int statuesAvailables = matriz.length;
        int totalNumber = valorAlto - valorBajo + 1;
        int statues = totalNumber - statuesAvailables;

        return statues;
    }

    public static boolean proveSequence(int[] sequence) {

        boolean yaBorre = false;

        for (int i = 0; i < sequence.length - 1; i++) {

            if (sequence[i] >= sequence[i + 1]) {
                if (yaBorre) {
                    return false;
                } else {
                    yaBorre = true;
                }
                if ((i != 0) && (i != sequence.length - 2) && (sequence[i - 1] >= sequence[i + 1])) {
                    return false;
                }


            }
        }
        return true;
    }

    public static boolean existHigher(int[] array, int a) {


        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                return true;
            }
        }
        return false;
    }

    public static boolean changeEnough(int[] money, double due) {

        double quarter = money[0] * 0.25;
        double dime = money[1] * 0.10;
        double nickel = money[2] * 0.05;
        double penny = money[3] * 0.01;

        double cuenta = quarter + dime + nickel + penny;

        if (due <= cuenta) {
            return true;
        }
        return false;
    }

    public static int differenceMaxMin(int[] array) {

        int smallest = Integer.MAX_VALUE;
        int biggest = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > biggest) {
                biggest = array[i];
            }
        }
        int diff = biggest - smallest;

        return diff;
    }

    public static String formatPhoneNumber(int[] array) {

        String preNumber = "(";

        for (int i = 0; i < 3; i++) {
            preNumber = preNumber + array[i];
        }
        String Number = preNumber + ") ";

        for (int i = 3; i < 6; i++) {
            Number = Number + array[i];
        }
        String CompleteNumber = Number + "-";

        for (int i = 6; i < array.length; i++) {
            CompleteNumber = CompleteNumber + array[i];
        }

        return CompleteNumber;

    }

    public static String formatPhoneNumber2(int[] array) {

        String preNumber = "(";

        for (int i = 0; i < array.length; i++) {

            preNumber = preNumber + array[i];

            if (array[i] == 3) {
                preNumber = preNumber + ") ";
            }
            if (array[i] == 6) {
                preNumber = preNumber + "-";
            }
        }
        return preNumber;
    }

    public static boolean matchLastItem(String[] array) {

        boolean coincide = false;
        String word = "";
        for (int i = 0; i < array.length - 1; i++) {

            word = word + array[i];
        }
        if (array[array.length - 1].equals(word)) {

            coincide = true;
        }
        return coincide;
    }

    public static int countVowels(String word) {
        int i = 0;
        int n = word.length();
        int intentos = 0;

        while (i < n) {
            char letter = word.charAt(i);

            if (Character.toLowerCase(letter) == 'a'
                    || Character.toLowerCase(letter) == 'e'
                    || Character.toLowerCase(letter) == 'i'
                    || Character.toLowerCase(letter) == 'o'
                    || Character.toLowerCase(letter) == 'u') {
                intentos++;
            }
            i++;
        }
        return intentos;
    }

    public static boolean getXO(String combination) {

        int i = 0;
        int n = combination.length();
        int intentosO = 0;
        int intentosX = 0;

        while (i < n) {
            char letter = combination.charAt(i);
            if (Character.toLowerCase(letter) == 'o') {
                intentosO++;
            }
            if (Character.toLowerCase(letter) == 'x') {
                intentosX++;
            }
            i++;
        }
        if (intentosO == intentosX) {
            return true;
        }
        return false;
    }

    public static int getDecimalPlaces(String word) {
        int decimalPlaces = 0;
        int i = 0;
        int n = word.length();

        while (i < n) {
            char character = word.charAt(i);
            if (character == '.') {
                decimalPlaces = word.length() - i - 1;
                return decimalPlaces;
            }
            i++;
        }
        return decimalPlaces;
    }

    public static int[] sortNumAscending(int[] array) {

        Arrays.sort(array);

        return array;
    }

    public static int[] sortNumAscending2(int[] array){

        if (array==null){
            return new int[0];
        }

        int [] newArray=new int[array.length];

        for (int i=0;i<newArray.length;i++){
            newArray[i]=array[i];
        }
        int order=0;

        for (int i=0;i<newArray.length;i++) {
            for (int j=i+1;j<newArray.length;j++){
                if(newArray[i]>newArray[j]){

                    order=newArray[i];
                    newArray[i]=newArray[j];
                    newArray[j]=order;
                }

            }
        }
        return newArray;
    }

    public static int maxTotal(int[] array){

       int [] nuevo=sortNumAscending2(array);
       int suma=0;
        for (int i=nuevo.length-5;i<nuevo.length;i++) {
            suma=nuevo[i]+suma;
        }
        return suma;
    }
}
