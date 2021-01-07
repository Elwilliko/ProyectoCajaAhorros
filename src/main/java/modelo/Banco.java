package modelo;

public class Banco {
    //Declaracion de Variables
    private int banco_id;
    private String banco_nombre;
    private String banco_ubicacion;
    private String banco_telefono;
    private String banco_correo;


    //Constructor
    public Banco(){

    }
    //Setters and Getters
    public int getBanco_id() {
        return banco_id;
    }

    public void setBanco_id(int banco_id) {
        this.banco_id = banco_id;
    }

    public String getBanco_nombre() {
        return banco_nombre;
    }

    public void setBanco_nombre(String banco_nombre) {
        this.banco_nombre = banco_nombre;
    }

    public String getBanco_ubicacion() {
        return banco_ubicacion;
    }

    public void setBanco_ubicacion(String banco_ubicacion) {
        this.banco_ubicacion = banco_ubicacion;
    }

    public String getBanco_telefono() {
        return banco_telefono;
    }

    public void setBanco_telefono(String banco_telefono) {
        this.banco_telefono = banco_telefono;
    }

    public String getBanco_correo() {
        return banco_correo;
    }

    public void setBanco_correo(String banco_correo) {
        this.banco_correo = banco_correo;
    }

    //ToString
    @Override
    public String toString() {
        return "Banco{" +
                "banco_id=" + banco_id +
                ", banco_nombre='" + banco_nombre + '\'' +
                ", banco_ubicacion='" + banco_ubicacion + '\'' +
                ", banco_telefono='" + banco_telefono + '\'' +
                ", banco_correo='" + banco_correo + '\'' +
                '}';
    }
}
