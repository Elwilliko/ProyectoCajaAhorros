package Controlador;

import modelo.Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorBanco {
    public void CrearBanco(String banco_nombre,String banco_ubicacion,String banco_Telefono,String banco_correo){
        //Conexion y Query para el insert
        Conexion conexion = new Conexion();
        conexion.getConnection();

        String query = "INSERT INTO banco (banco_id,banco_nombre, Banco_ubicacion,Banco_telefono," +
                "Banco_correo,Horario_horario_id) values (?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement psBanco=conexion.con.prepareStatement(query);

            psBanco.setInt(1,0);
            psBanco.setString(2,banco_nombre);
            psBanco.setString(3,banco_ubicacion);
            psBanco.setString(4,banco_Telefono);
            psBanco.setString(5,banco_correo);
            psBanco.setInt(6,1);

            psBanco.executeUpdate();
            psBanco.close();
            System.out.println("Datos Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos no se registraron");
        }
    }
    public void listarBanco(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " SELECT * FROM banco ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" ID: "+resultSet.getInt("banco_id") + " | Banco: "+resultSet.getString(
                        "banco_nombre")+" | Ubicacion: "+resultSet.getString("Banco_ubicacion")+" | Telefono: "+
                        resultSet.getString("Banco_telefono")+ " | Correo: "+resultSet.getString("Banco_correo")
                + "| Horario ID "+ resultSet.getInt("Horario_horario_id"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
    }

    public void actualizarBanco(String banco_Ubicacion){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " UPDATE banco set Banco_ubicacion=? WHERE banco_id=? ";
            PreparedStatement psBanco=conexion.con.prepareStatement(query);
            psBanco.setString(1,banco_Ubicacion);
            psBanco.setInt(2,2);

            psBanco.executeUpdate();
            psBanco.close();

            System.out.println("Datos Actualizados Correctamente .");
        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
    }

    public void eliminarBanco(int banco_id){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " DELETE FROM banco WHERE banco_id=? ";
            PreparedStatement psBanco=conexion.con.prepareStatement(query);
            psBanco.setInt(1,banco_id);
            psBanco.executeUpdate();
            psBanco.close();

            System.out.println("Datos Eliminados Correctamente .");
        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }

    }

    public String listarBancoTest(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " SELECT * FROM banco ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" ID: "+resultSet.getInt("banco_id") + " | Banco: "+resultSet.getString(
                        "banco_nombre")+" | Ubicacion: "+resultSet.getString("Banco_ubicacion")+" | Telefono: "+
                        resultSet.getString("Banco_telefono")+ " | Correo: "+resultSet.getString("Banco_correo")
                        + "| Horario ID "+ resultSet.getInt("Horario_horario_id"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return "Correcto";
    }

    public List<String> listarNombreBancos(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();
        ArrayList<String> bancos = new ArrayList<String>();

        try{
            String query = " SELECT * FROM banco ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                bancos.add(resultSet.getString(
                        "banco_nombre"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return bancos;
    }

    public int BucarIdBanco(String nombre) {
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();
        Banco banco= new Banco();
        ArrayList<String> bancoxNombre = new ArrayList<String>();
        int id=0;
        try{
            String query = " SELECT * FROM banco where banco_nombre='"+nombre+"'";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(id=resultSet.getInt("banco_id"));
            }

            select.close();
            select.close();
        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return id;
    }
}
