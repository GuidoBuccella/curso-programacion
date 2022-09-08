package poo.ejercicios;

import poo.ejercicios.ciudades.model.Ciudad;
import poo.ejercicios.ciudades.services.CiudadService;

public class CiudadesApp {
    public static void main(String[] args) {

        Ciudad niza=new Ciudad("Niza",943308);
        Ciudad abuDhabi=new Ciudad("Abu Dhabi",1482816);
        Ciudad napoles=new Ciudad("Napoles",2186853);
        Ciudad kualaLumpur=new Ciudad("Kuala Lumpur",8000000);

        Ciudad[] ciudades={niza,abuDhabi,napoles,kualaLumpur};
        Ciudad[] roundCities=new Ciudad[4];


        for (int i=0;i< ciudades.length;i++){

            int roundPopulation= CiudadService.ciudadRound(ciudades[i].getPoblacion());
            Ciudad ciudad=new Ciudad(ciudades[i].getNombre(),roundPopulation);
        }




        for (int i=0;i< ciudades.length;i++){
            roundCities[i]=CiudadService.ciudadRound();
        }





    }
}
