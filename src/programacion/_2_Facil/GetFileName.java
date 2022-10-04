package programacion._2_Facil;

public class GetFileName {

    public static void main(String[] args) {

        System.out.println(getTheFileName("sdiufhjsd/nombre.del.archivo"));
    }

    public static String getTheFileName(String line){

        int n=line.length();
        int i=0;
        String name="";

        while (i<n){
           char reverse=line.charAt(n-i-1);
           if (reverse=='/'){

               name=line.substring(n-i,n);
               return name;
           }
           i++;
        }
       return line;
    }
}
