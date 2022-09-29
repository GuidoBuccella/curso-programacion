package programacion;

public class EncryptionMethod {
    int key;
    String word;
    String cipheredWord="";

    int charToInt(char word){ //INVENTADOS POR EL EJERCICIO
        return 0;
    }
    char intToChar(int number){ //INVENTADO POR EL EJERCICIO
        return '.';
    }

    public String caesarCipher(String word,int key){

        int number=0;


        key=key%27;


        for (int i=0;i<word.length();i++){
            char c=word.charAt(number);
            number++;
            int aNum= charToInt(c);
            int suma=aNum+key;
            suma=suma%27;
            char aChar= intToChar(suma);

            cipheredWord=cipheredWord+aChar;
        }


        return cipheredWord;
    }
}
