package poo.empleado;

public class Jefatura extends Empleado implements Jefes{
    public Jefatura(String nom,double sue,int agno,int mes,int dia){

        super(nom,sue,agno,mes,dia);

    }
    public double establece_bonus(double gratificacion){
        double prima=2000;
        return Trabajadores.bonus_base+gratificacion+prima;
    }
    public String tomar_decisiones(String decision){
        return "Un miembro de la direccion ha tomado la decision de: "+decision;
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

