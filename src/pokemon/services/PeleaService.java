package pokemon.services;
import javax.swing.*;

import pokemon.model.Ataque;
import pokemon.model.Pokemon;

public class PeleaService {


    public static void PeleaPokemon(Pokemon figther1, Pokemon figther2){

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

        System.out.println(ataques [posicionElegida]);

    }

}
