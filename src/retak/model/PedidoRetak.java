package retak.model;

import pokemon.model.Ataque;

public class PedidoRetak {
    int unidades;
    String productoPedido;

    public PedidoRetak(String productoPedido,int unidades){
        this.productoPedido=productoPedido;
        this.unidades=unidades;
    }
    //GETTER PRODUCTO PEDIDO
    public String getProductoPedido(){
        return productoPedido;
    }
    //SETTER PRODUCTO PEDIDO
    public void setProductoPedido(String productoPedido){
        this.productoPedido=productoPedido;
    }
    //GETTER UNIDADES
    public int getUnidades(){
        return unidades;
    }
    //SETTER UNIDADES
    public void setUnidades(int unidades){
        this.unidades=unidades;
    }
    @Override
    public String toString(){

        return productoPedido + ": "+unidades+" unidades";
    }
}
