package retak;

public class Retak {

    private String nombre;
    private int longitud;
    private int altura;
    private int espesor;
    private int pesoUnitario;
    private int pesoM2;

    //CONSTRUCTOR RETAK
    public Retak (TipoRetak tipo, String nombre,int longitud, int espesor, int pesoUnitario, int pesoM2){
        this.nombre=nombre;
        this.longitud=longitud;
        this.altura=25;
        this.espesor=espesor;
        this.pesoUnitario=pesoUnitario;
        this.pesoM2=pesoM2;
    }
    //CONSTRUCTOR RETAK
    public Retak (TipoRetak tipo, String nombre,int espesor, int pesoUnitario, int pesoM2){
        this(tipo,nombre,50,espesor,pesoUnitario, pesoM2);
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
    public int getEspesor(){
        return espesor;
    }
    //SETTER ESPESOR
    public void setEspesor(int espesor){
        this.espesor=espesor;
    }
    //GETTER PESO UNITARIO
    public int getPesoUnitario(){
        return pesoUnitario;
    }
    //SETTER PESO UNITARIO
    public void setPesoUnitario(int pesoUnitario){
        this.pesoUnitario=pesoUnitario;
    }
    //GETTER PESO METRO CUADRADO (M2)
    public int getPesoM2(){
        return pesoM2;
    }
    //SETTER PESO METRO CUADRADO (M2)
    public void setPesoM2(int pesoM2){
        this.pesoM2=pesoM2;
    }
}
