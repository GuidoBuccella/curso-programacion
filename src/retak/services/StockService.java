package retak.services;

import retak.model.Retak;

import javax.swing.*;

public class StockService {

    public static void printStock(Retak[] lista){

        for (int i=0;i<lista.length;i++){

            System.out.println("Stock actual de "+ lista[i].getNombre()+ " es: "+lista[i].getCantidadStock());
        }
    }

    public static void makeOrder(Retak[] lista) {
        String[] productoAelegir = new String[lista.length];
        Retak[] eleccionProducto = new Retak[lista.length];
        for (int i = 0; i < lista.length; i++) {
            productoAelegir[i] = lista[i].getNombre();
        }

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

        String cantidad = JOptionPane.showInputDialog("Cuantas unidades deseas pedir?");
        int unidades = Integer.parseInt(cantidad);
        if (unidades > stockActual) {
            System.out.println("primerooo");
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
                    }
                }
            } else if (respuesta.equals(opciones[1])) {
                JOptionPane.showMessageDialog(
                        null,
                        "Muchas gracias por su consulta",
                        "Mensaje",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);

            } else if (respuesta.equals(opciones[3])) {
                JOptionPane.showMessageDialog(
                        null,
                        "Comunicarse al 0249-154309995",
                        "Sector Compras",
                        JOptionPane.INFORMATION_MESSAGE,
                        null);
            }

            productoElegido = (String) JOptionPane.showInputDialog(
                    null,
                    "¿Desea agregar otro Producto de la lista a su compra?",
                    "Seleccione un Producto",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    productoAelegir,
                    "");
        } else if(unidades <= stockActual){
            System.out.println("guidoooooo"+productoElegido);

             for (int i = 0; i < lista.length; i++) {
                 if (lista[i].getNombre().equals(productoElegido)) {
                     lista[i].decreaseStock(unidades);

                    System.out.println(lista[i].getNombre() + ": " + lista[i].getCantidadStock() + " unidades");
                }
             }
        }
    }
}



