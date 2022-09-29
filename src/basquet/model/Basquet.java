package basquet.model;

public class Basquet {

    private int puntos;
    private int reboteDefensivo;
    private int reboteOfensivo;
    private int robo;
    private int tapa;
    private int falta;

    public Basquet(int puntos, int reboteDefensivo, int reboteOfensivo, int robo, int tapa, int falta) {
        this.puntos = puntos;
        this.reboteDefensivo = reboteDefensivo;
        this.reboteOfensivo = reboteOfensivo;
        this.robo = robo;
        this.tapa = tapa;
        this.falta = falta;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getReboteDefensivo() {
        return reboteDefensivo;
    }

    public void setReboteDefensivo(int reboteDefensivo) {
        this.reboteDefensivo = reboteDefensivo;
    }

    public int getReboteOfensivo() {
        return reboteOfensivo;
    }

    public void setReboteOfensivo(int reboteOfensivo) {
        this.reboteOfensivo = reboteOfensivo;
    }

    public int getRobo() {
        return robo;
    }

    public void setRobo(int robo) {
        this.robo = robo;
    }

    public int getTapa() {
        return tapa;
    }

    public void setTapa(int tapa) {
        this.tapa = tapa;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
}
