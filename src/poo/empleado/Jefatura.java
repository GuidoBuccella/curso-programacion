package poo.empleado;

public class Jefatura extends Empleado{
    public Jefatura(String nom,double sue,int agno,int mes,int dia){

        super(nom,sue,agno,mes,dia);

    }
    //SETTER
    public void estableceIncentivo(double incentivo){
        this.incentivo=incentivo;
    }
    public double dameSueldo(){
        double sueldoJefe=super.dameSueldo();

        return sueldoJefe+incentivo;
    }

    private double incentivo;


}

