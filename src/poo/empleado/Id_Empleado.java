package poo.empleado;

import java.util.ArrayList;

public class Id_Empleado {
    public static void main(String[] args) {

        Empleado trabajador1 = new Empleado("Juan");
        Empleado trabajador2 = new Empleado("Guido");
        Empleado trabajador3 = new Empleado("Eliana");
        Empleado trabajador4 = new Empleado("Rodolfo");
        trabajador3.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + "\n" +
                trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());

        System.out.println(Empleado.dameIdSiguiente());
    }
}
