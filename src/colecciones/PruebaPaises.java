package colecciones;

import java.util.*;

public class PruebaPaises {
    public static void main(String[] args) {
        LinkedList<String> paises= new LinkedList<String>();

        paises.add("Argentina");
        paises.add("España");
        paises.add("Colombia");
        paises.add("Mexico");
        paises.add("Peru");

        LinkedList<String> capitales= new LinkedList<String>();

        capitales.add("Buenos Aires");
        capitales.add("Madrid");
        capitales.add("Bogota");
        capitales.add("DF");
        capitales.add("Lima");



        ListIterator<String> iterA= paises.listIterator();
        ListIterator<String> iterB= capitales.listIterator();

        while (iterB.hasNext()){            // CON ESTO AGREGO LAS CAPITALES MEDIANTE
                                           // UN BUCLE; A CONTINUACION DE SU PAIS
            if (iterA.hasNext()){
                iterA.next();
            }
            iterA.add(iterB.next());
        }
        System.out.println("1: " +paises);
        System.out.println("2: " +capitales);

        iterB= capitales.listIterator();    // CON ESTO VUELVO AL PRINCIPIO AL ITERADOR

        while (iterB.hasNext()){            //CONDICION QUE EVALUA SI HAY UN ELEMENTO EN LA SIGUIENTE POSICION de capitales

            iterB.next();                   // LO HAGO SALTAR A LA SIGUIENTE POSICION de capitales

            if (iterB.hasNext()){           //CONDICION QUE EVALUA SI HAY UN ELEMENTO EN LA SIGUIENTE POSICION de capitales
                iterB.next();               // LO HAGO SALTAR A LA SIGUIENTE POSICION, para buscar que sea una posicion PAR
                iterB.remove();             //ELIMINO EL ELEMENTO PAR
            }
        }
        System.out.println("3: " +capitales);
        System.out.println("4: " +paises);
        paises.removeAll(capitales);
        System.out.println("5: " +paises);


    }
}
