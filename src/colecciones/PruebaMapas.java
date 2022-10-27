package colecciones;
import java.util.*;
public class PruebaMapas {
    public static void main(String[] args) {

        HashMap<String,Empleado> personal=new HashMap<String,Empleado>();
        personal.put("111",new Empleado("Guido"));
        personal.put("222",new Empleado("Juan"));
        personal.put("333",new Empleado("Eliana"));
        personal.put("444",new Empleado("Diego"));

        System.out.println(personal);
        personal.remove("222");
        System.out.println(personal);
        personal.put("111",new Empleado("Guillermo"));
        System.out.println(personal);
        //System.out.println(personal.entrySet());

        for (Map.Entry<String,Empleado> entrada: personal.entrySet()){
            String clave= entrada.getKey();
            Empleado valor=entrada.getValue();

            System.out.println("Clave= "+clave+", valor= "+valor);
        }
    }
}
class Empleado{

    public Empleado(String nombre){
        this.nombre=nombre;
        sueldo=2000;
    }

    public String toString(){
        return "[Nombre= " + nombre+", sueldo= "+sueldo +"]";
    }
    private String nombre;
    private double sueldo;
}
