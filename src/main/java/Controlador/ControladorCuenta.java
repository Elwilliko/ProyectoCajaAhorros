package Controlador;

import modelo.Banco;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ControladorCuenta {
    public void CrearCuenta(String saldo) {
        //Conexion y Query para el insert
        Conexion conexion = new Conexion();
        conexion.getConnection();

        String query = "INSERT INTO cuenta (cuenta_id,cuenta_numero, cuenta_saldo) values (?, ?, ?)";
        try{
            PreparedStatement psBanco=conexion.con.prepareStatement(query);
            psBanco.setInt(1,0);
            psBanco.setString(2,"1");
            psBanco.setString(3,saldo);

            psBanco.executeUpdate();
            psBanco.close();
            System.out.println("Datos Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos no se registraron");
        }
    }


    /** Metodo para obtener la ide de la cuenta **/
    public int getCuenta(String num_cuenta) {
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        int id = 0;
        try{
            String query = "SELECT * FROM cuenta WHERE cuenta_numero ='"+num_cuenta+"'";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(id = resultSet.getInt("cuenta_id"));
            }

            select.close();
            select.close();
        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return id;
    }


    public List<String> listarCuentas(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();
        ArrayList<String> cuentas = new ArrayList<String>();

        try{
            String query = " SELECT * FROM cuenta ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet = select.executeQuery(query);

            while (resultSet.next()) {
                cuentas.add(resultSet.getString("cuenta_numero"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return cuentas;
    }

}
