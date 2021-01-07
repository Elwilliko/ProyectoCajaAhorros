package modelo;

import java.util.Calendar;

public class Horario {
    //Declaracion de Variables
    private int horario_id;
    private String hora_ingreso;
    private String hora_salida;
    private Banco banco;

    //Constructor
    public Horario(){

    }
    //Getters and Setters.

    public int getHorario_id() {
        return horario_id;
    }

    public void setHorario_id(int horario_id) {
        this.horario_id = horario_id;
    }

    public String getHora_ingreso() {
        return hora_ingreso;
    }

    public void setHora_ingreso(String hora_ingreso) {
        this.hora_ingreso = hora_ingreso;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
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
        return "Horario{" +
                "horario_id=" + horario_id +
                ", hora_ingreso='" + hora_ingreso + '\'' +
                ", hora_salida='" + hora_salida + '\'' +
                ", banco=" + banco +
                '}';
    }
}
