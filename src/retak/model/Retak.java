package retak.model;

public class Retak {

    private String nombre;
    private int longitud;
    private int altura;
    private double espesor;
    private double pesoUnitario;
    private double pesoM2;
    private int cantidadStock;

    //CONSTRUCTOR RETAK
    public Retak (TipoRetak tipo, String nombre, int longitud, double espesor, double pesoUnitario, double pesoM2, int cantidadStock){
        this.nombre=nombre;
        this.longitud=longitud;
        this.altura=25;
        this.espesor=espesor;
        this.pesoUnitario=pesoUnitario;
        this.pesoM2=pesoM2;
        this.cantidadStock=cantidadStock;
    }
    //CONSTRUCTOR RETAK
    public Retak (TipoRetak tipo, String nombre,double espesor, double pesoUnitario, double pesoM2){
        this(tipo,nombre,50,espesor,pesoUnitario, pesoM2,0);
    }
    //CONSTRUCTOR DINTELES
    public Retak(TipoRetak tipo,String nombre, double espesor,int longitud,double pesoUnitario,int cantidadStock){
        this.nombre=nombre;
        this.espesor=espesor;
        this.longitud=longitud;
        this.altura=25;
        this.pesoUnitario=pesoUnitario;
        this.cantidadStock=cantidadStock;
    }

    //GETTER NOMBRE
    public String getNombre(){
        return nombre;
    }
    //SETTER NOMBRE
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    //GETTER LONGITUD
    public int getLongitud(){
        return longitud;
    }
    //SETTER LONGITUD
    public void setLongitud(int longitud){
        this.longitud=longitud;
    }
    //GETTER ALTURA
    public int getAltura(){
        return altura;
    }
    //SETTER ALTURA
    public void setAltura(int altura){
        this.altura=altura;
    }
    //GETTER ESPESOR
    public double getEspesor(){
        return espesor;
    }
    //SETTER ESPESOR
    public void setEspesor(double espesor){
        this.espesor=espesor;
    }
    //GETTER PESO UNITARIO
    public double getPesoUnitario(){
        return pesoUnitario;
    }
    //SETTER PESO UNITARIO
    public void setPesoUnitario(double pesoUnitario){
        this.pesoUnitario=pesoUnitario;
    }
    //GETTER PESO METRO CUADRADO (M2)
    public double getPesoM2(){
        return pesoM2;
    }
    //SETTER PESO METRO CUADRADO (M2)
    public void setPesoM2(double pesoM2){
        this.pesoM2=pesoM2;
    }
    //GETTER CANTIDAD STOCK
    public int getCantidadStock(){
        return cantidadStock;
    }
    public void setCantidadStock(int cantidadStock){
        this.cantidadStock=cantidadStock;
    }

    public void addStock(int unidades){
        cantidadStock=cantidadStock+unidades;
    }
    public void checkStock(){
        System.out.println("El Stock actual de los " + nombre+ " es de: " + cantidadStock+ " unidades.");
    }
}
