package colecciones;

import java.util.Objects;

public class Cliente {

    private String nombre;
    private String nroCuenta;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(String nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nroCuenta, cliente.nroCuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nroCuenta);
    }

    public Cliente(String nombre, String nroCuenta, double saldo){

        this.nombre=nombre;
        this.nroCuenta=nroCuenta;
        this.saldo=saldo;

    }
}
