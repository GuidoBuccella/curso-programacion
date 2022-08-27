package programacion;

public class v12_Manipula_Cadenas_2 {
    public static void main(String[] args) {

        String frase="Hoy es un dia perfecto para aprender a programar Java";

        String frase_resumen= frase.substring(0,27) + " ir a la casa de Juan..." + "y " + frase.substring(28,53);


        System.out.println(frase_resumen);


    }
}
