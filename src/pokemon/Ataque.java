package pokemon;

public class Ataque {

    private String nombre;
    private int damage;
    private TipoPoke tipo;

    //CONSTRUCTOR
    public Ataque(String nombre, int damage, TipoPoke tipo) {

        this.nombre = nombre;
        this.damage = damage;
        this.tipo = tipo;
    }

    //CONSTRUCTOR
    public Ataque(String nombre, TipoPoke tipo) {
        this(nombre, 5, tipo);
    }

    //GETTER NOMBRE
    public String getNombre() {
        return nombre;
    }

    //SETTER NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //GETTER DAMAGE
    public int getDamage() {
        return damage;
    }

    //SETTER DAMAGE
    public void setDamage(int damage) {
        this.damage = damage;
    }

    //GETTER TIPO
    public TipoPoke getTipo() {
        return tipo;
    }

    //SETTER TIPO
    public void setTipo(TipoPoke tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Damage: " + damage + ", Tipo: " + tipo;
    }
}
