package poo.persona;

public abstract class Persona {

    private String nombre;

    public Persona(String nom){
        nombre=nom;
    }

    public String dameNombre(){
        return nombre;
    }
    public abstract String dameDescripcion();

}
