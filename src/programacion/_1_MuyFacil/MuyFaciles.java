package programacion._1_MuyFacil;

public class MuyFaciles {
    public static void main(String[] args) {
        //System.out.println(giveMeSomething(30));
        //System.out.println(lessThan100(35,55));
        //System.out.println(helloName("Guido"));
    }

    public static int giveMeSomething(int age) {

        int edadDias = age * 365;


        return edadDias;
    }

    public static boolean lessThan100(int a, int b) {

        return a + b < 100;
    }

    public static String helloName(String name) {

        String greetings = "Hello " + name;

        return greetings;
    }
}
