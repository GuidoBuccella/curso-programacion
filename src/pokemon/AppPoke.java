package pokemon;

public class AppPoke {
    public static void main(String[] args) {

        Ataque ascuas=new Ataque("Ascuas",10,TipoPoke.FUEGO);
        Ataque lanzallamas=new Ataque("Lanzallamas",15,TipoPoke.FUEGO);
        Ataque llamarada=new Ataque("Llamarada",20,TipoPoke.FUEGO);
        Ataque burbuja=new Ataque("Burbuja",10,TipoPoke.AGUA);
        Ataque pistolaDeAgua=new Ataque("Pistola de Agua",15,TipoPoke.AGUA);
        Ataque hidrobomba=new Ataque("Hidrobomba",20,TipoPoke.AGUA);
        Ataque hojaAfilada=new Ataque("Hoja Afilada",10,TipoPoke.PLANTA);
        Ataque latigoCepa=new Ataque("Latigo Cepa",15,TipoPoke.PLANTA);
        Ataque rayoSolar=new Ataque("Rayo Solar",20,TipoPoke.PLANTA);
        Ataque impactrueno=new Ataque("Impactrueno",10,TipoPoke.ELECTRICO);
        Ataque rayo=new Ataque("Rayo",15,TipoPoke.ELECTRICO);
        Ataque trueno=new Ataque("Trueno",20,TipoPoke.ELECTRICO);
        Ataque pinMisil=new Ataque("Pin Misil",10,TipoPoke.BICHO);
        Ataque chupavida=new Ataque("Chupavida",15,TipoPoke.BICHO);
        Ataque dobleAtaque=new Ataque("Doble Ataque",20,TipoPoke.BICHO);
        Ataque picotazo=new Ataque("Picotazo",10,TipoPoke.VOLADOR);
        Ataque vuelo=new Ataque("Vuelo",15,TipoPoke.VOLADOR);
        Ataque ataqueAereo=new Ataque("Ataque Aereo",20,TipoPoke.VOLADOR);
        Ataque ataqueFuria=new Ataque("Ataque Furia",5,TipoPoke.NORMAL);
        Ataque ataqueRapido=new Ataque("Ataque Rapido",10,TipoPoke.NORMAL);
        Ataque placaje=new Ataque("Placaje",10,TipoPoke.NORMAL);
        Ataque aranazo=new Ataque("Aranazo",15,TipoPoke.NORMAL);
        Ataque rapidez=new Ataque("Rapidez",15,TipoPoke.NORMAL);
        Ataque cabezazo=new Ataque("Cabezazo",15,TipoPoke.NORMAL);
        Ataque lanzarrocas=new Ataque("Lanza Rocas",15,TipoPoke.ROCA);
        Ataque avalancha=new Ataque("Avalancha",20,TipoPoke.ROCA);

        Ataque [] ataqueCharmander={ascuas,lanzallamas,llamarada,aranazo};
        Pokemon charmander=new Pokemon("Charmander",100,1,TipoPoke.FUEGO,ataqueCharmander);

        Ataque [] ataqueSquartle={burbuja,pistolaDeAgua,hidrobomba,cabezazo};
        Pokemon squartle=new Pokemon("Squartle",100,1,TipoPoke.AGUA,ataqueSquartle);

        Ataque[] ataqueBulbasor={hojaAfilada,latigoCepa,rayoSolar,placaje};
        Pokemon bulbasor=new Pokemon("Bulbasor",100,1,TipoPoke.PLANTA,ataqueBulbasor);

        Ataque[] ataquePikachu={impactrueno,rayo,trueno,ataqueRapido};
        Pokemon pikachu=new Pokemon("Pikachu",100,1,TipoPoke.ELECTRICO,ataquePikachu);

        Ataque[] ataqueCaterpie={pinMisil,chupavida,dobleAtaque,placaje};
        Pokemon caterpie=new Pokemon("Caterpie",100,1,TipoPoke.BICHO,ataqueCaterpie);

        Ataque[] ataquePidget={picotazo,vuelo,ataqueAereo,rapidez};
        Pokemon pidget=new Pokemon("Pidget",100,1,TipoPoke.VOLADOR,ataquePidget);

        Ataque[] ataqueRatata={ataqueFuria,ataqueRapido,placaje,cabezazo};
        Pokemon ratata=new Pokemon("Ratata",100,1,TipoPoke.NORMAL,ataqueRatata);

        Ataque[] ataqueGeodude={lanzarrocas,avalancha,placaje,ataqueRapido};
        Pokemon geodude=new Pokemon("Geodude",100,1,TipoPoke.ROCA,ataqueGeodude);







        System.out.println(squartle);


    }
}
