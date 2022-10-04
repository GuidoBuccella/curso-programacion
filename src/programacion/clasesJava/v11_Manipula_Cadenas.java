package programacion.clasesJava;

public class v11_Manipula_Cadenas {
    public static void main(String[] args) {

        String nombre="Guillermo Roberto Buccella";

        System.out.println("Mi nombre es " + nombre);

        System.out.println(nombre + " tiene " + nombre.length() + " letras.");

        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));

        int ultima_letra;

        ultima_letra=nombre.length();

        System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));






    }
}
