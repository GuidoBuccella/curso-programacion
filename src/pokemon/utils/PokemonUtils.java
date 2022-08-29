package pokemon.utils;

import pokemon.model.Pokemon;

public class PokemonUtils {

    public static Pokemon cualPokemon(String nombre,Pokemon[] eleccionPokemon){
        Pokemon pokemon;
        for (int i=0;i<eleccionPokemon.length;i++){
            pokemon=eleccionPokemon[i];

            if (nombre.equals(pokemon.getNombre())) {
                return pokemon;
            }
        }
        return null;
    }


}
