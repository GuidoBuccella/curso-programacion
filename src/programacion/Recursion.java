package programacion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(recursionFactorial(5));
    }
    public static int recursionFactorial(int number){

        if (number==0||number==1){
            return 1;
        }
        return recursionFactorial(number-1)*number;
    }
}
