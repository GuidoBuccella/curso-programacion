package colecciones;

import java.util.*;

public class PruebaTreeSet {
    public static void main(String[] args) {

        /*TreeSet<String> ordenaPersonas=new TreeSet<String>();
        ordenaPersonas.add("Guido");
        ordenaPersonas.add("Federico");
        ordenaPersonas.add("Mauro");
        ordenaPersonas.add("Franco");
        ordenaPersonas.add("Tomas");

        for (String s:ordenaPersonas){
            System.out.println(s);
        }*/

        Articulo first = new Articulo(1, "primer articulo");
        Articulo second = new Articulo(200, "segundo articulo");
        Articulo third = new Articulo(3, "Este es el tercer articulo");

        TreeSet<Articulo> ordenaArticulos= new TreeSet<Articulo>();
        ordenaArticulos.add(second);
        ordenaArticulos.add(third);
        ordenaArticulos.add(first);

        for (Articulo art:ordenaArticulos){
            System.out.println(art.getDescription());
        }

        /*Articulo comparadorArticulos=new Articulo();
        TreeSet<Articulo>ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);*/

        ComparadorArticulos comparaArt=new ComparadorArticulos();
        TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparaArt);

        ordenaArticulos2.add(first);
        ordenaArticulos2.add(second);
        ordenaArticulos2.add(third);
        for (Articulo art:ordenaArticulos2){
            System.out.println(art.getDescription());
        }
    }

}
class Articulo implements Comparable<Articulo> {    // Comparator<Articulo>
    @Override
    public int compareTo(Articulo o) {
        return number - o.number;
    }
    /*public Articulo(){

    }*/
    public Articulo(int number, String description) {
        this.description = description;
        this.number = number;
    }
    private int number;
    private String description;
    public String getDescription() {
        return description;
    }
    /*@Override
    public int compare(Articulo o1, Articulo o2) {
        String descriptionA=o1.getDescription();
        String descriptionB= o2.getDescription();
        return descriptionA.compareTo(descriptionB);
    }*/
}
class ComparadorArticulos implements Comparator<Articulo>{

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String desc1=o1.getDescription();
        String desc2= o2.getDescription();
        return desc1.compareTo(desc2);
    }
}
