public class probandoEjercicios2 {

    public static void main(String[] args) {
        //System.out.println(centurySolution(1901));
        //System.out.println(solution("neuquen"));
        //System.out.println(reverse("Juan es un crack"));
        //System.out.println(capicua("neuquen"));
        //System.out.println(stutter("Que culeado sos"));
        //System.out.println(solutionPolygon(5));


    }

    public static int centurySolution(int year) {

        int century = (year - 1) / 100 + 1;
        return century;
    }

    public static boolean solutionCapicua(String inputString) {

        int i = 0;
        int n = inputString.length();


        while (i < n / 2) {

            boolean cadena = inputString.charAt(i) != (inputString.charAt(n - 1 - i));

            i = i + 1;

            if (cadena) {
                return false;
            }

        }

        return true;
    }

    public static String reverse(String word) {

        int i=0;
        int n=word.length();
        String reverse="";

        while (i<n) {
            char reverseWord= word.charAt(n-i-1);
            reverse= reverse+reverseWord;
            i++;
        }
        return reverse;
    }

    public static boolean capicua(String etiquetaCajita) {

       boolean Capi= etiquetaCajita.equals(reverse(etiquetaCajita));

       return Capi;

    }

    public static String stutter(String word) {

        String stutter= word.substring(0,2) + "... ";

        String stuttering= stutter + stutter + word + "!";

        return stuttering;
    }

    public static int solutionPolygon(int n){

        int area=(int)Math.pow(n,2)+(int)Math.pow(n-1,2);

        return area;



    }


}
