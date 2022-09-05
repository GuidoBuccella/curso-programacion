package retak;

import retak.model.PedidoRetak;
import retak.model.Retak;
import retak.model.TipoRetak;
import retak.services.StockService;

public class AppRetak {
    public static void main(String[] args) {

        //    LADRILLOS (50_60)
        Retak ladrillo7_5 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 7.5(x50x25)",50,7.5,6.4,51,0);
        Retak ladrillo10 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 10(x50x25)",50,10,8.5,68,0);
        Retak ladrillo12_5 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 12.5(x50x25)",50,12.5,10.6,85,0);
        Retak ladrillo15 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 15(x50x25)",50,15,12.8,102,0);
        Retak ladrillo17_5 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 17.5(x50x25)",50,17.5,14.9,119,0);
        Retak ladrillo20 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 20(x50x25)",50,20,17,136,0);

        Retak ladrillo15x60x25 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 15x60(x25)",60,15,14.6,102,0);
        Retak ladrillo10x60x25 =new Retak(TipoRetak.LADRILLO,"Ladrillo de 10x60(x25)",60,10,9.7,68,0);

        //  DINTELES (150_200_250)
        Retak dintel10x150x25=new Retak(TipoRetak.DINTEL,"Dintel de 10x150(x25)",10,150,30.5,0);
        Retak dintel12_5x150x25=new Retak(TipoRetak.DINTEL,"Dintel de 12.5x150(x25)",12.5,150,36.8,0);
        Retak dintel15x150x25= new Retak(TipoRetak.DINTEL,"Dintel de 15x150(x25)",15,150,43.4,0);
        Retak dintel17_5x150x25= new Retak(TipoRetak.DINTEL,"Dintel de 17.5x150(x25)",17.5,150,43.4,0);
        Retak dintel20x150x25= new Retak(TipoRetak.DINTEL,"Dintel de 20x150(x25)",20,150,43.4,0);

        Retak dintel10x200x25=new Retak(TipoRetak.DINTEL,"Dintel de 10x200(x25)",10,200,39,0);
        Retak dintel12_5x200x25=new Retak(TipoRetak.DINTEL,"Dintel de 12.5x200(x25)",12.5,200,47.4,0);
        Retak dintel15x200x25= new Retak(TipoRetak.DINTEL,"Dintel de 15x200(x25)",15,200,56.2,0);
        Retak dintel17_5x200x25= new Retak(TipoRetak.DINTEL,"Dintel de 17.5x200(x25)",17.5,200,64.6,0);
        Retak dintel20x200x25= new Retak(TipoRetak.DINTEL,"Dintel de 20x200(x25)",20,200,73,0);

        Retak dintel10x250x25=new Retak(TipoRetak.DINTEL,"Dintel de 10x250(x25)",10,250,47.5,0);
        Retak dintel12_5x250x25=new Retak(TipoRetak.DINTEL,"Dintel de 12.5x250(x25)",12.5,250,58,0);
        Retak dintel15x250x25= new Retak(TipoRetak.DINTEL,"Dintel de 15x250(x25)",15,250,69,0);
        Retak dintel17_5x250x25= new Retak(TipoRetak.DINTEL,"Dintel de 17.5x250(x25)",17.5,250,79.5,0);
        Retak dintel20x250x25= new Retak(TipoRetak.DINTEL,"Dintel de 20x250(x25)",20,250,90,0);

        //    ESCALERA
        Retak escalon17_5x150x25= new Retak(TipoRetak.ESCALON,"Escalon (17_5x150x25)",17.5,150,43.4,0);

        //   PLACA DE AISLACION
        Retak placaAislacion5x50x25=new Retak(TipoRetak.PLACA_AISLACION,"Placa de Aislación de 5(x50x25)",5,50,4.2,0);

        Retak[] listaStock={ladrillo7_5,ladrillo10,ladrillo12_5,ladrillo15,ladrillo17_5,ladrillo20,
                ladrillo10x60x25,ladrillo15x60x25,dintel10x150x25,dintel10x200x25,dintel10x250x25,
                dintel12_5x150x25,dintel12_5x200x25,dintel12_5x250x25,dintel15x150x25,dintel15x200x25,
                dintel15x250x25,dintel17_5x150x25,dintel17_5x200x25,dintel17_5x250x25,dintel20x150x25,
                dintel20x200x25,dintel20x250x25,escalon17_5x150x25,placaAislacion5x50x25};


        for (int i=0;i<listaStock.length;i++){
            listaStock[i].addStock(80);
            System.out.println(listaStock[i].getNombre()+": "+listaStock[i].getCantidadStock()+" unidades");
        }

        StockService.makeOrder(listaStock);
        StockService.printStock(listaStock);




    }


}
