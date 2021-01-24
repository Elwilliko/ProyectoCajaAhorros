package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
