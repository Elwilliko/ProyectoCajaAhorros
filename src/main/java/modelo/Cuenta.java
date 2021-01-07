package modelo;

public class Cuenta {
    //Declaracion de variables
    private int cuenta_id;
    private int cuenta_numero;
    private double cuenta_saldo;

    //Construcor
    public Cuenta(){

    }

    //Getters and Setters.

    public int getCuenta_id() {
        return cuenta_id;
    }

    public void setCuenta_id(int cuenta_id) {
        this.cuenta_id = cuenta_id;
    }

    public int getCuenta_numero() {
        return cuenta_numero;
    }

    public void setCuenta_numero(int cuenta_numero) {
        this.cuenta_numero = cuenta_numero;
    }

    public double getCuenta_saldo() {
        return cuenta_saldo;
    }

    public void setCuenta_saldo(double cuenta_saldo) {
        this.cuenta_saldo = cuenta_saldo;
    }
    //toString

    @Override
    public String toString() {
        return "Cuenta{" +
                "cuenta_id=" + cuenta_id +
                ", cuenta_numero=" + cuenta_numero +
                ", cuenta_saldo=" + cuenta_saldo +
                '}';
    }
}
