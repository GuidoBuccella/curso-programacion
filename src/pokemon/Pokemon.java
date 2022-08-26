package pokemon;

public class Pokemon {

    private String nombre;
    private int vidaActual;
    private int vidaMaxima;
    private int nivel;
    private TipoPoke tipo;
    private Ataque[] ataques;

    //CONSTRUCTOR
    public Pokemon(String nombre, int vidaMaxima, int nivel, TipoPoke tipo, Ataque[] ataques) {
        this.ataques = new Ataque[4];

        if (ataques.length > 4) {
            this.ataques[0] = ataques[0];
            this.ataques[1] = ataques[1];
            this.ataques[2] = ataques[2];
            this.ataques[3] = ataques[3];
        } else {
            for (int i = 0; i < ataques.length; i++) {
                this.ataques[i] = ataques[i];
            }
        }
        vidaActual=vidaMaxima;
        this.nombre = nombre;
        this.vidaMaxima=vidaMaxima;
        this.nivel = nivel;
        this.tipo = tipo;
    }
    //CONSTRUCTOR
    public Pokemon(String nombre, int vidaMaxima, int nivel, TipoPoke tipo) {
        vidaActual=vidaMaxima;
        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.nivel = nivel;
        this.tipo = tipo;
        ataques = new Ataque[4];
    }
    //CONSTRUCTOR
    public Pokemon(String nombre, TipoPoke tipo) {
        this(nombre, 100, 1, tipo);
    }

    //GETTER NOMBRE
    public String getNombre() {
        return nombre;
    }
    //SETTER NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTER NIVEL
    public int getNivel() {
        return nivel;
    }
    //SETTER NIVEL
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //GETTER VIDA ACTUAL
    public int getVidaActual() {
        return vidaActual;
    }
    //SETTER VIDA ACTUAL
    public void setVidaActual(int vidaActual) {

        if (vidaActual>vidaMaxima){
            this.vidaActual=vidaMaxima;
        }else this.vidaActual = vidaActual;
    }

    //GETTER VIDA MAXIMA
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    //SETTER VIDA MAXIMA
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    //GETTER TIPO
    public TipoPoke getTipo() {
        return tipo;
    }
    //SETTER TIPO
    public void setTipo(TipoPoke tipo) {
        this.tipo = tipo;
    }

    //GETTER ATAQUES
    public Ataque[] getAtaques() {
        return ataques;
    }
    //SETTER ATAQUES
    public void setAtaques(Ataque[] ataques) {
        this.ataques = new Ataque[4];

        if (ataques.length > 4) {
            this.ataques[0] = ataques[0];
            this.ataques[1] = ataques[1];
            this.ataques[2] = ataques[2];
            this.ataques[3] = ataques[3];
        } else {
            for (int i = 0; i < ataques.length; i++) {
                this.ataques[i] = ataques[i];
            }
        }
    }
    @Override
    public String toString(){

        String atack="";
        for (Ataque ataque:ataques){
            atack=atack+ataque + ".\n";
        }
        return "Nombre: " + nombre + "\nVida: " + vidaActual+"/"+vidaMaxima +
                "\nNivel: " + nivel + "\nTipo: " + tipo + "\nAtaques: " + atack;
    }
}
