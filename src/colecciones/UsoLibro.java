package colecciones;

public class UsoLibro {

    public static void main(String[] args) {

        Libro libro1=new Libro("Programacion","Juan",25);
        Libro libro2=new Libro("Programacion","Juan",10);

        if (libro1.equals(libro2)){
            System.out.println("Es el mismo");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }else {
            System.out.println("No es el mismo");
            System.out.println(libro1.hashCode());
            System.out.println(libro2.hashCode());
        }
    }
}
