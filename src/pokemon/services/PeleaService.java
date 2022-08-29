package pokemon.services;
import javax.swing.*;

import pokemon.model.Ataque;
import pokemon.model.Pokemon;
import pokemon.model.TipoPoke;
import pokemon.utils.PokemonUtils;

public class PeleaService {

    public static void inicioPelea(Pokemon [] listaPokemon){

        Pokemon jugador1=seleccionaPokemon(listaPokemon,"Jugador 1");
        Pokemon jugador2=seleccionaPokemon(listaPokemon,"Jugador 2");
        PeleaService.peleaPokemon(jugador1,jugador2,listaPokemon);
    }

    public static Pokemon seleccionaPokemon(Pokemon [] listaPokemon,String player){

        String [] eleccionPokemon=new String[listaPokemon.length];

        for (int i=0;i<listaPokemon.length;i++){
            eleccionPokemon[i]=listaPokemon[i].getNombre();
        }
        String pokemonElegido=(String) JOptionPane.showInputDialog(
                null,
                player + ": Elige un Pokemon de la lista para poder pelear",
                "Seleccione un Pokemon",
                JOptionPane.QUESTION_MESSAGE,
                null,
                eleccionPokemon,
                "");

        Pokemon jugador=PokemonUtils.cualPokemon(pokemonElegido,listaPokemon);
        System.out.println(player + " ha elegido a " + jugador.getNombre());
        return jugador;
    }

    public static void atacaPokemon(Pokemon figther1, Pokemon figther2, String player){

        String[] nombreAtaques=new String[4];

        Ataque [] ataques=figther1.getAtaques();

        for (int i=0;i<4;i++){

            nombreAtaques[i]=ataques[i].getNombre();
        }
        int posicionElegida=JOptionPane.showOptionDialog(
                null,
                player+"Elige un ataque",
                "Batalla Pokemon",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                nombreAtaques,
                "");

        System.out.println(figther1.getNombre()+ " uso el ataque " + ataques[posicionElegida].getNombre());

        int damage=ataques[posicionElegida].getDamage();
        damage=(int)(damage* TipoPoke.multiplicadorDamage[ataques[posicionElegida].getTipo().damePosicion()][figther2.getTipo().damePosicion()]);
        if (figther1.getTipo()==ataques[posicionElegida].getTipo()){
            damage=(int)(damage*1.5);
        }
        figther2.quitarVida(damage);

        System.out.println(figther2.getNombre() + " recibio " + damage + " puntos de daño, y su vida actual se redujo a " + figther2.getVidaActual());
        if(figther2.isDead()){
            System.out.println(figther2.getNombre() + " se debilito por completo");
        }
    }
    public static void peleaPokemon(Pokemon fighter1,Pokemon fighter2,Pokemon []listaPokemon) {
        Pokemon pokemonGanador;
        String jugadorGanador;
        int nivelGanador;

        while (!(fighter1.isDead()||fighter2.isDead())) {
            PeleaService.atacaPokemon(fighter1, fighter2,"Jugador 1: ");
            if(!(fighter2.isDead())){
                PeleaService.atacaPokemon(fighter2, fighter1,"Jugador 2: ");
            }
        }
        if(fighter1.isDead()){
            nivelGanador=fighter2.getNivel();
            fighter2.subeExperiencia(100);
            pokemonGanador=fighter2;
            jugadorGanador="Jugador 2";

        } else{
            nivelGanador=fighter1.getNivel();
            fighter1.subeExperiencia(100);
            pokemonGanador = fighter1;
            jugadorGanador="Jugador 1";
        }
        if (nivelGanador<pokemonGanador.getNivel()){
            System.out.println(pokemonGanador.getNombre() + " ha subido al nivel " + pokemonGanador.getNivel()+"!. Felicitaciones!");
        }
        System.out.println("El pokemon ganador es: "+ pokemonGanador.getNombre() + ". Ahora tiene " + pokemonGanador.getExperiencia()+ " puntos de experiencia");
        JOptionPane.showMessageDialog(null,"Felicitaciones "+jugadorGanador+ ", tu "+ pokemonGanador.getNombre() + ", ha ganado la batalla!\nAhora la vida de tu "+pokemonGanador.getNombre()+" es "+pokemonGanador.getVidaActual()+"/"+pokemonGanador.getVidaMaxima()+"\nY su nivel es "+pokemonGanador.getNivel(),"Resultado de Pelea Pokemon",JOptionPane.INFORMATION_MESSAGE);

        int respuesta=JOptionPane.showConfirmDialog(null,"Deseas seguir peleando?","Selecciona un opción",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            inicioPelea(listaPokemon);
        }else System.out.println("Hasta la próxima!");
    }
}
