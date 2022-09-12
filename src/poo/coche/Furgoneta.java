package poo.coche;

import poo.coche.Coche;

public class Furgoneta extends Coche {
    private int capacidadCarga;
    private int plazasExtra;

    public Furgoneta(int plazasExtra,int capacidadCarga){

        super(); //LLAMAR AL CONSTRUCTOR DFE LA CLASE PADRE
        this.capacidadCarga=capacidadCarga;
        this.plazasExtra=plazasExtra;
    }
    public String getDatosFurgoneta(){

        return "La capacidad de carga es: "+capacidadCarga + ". Y las plazas son: " +plazasExtra;
    }
}
