package pokemon;

public enum TipoPoke {
    FUEGO(0),
    AGUA(1),
    PLANTA(2),
    ELECTRICO(3),
    BICHO(4),
    VOLADOR(5),
    NORMAL(6),
    ROCA(7);
    private int posicion;

    private TipoPoke(int posicion) {
        this.posicion = posicion;
    }
    //GETTER
    public int damePosicion(){
        return posicion;
    }

    public static double[][] multiplicadorDamage = {
            {0.5, 0.5, 2.0, 1.0, 2.0, 1.0, 1.0, 0.5},
            {2.0, 0.5, 0.5, 1.0, 1.0, 1.0, 1.0, 2.0},
            {0.5, 2.0, 0.5, 1.0, 0.5, 0.5, 1.0, 2.0},
            {1.0, 2.0, 0.5, 0.5, 1.0, 2.0, 1.0, 1.0},
            {0.5, 1.0, 2.0, 1.0, 1.0, 0.5, 1.0, 1.0},
            {1.0, 1.0, 2.0, 0.5, 2.0, 1.0, 1.0, 0.5},
            {1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.5},
            {2.0, 1.0, 1.0, 1.0, 2.0, 2.0, 0.5, 1.0}
    };

}
