package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Banco;
import modelo.Cliente;

public class ClienteCRUD {

	private ArrayList<Cliente> listadoClientes;


    public String getCedula() {
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        String cedula = "";
        try{
            String query = "SELECT per_cedula FROM persona ORDER BY per_cedula DESC LIMIT 1";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(cedula = resultSet.getString("per_cedula"));
            }

            select.close();
            select.close();
        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }
        return cedula;
    }




	public void crearCliente(String cedula, String nombre, String apellido, String direccion, String telefono, String correo, String edad, String contrasena, int banco_id, int cuenta_id){
        //Conexion y Query para el insert
        Conexion conexion = new Conexion();
        conexion.getConnection();
        String query_persona = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_direccion,"
        		+ "per_telefono, per_correo, per_edad) VALUES (?, ?, ?, ?, ?, ?, ?)";


        String query_cliente = "INSERT INTO cliente (cli_id, cli_contrasena, Banco_banco_id, Cuenta_cuenta_id,"
        		+ "Persona_per_cedula) VALUES (?, ?, ?, ?, ?)";

        
        try{
            PreparedStatement psPersona = conexion.con.prepareStatement(query_persona);
            PreparedStatement psCliente = conexion.con.prepareStatement(query_cliente);
         
            psPersona.setString(1,cedula);
            psPersona.setString(2,nombre);
            psPersona.setString(3,apellido);
            psPersona.setString(4,direccion);
            psPersona.setString(5,telefono);
            psPersona.setString(6,correo);
            psPersona.setString(7,edad);

            psCliente.setInt(1, 0);
            psCliente.setString(2, contrasena);
            psCliente.setInt(3, banco_id);
            psCliente.setInt(4, cuenta_id);
            psCliente.setString(5, cedula);

            psPersona.executeUpdate();
            psPersona.close();
            psCliente.executeUpdate();
            psCliente.close();
            System.out.println("Datos de cliente Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos de cliente no se registraron");
            System.err.println(e);
        }
    }


	public void listarClientes(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " SELECT * FROM cliente, persona WHERE persona_per_cedula = persona.per_cedula GROUP BY cli_id";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet = select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" cedula: "+resultSet.getString("persona_per_cedula") + " | Nombre Completo: " + resultSet.getString("per_nombre")
                        + " " + resultSet.getString("per_apellido") + "| Direccio: " + resultSet.getString("per_direccion")
                        +" | Telefono: "+ resultSet.getString("per_telefono")+ " | Correo: "+resultSet.getString("per_correo")
                        + "| Edad: "+ resultSet.getString("per_edad"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos del cliente registrados"+ e);
        }
    }

}
