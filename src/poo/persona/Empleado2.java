package poo.persona;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado2 extends Persona{

    private double sueldo;
    private Date altaContrato;
    private int Id;
    private static int IdSiguiente = 1;

    public Empleado2 (String nom, double sue, int year, int month, int day){

        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(year, month-1,day);
        altaContrato=calendario.getTime();
        Id = IdSiguiente;
        IdSiguiente++;
    }
    public String dameDescripcion(){
        return "Este empleado tiene un Id= "+ Id + " con un sueldo= "+sueldo;
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

    public static String dameIdSiguiente() {         //SETTER
        return "El id Siguiente es: " + IdSiguiente;
    }

}
