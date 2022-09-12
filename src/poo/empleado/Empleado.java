package poo.empleado;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado  {

    private final String nombre;
    private double sueldo;
    private Date altaContrato;
    private String seccion;
    private int Id;
    private static int IdSiguiente = 1;

    //CONSTRUCTOR
    public Empleado (String nom, double sue, int year, int month, int day){

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(year, month-1,day);
        altaContrato=calendario.getTime();
        seccion = "Administracion";
        Id = IdSiguiente;
        IdSiguiente++;
    }
    // CONSTRUCTOR
    public Empleado(String nom){
        this(nom,30000,2000,01,01);
    }


    public String dameNombre(){  //GETTER
        return nombre+" Id: " +Id +". ";
    }
    public void cambiaSeccion(String seccion) {      //GETTER
        this.seccion = seccion;
    }
    public double dameSueldo(){  //GETTER
        return sueldo;
    }
    public Date dameFechaContrato(){  //GETTER
        return  altaContrato;
    }

    public void subeSueldo(double percentage){   //SETTER
        double aumento=sueldo*percentage/100;
        sueldo+=aumento;
    }
    public String devuelveDatos() {                  //SETTER
        return "El nombre es: " + nombre + ", la seccion es " + seccion + ", y el Id es: " + Id;
    }
    public static String dameIdSiguiente() {         //SETTER
        return "El id Siguiente es: " + IdSiguiente;
    }
}
