package colecciones;
import java.util.*;
public class PruebaLinkedList {
    public static void main(String[] args) {

        LinkedList<String> personas=new LinkedList<String>();

        personas.add("Guido");
        personas.add("Eliana");
        personas.add("Juan");
        personas.add("Diego");

        System.out.println(personas.size());
        ListIterator<String> it= personas.listIterator();
        it.next();
        it.add("Guillermo ");
        for (String people:personas){
            System.out.println(people);
        }
    }
}
