package programacion._3_Intermedio;

public class EncodedStringParse {

    public static Encode parseCode(String code){

        /*int word=1;
        String first="";
        String second="";
        String third="";

        for (int i=0;i<code.length();i++){

            if (code.charAt(i)!='0'){
                if (word==1){
                    first+=code.charAt(i);
                }
                if (word==2){
                    second+=code.charAt(i);
                }
                if (word==3){
                    third+=code.charAt(i);
                }
            }else {
                while (code.charAt(i)=='0'){
                    i++;
                }
                word++;
                i--;
            }
        }
        Encode hhh=new Encode(first,second,third);*/

        String[] array={"","",""};
        int word=0;
        for (int i=0;i<code.length();i++){

            if (code.charAt(i)!='0'){
                array[word]+=code.charAt(i);
            }else {
                while (code.charAt(i)=='0'){
                    i++;
                }
                word++;
                i--;
            }
        }
        Encode hhh=new Encode(array[0],array[1],array[2]);
        return hhh;
    }
}
