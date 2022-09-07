package retak.services;

import retak.model.PedidoRetak;
import retak.model.Retak;

import javax.swing.*;

public class StockService {

    public static void printStock(Retak[] lista) {

        for (int i = 0; i < lista.length; i++) {

            System.out.println("Stock actual de " + lista[i].getNombre() + " es: " + lista[i].getCantidadStock());
        }
    }

    public static void makeOrder(Retak[] lista) {
        String[] productoAelegir = new String[lista.length];
        Retak[] eleccionProducto = new Retak[lista.length];
        PedidoRetak[] nuevoPedido=new PedidoRetak[25];
        int numeroSiguiente=0;


        for (int i = 0; i < lista.length; i++) {
            productoAelegir[i] = lista[i].getNombre();
        }
        boolean seguirComprando = true;

        while (seguirComprando) {
            String productoElegido = (String) JOptionPane.showInputDialog(
                    null,
                    "Elige un Producto de la lista para agregar un pedido",
                    "Seleccione un Producto",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    productoAelegir,
                    "");
            int stockActual = 0;
            for (int i = 0; i < lista.length; i++) {
                if (lista[i].getNombre().equals(productoElegido)) {
                    stockActual = lista[i].getCantidadStock();
                }
            }
            String[] opciones = {"Agregar stock disponible a la compra", "Cancelar compra",
                    "Volver a lista de productos", "Contactarse con sector compras"};

            if (productoElegido==null){
                seguirComprando=false;
                JOptionPane.showMessageDialog(
                        null,
                        "Muchas gracias por su consulta",
                        "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);

            }else {
                String cantidad = JOptionPane.showInputDialog("Cuantas unidades deseas pedir?");
                int unidades = Integer.parseInt(cantidad);


                if (unidades > stockActual) {

                    String respuesta = (String) JOptionPane.showInputDialog(
                            null,
                            "No hay suficiente Stock de " + productoElegido + " para completar su pedido. \n" +
                                    "Podemos ofrecerle " + Integer.toString(stockActual) + " unidades en este momento.\n" +
                                    " Elija una opción:",
                            "Sin suficiente stock. Seleccione una opción",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            opciones,
                            "");
                    if (respuesta.equals(opciones[0])) {
                        for (int i = 0; i < lista.length; i++) {
                            if (lista[i].getNombre().equals(productoElegido)) {
                                lista[i].decreaseStock(lista[i].getCantidadStock());
                                JOptionPane.showMessageDialog(
                                        null,
                                        "Se ha agregado su pedido a la compra",
                                        "Mensaje",
                                        JOptionPane.INFORMATION_MESSAGE,
                                        null);
                                PedidoRetak pedido=new PedidoRetak(productoElegido,stockActual);
                                nuevoPedido[numeroSiguiente]=pedido;
                                numeroSiguiente++;
                            }
                        }
                    } else if (respuesta.equals(opciones[1])) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Muchas gracias por su consulta",
                                "Mensaje",
                                JOptionPane.INFORMATION_MESSAGE,
                                null);
                        seguirComprando=false;

                    } else if (respuesta.equals(opciones[3])) {
                        JOptionPane.showMessageDialog(
                                null,
                                "Comunicarse al 0249-154309995",
                                "Sector Compras",
                                JOptionPane.INFORMATION_MESSAGE,
                                null);
                        seguirComprando=false;
                    }
                } else if (unidades <= stockActual) {

                    PedidoRetak pedido = new PedidoRetak(productoElegido, unidades);
                    nuevoPedido[numeroSiguiente] = pedido;
                    numeroSiguiente++;

                    for (int i = 0; i < lista.length; i++) {
                        if (lista[i].getNombre().equals(productoElegido)) {
                            lista[i].decreaseStock(unidades);
                        }
                    }
                }
                String productoPedido="";
                for (int i=0;i< nuevoPedido.length;i++) {
                    if (nuevoPedido[i]!=null) {
                        productoPedido = productoPedido + nuevoPedido[i]+"\n";
                    }
                }
                int confirmado = JOptionPane.showConfirmDialog(
                        null,
                        "Su pedido hasta ahora es: "+"\n"+ productoPedido + "\n" +"Deseas agregar otro producto a tu compra?",
                        "Selecciona una opción",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null);
                if (confirmado==1) {
                    seguirComprando = false;
                    JOptionPane.showMessageDialog(
                            null,
                            productoPedido + "\n" + "\n" + "Personal de compras se comunicará contigo para coordinar el envío",
                            "Tu pedido es el siguiente:",
                            JOptionPane.INFORMATION_MESSAGE,
                            null);


                    String numeroContacto = JOptionPane.showInputDialog(
                            null,
                            "Dejanos tu número de celular para contactarnos contigo" + "\n" + "Muchas gracias por tu pedido",
                            "Informacion de contacto",
                            JOptionPane.QUESTION_MESSAGE);
                    System.out.println("Nos contactaremos brevemente al siguiente número: " + numeroContacto);

                }else;
            }
        }
    }
}




