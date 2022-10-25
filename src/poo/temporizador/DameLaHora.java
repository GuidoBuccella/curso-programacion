package poo.temporizador;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e){
        Date ahora=new Date();

        System.out.println("Te pongo la hora cada 5 segundos: "+ ahora);

        Toolkit.getDefaultToolkit().beep();
    }

}
