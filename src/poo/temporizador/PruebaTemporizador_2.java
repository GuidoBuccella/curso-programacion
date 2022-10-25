package poo.temporizador;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador_2 {
    public static void main(String[] args) {

        Reloj miReloj= new Reloj(3000,true);
        miReloj.enMarcha();
        JOptionPane.showMessageDialog(null,"Pulsa Aceptar poara terminar");
        System.exit(0);
    }
}
class Reloj{ //clase externa.

    public Reloj(int intervalo,boolean sonido){
        this.intervalo=intervalo;
        this.sonido=sonido;
    }
    public void enMarcha(){   //podria borrar las variables, y agregarlas como parametros para ahorrar codigo, poniendo FINAL en el boolean.

        /*class DameLaHora2 implements ActionListener{ //CLASE INTERNA LOCAL en vez de clase interna

            public void actionPerformed(ActionEvent evento) {
                Date ahora=new Date();
                System.out.println("Te pongo la hora cada 3 segundos: "+ ahora);

                if (sonido){ //SOLO SI SE VA A UTILIZAR LA CLASE UNA SOLA VEZ
                    //y te ahorras de tener que crear los getter y setter para acceder desde afuera de una clase
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }*/
        ActionListener oyente=new DameLaHora2();
        Timer miTemporizador= new Timer(intervalo,oyente);
        miTemporizador.start();
    }
    private int intervalo;
    private boolean sonido;

    private class DameLaHora2 implements ActionListener{ //clase interna.

        public void actionPerformed(ActionEvent evento) {
            Date ahora=new Date();
            System.out.println("Te pongo la hora cada 3 segundos: "+ ahora);

            if (sonido){ //al ser clase interna, puede acceder a "sonido" declarado en la clase externa.
                        //y te ahorras de tener que crear los getter y setter para acceder desde afuera de una clase
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
