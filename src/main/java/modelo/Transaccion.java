package modelo;

public class Transaccion {
    //Declaracion de variables
    private int transaccion_id;
    private String transaccion_tipo;
    private double transaccion_monto;
    private Cuenta cuenta;
    private Banco banco;

    //Constructor
    public Transaccion(){

    }
    //Getters and Setters.
    public int getTransaccion_id() {
        return transaccion_id;
    }

    public void setTransaccion_id(int transaccion_id) {
        this.transaccion_id = transaccion_id;
    }

    public String getTransaccion_tipo() {
        return transaccion_tipo;
    }

    public void setTransaccion_tipo(String transaccion_tipo) {
        this.transaccion_tipo = transaccion_tipo;
    }

    public double getTransaccion_monto() {
        return transaccion_monto;
    }

    public void setTransaccion_monto(double transaccion_monto) {
        this.transaccion_monto = transaccion_monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

   //toString
    @Override
    public String toString() {
        return "Transaccion{" +
                "transaccion_id=" + transaccion_id +
                ", transaccion_tipo='" + transaccion_tipo + '\'' +
                ", transaccion_monto=" + transaccion_monto +
                ", cuenta=" + cuenta +
                ", banco=" + banco +
                '}';
    }
}
