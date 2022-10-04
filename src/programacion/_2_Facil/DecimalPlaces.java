package programacion._2_Facil;

public class DecimalPlaces {
    public static void main(String[] args) {

        System.out.println(getDecimalPlaces("495.654649"));
    }
    public static int getDecimalPlaces(String number){

        int a=0;
        int n=number.length();
        char letter='-';
        int decimals=0;

        while (a<n){
            letter=number.charAt(a);
            if (letter=='.'){
                decimals=number.length()-a-1;
                return decimals;
            }
            a++;
        }
        return 0;
    }
}
