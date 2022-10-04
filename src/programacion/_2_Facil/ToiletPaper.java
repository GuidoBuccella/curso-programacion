package programacion._2_Facil;

public class ToiletPaper{
    public static void main(String[] args) {

        System.out.println(tpChecker(3,4));
    }

    public static String tpChecker(int people,int rolls) {
        double dia = (rolls * 500) / (people * 57);

        if (dia<14)
            return "Tu papel higienico te alcanza para al menos "+dia+" dias, comprá mas!";
        else return "Tu papel higienico te alcanza para al menos " + dia+" dias, no te preocupes";
    }
}
