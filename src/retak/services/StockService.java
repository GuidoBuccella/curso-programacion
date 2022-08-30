package retak.services;

import retak.model.Retak;

public class StockService {

    public static void printStock(Retak[] lista){

        for (int i=0;i<lista.length;i++){

            System.out.println("Stock actual de "+ lista[i].getNombre()+ " es: "+lista[i].getCantidadStock());
        }
    }
}



