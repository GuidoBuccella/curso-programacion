package poo.ejercicios.ciudades.services;

import poo.ejercicios.ciudades.model.Ciudad;

public class CiudadService {
    public static int ciudadRound(int poblacion){

        return (int) (Math.round(poblacion/1000000f)*1000000);

    }


}
