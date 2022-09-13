package poo.persona;

public class PersonaApp {
    public static void main(String[] args) {

        Persona[] lasPersonas=new Persona[2];
        lasPersonas[0]=new Empleado2("Guido",120000,2022,7,15);
        lasPersonas[1]=new Alumno("Juan","Ingenieria en Sistemas");

        for (Persona e: lasPersonas){
            System.out.println(e.dameNombre() + ". "+ e.dameDescripcion());
        }
    }
}
