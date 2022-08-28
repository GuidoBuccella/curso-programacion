package pokemon.services;
import javax.swing.*;

import pokemon.model.Ataque;
import pokemon.model.Pokemon;
import pokemon.model.TipoPoke;

public class PeleaService {

    public static void inicioPelea(Pokemon [] listaPokemon){
        Pokemon jugador1=seleccionaPokemon(listaPokemon);
        Pokemon jugador2=seleccionaPokemon(listaPokemon);
        PeleaService.peleaPokemon(jugador1,jugador2);
    }

    public static Pokemon seleccionaPokemon(Pokemon [] listaPokemon){

        String [] eleccionPokemon=new String[listaPokemon.length];

        for (int i=0;i<listaPokemon.length;i++){
            eleccionPokemon[i]=listaPokemon[i].getNombre();
        }
        int pokemonElegido=JOptionPane.showOptionDialog(
                null,
                "Elige un Pokemon",
                "Seleccion de Pokemon",
                0,JOptionPane.QUESTION_MESSAGE,
                null,eleccionPokemon,
                "");
        Pokemon jugador=listaPokemon[pokemonElegido];
        return jugador;

    }

    public static void atacaPokemon(Pokemon figther1, Pokemon figther2){

        String[] nombreAtaques=new String[4];

        Ataque [] ataques=figther1.getAtaques();

        for (int i=0;i<4;i++){

            nombreAtaques[i]=ataques[i].getNombre();
        }
        int posicionElegida=JOptionPane.showOptionDialog(
                null,
                "Elige un ataque",
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
    public static void peleaPokemon(Pokemon fighter1,Pokemon fighter2) {
        Pokemon pokemonGanador;
        int nivelGanador;

        while (!(fighter1.isDead()||fighter2.isDead())) {
            PeleaService.atacaPokemon(fighter1, fighter2);
            if(!(fighter2.isDead())){
                PeleaService.atacaPokemon(fighter2, fighter1);
            }
        }
        if(fighter1.isDead()){
            nivelGanador=fighter2.getNivel();
            fighter2.subeExperiencia(100);
            pokemonGanador=fighter2;

        } else{
            nivelGanador=fighter1.getNivel();
            fighter1.subeExperiencia(100);
            pokemonGanador = fighter1;
        }
        if (nivelGanador<pokemonGanador.getNivel()){
            System.out.println(pokemonGanador.getNombre() + " ha subido al nivel " + pokemonGanador.getNivel()+"!. Felicitaciones!");
        }
        System.out.println("El pokemon ganador es: "+ pokemonGanador.getNombre() + ". Ahora tiene " + pokemonGanador.getExperiencia()+ " puntos de experiencia");
    }
}
