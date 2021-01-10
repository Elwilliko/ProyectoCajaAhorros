package Controlador;
import modelo.Horario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorHorario {
    //Instancia de la clase Horario
    Horario horario = new Horario();
    public void CrearHorario(String horario_ingreso,String horario_salida){
        //Conexion y Query para el insert
        Conexion conexion = new Conexion();
        conexion.getConnection();
        //PreparedStatement psHorario = null;

        String query = "INSERT INTO horario (horario_id,horario_ingreso, horario_salida) values (?, ?, ?)";
        try{
            PreparedStatement psHorario=conexion.con.prepareStatement(query);

            psHorario.setInt(1,0);
            psHorario.setString(2,horario_ingreso);
            psHorario.setString(3,horario_salida);

            psHorario.executeUpdate();
            psHorario.close();
            System.out.println("Datos Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos no se registraron");
        }
    }

    public void listarHorario(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();


        try{
            String query = " SELECT * FROM horario ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" ID :" + resultSet.getInt("horario_id") + "| Hora Ingreso: " + resultSet.getString(
                        "horario_ingreso") +
                        "| Hora Salida: " + resultSet.getString("horario_salida"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados");
        }
    }
    public String listarHorarioTest(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();


        try{
            String query = " SELECT * FROM horario ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" ID :" + resultSet.getInt("horario_id") + "| Hora Ingreso: " + resultSet.getString(
                        "horario_ingreso") +
                        "| Hora Salida: " + resultSet.getString("horario_salida"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados");
        }
        return "Correcto";
    }
}
