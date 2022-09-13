package poo.persona;

public class Alumno extends Persona{

    public Alumno(String nom,String car){

        super(nom);
        carrera=car;
    }
    private String carrera;

    public String dameDescripcion(){
        return "Este alumno esta estudiando la carrera de "+ carrera;
    }
}
