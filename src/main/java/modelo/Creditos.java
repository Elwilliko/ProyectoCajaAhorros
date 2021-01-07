package modelo;

public class Creditos {
    //Declaracion de Variables
    private int credito_id;
    private String credito_aprovacion;
    private double credito_monto;
    private Cuenta cuenta;
    
    //Constructor
    public Creditos(){

    }
    //Getters and Setters.

    public int getCredito_id() {
        return credito_id;
    }

    public void setCredito_id(int credito_id) {
        this.credito_id = credito_id;
    }

    public String getCredito_aprovacion() {
        return credito_aprovacion;
    }

    public void setCredito_aprovacion(String credito_aprovacion) {
        this.credito_aprovacion = credito_aprovacion;
    }

    public double getCredito_monto() {
        return credito_monto;
    }

    public void setCredito_monto(double credito_monto) {
        this.credito_monto = credito_monto;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    //toString
    @Override
    public String toString() {
        return "Creditos{" +
                "credito_id=" + credito_id +
                ", credito_aprovacion='" + credito_aprovacion + '\'' +
                ", credito_monto=" + credito_monto +
                ", cuenta=" + cuenta +
                '}';
    }
}
