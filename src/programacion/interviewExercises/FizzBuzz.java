package programacion.interviewExercises;

import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args) {
        //System.out.println(fizzBuzz1(15));
        //System.out.println(fizzBuzz2(15));
        fizzBuzz3(100);

    }

    /*public static String fizzBuzz1(int a) {

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
    }*/

    /*public static String fizzBuzz2(int number){

        String word="";

        if (number%3==0){
            word=word+"Fizz";

        }
        if (number%5==0) {
            word=word+"Buzz";
        }
        if (word==""){
            return ""+number;
        }else return  word;
    }*/

    public static void fizzBuzz3(int num){

        for (int i = 1; i <= num; i++)
        {
            if (((i % 5) == 0) && ((i % 3) == 0)) // Is it a multiple of 5 & 3?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 3) == 0) // Is it a multiple of 3?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 3
        }
    }
    public static void fizzBuzz4(){
        IntStream.rangeClosed(1, 100).mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }


}
