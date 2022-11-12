package programacion._3_Intermedio.rockPaperScissors;

import javax.swing.*;
import java.util.Arrays;
public class RockPaperScissors {
    public static Result[][] matrizRPS = {
            {Result.DRAW, Result.WINPLAYER2, Result.WINPLAYER1},
            {Result.WINPLAYER1, Result.DRAW, Result.WINPLAYER2},
            {Result.WINPLAYER2, Result.WINPLAYER1, Result.DRAW}
    };
    public static  String [] options= {"Rock","Paper","Scissors"};
    public static int playerSelect(){
        return JOptionPane.showOptionDialog(
                null,
                "Elige una mano",
                "Opciones",
                0,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                "");
    }
    public static void seleccionaJugada () {

        int manoJugador1= playerSelect();
        System.out.println("Jugador 1 elige: " + options[manoJugador1]);
        int manoJugador2=playerSelect();
        System.out.println("Jugador 2 elige: "+ options[manoJugador2]);

        System.out.println(matrizRPS[manoJugador1][manoJugador2]);
        /*if (manoJugador1 == 0 && manoJugador2==2 ) {
            System.out.println("Gana Jugador 1");
        }
        if (manoJugador1 == 0 && manoJugador2==1 ) {
            System.out.println("Gana Jugador 2");
        }
        if (manoJugador1 == 0 && manoJugador2==0 ) {
            System.out.println("Es un empate");
        }
        if (manoJugador1 == 1 && manoJugador2==0 ) {
            System.out.println("Gana Jugador 1");
        }
        if (manoJugador1 == 1 && manoJugador2==2 ) {
            System.out.println("Gana Jugador 2");
        }
        if (manoJugador1 == 1 && manoJugador2==1 ) {
            System.out.println("Es un empate");
        }
        if (manoJugador1 == 2 && manoJugador2==0 ) {
            System.out.println("Gana Jugador 2");
        }
        if (manoJugador1 == 2 && manoJugador2==1 ) {
            System.out.println("Gana Jugador 1");
        }
        if (manoJugador1 == 2 && manoJugador2==2 ) {
            System.out.println("Es un empate");
        }*/
    }
    public static void gamePlay(){
        RockPaperScissors.seleccionaJugada();
    }
}
