package poo.empleado;

public class Id_Empleado {
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Juan");
        Empleados trabajador2 = new Empleados("Guido");
        Empleados trabajador3 = new Empleados("Eliana");
        Empleados trabajador4 = new Empleados("Rodolfo");
        trabajador3.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
                trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());

        System.out.println(Empleados.dameIdSiguiente());

    }
}

class Empleados {

    private final String nombre;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;

    public Empleados(String nom) {                   //CONSTRUCTOR
        nombre = nom;
        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }

    public void cambiaSeccion(String seccion) {      //GETTER
        this.seccion = seccion;
    }

    public String devuelveDatos() {                  //SETTER
        return "El nombre es: " + nombre + ", la seccion es " + seccion + ", y el Id es: " + Id;
    }

    public static String dameIdSiguiente() {         //SETTER
        return "El id Siguiente es: " + IdSiguiente;
    }

}

