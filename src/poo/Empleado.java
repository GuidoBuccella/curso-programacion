package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado  {

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    //CONSTRUCTOR
    public Empleado (String nom, double sue, int year, int month, int day){

        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(year, month-1,day);
        altaContrato=calendario.getTime();

    }
    public Empleado(String nom){
        this(nom,30000,2000,01,01);
    }
    public String dameNombre(){  //GETTER
        return nombre;
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
}
