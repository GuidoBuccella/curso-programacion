package programacion;

import java.lang.reflect.Array;


public class NumeroCercanoArray {

    public static void main(String[] args) {
        int[] numeros={2,5,6,7,8,8,9};

        System.out.println(closestNumber(numeros,0,(numeros.length-1),6));

    }

    public static int closesNumber(int[] lista,int numero){

        int closest=Integer.MAX_VALUE;
        int closeNumber=numero;

        for (int i=0;i<lista.length;i++){

            int a;
            a=numero- lista[i];
            if (a<0){
                a=a*(-1);
            }
            if (a<closest){
                closest=a;
                closeNumber=lista[i];
            }
        }
        return closeNumber;
    }

    public static int closestNumber(int[] array,int inicio,int last, int number){

        System.out.println(inicio+"  "+ last);
        if (inicio==last){
            return array[inicio];
        }
        int middle=(inicio+last)/2;
        if (number==array[middle]){
            return number;
        }
        if (number<array[middle]) {
         return closestNumber(array,inicio,middle-1,number);
        }else {
            return closestNumber(array,middle+1,last,number);
        }

    }
}
