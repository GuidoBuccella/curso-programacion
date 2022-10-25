package poo.temporizador;
import javax.swing.*;
import javax.swing.Timer;
import java.awt.event.*;
public class PruebaTemporizador {

    public static void main(String[] args) {

        DameLaHora oyente=new DameLaHora();
        // o tambioen funciona: ActionListener oyente=new DameLaHora();  

        Timer miTemporizador=new Timer(5000,oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null,"pulsa aceptar para detener");

        System.exit(0);
    }


}
