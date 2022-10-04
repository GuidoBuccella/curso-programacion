package programacion._2_Facil;

public class TheFibonacciNumber {
    public static void main(String[] args) {
        //System.out.println(fibonacciNumber(12));

        System.out.println(fibonacci(12));
    }

    public static int fibonacciNumber(int number){

        int fibonacci=0;
        int contador=1;

        if (number==0||number==1){
            return 1;
        }
        int a = 1;
        int b = 1;
        while(contador!=number){
            fibonacci = a + b;
            contador++;
            a = b;
            b = fibonacci;
        }return fibonacci;
    }

    public static int fibonacci(int number){

        if (number==0||number==1){
            return 1;
        }
        return fibonacci(number-1)+fibonacci(number-2);
    }
}



