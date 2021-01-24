package Controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Cliente;

public class ClienteCRUD {

	private ArrayList<Cliente> listadoClientes;
	
	
	/**
	 * @return the listadoClientes
	 */
	public ArrayList<Cliente> getListadoClientes() {
		return listadoClientes;
	}


	/**
	 * @param listadoClientes the listadoClientes to set
	 */
	public void setListadoClientes(Cliente listadoClientes) {
		this.listadoClientes.add(listadoClientes);
	}

	
	public void crearCliente(String cedula, String nombre, String apellido, String direccion, String telefono, String correo, String edad){
        //Conexion y Query para el insert
        Conexion conexion = new Conexion();
        conexion.getConnection();
        String query_persona = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_direccion,"
        		+ "per_telefono, per_correo, per_edad) VALUES (?, ?, ?, ?, ?, ?, ?)";
        /*
        String query_cliente = "INSERT INTO cliente (cli_id, cli_contrasena, Banco_banco_id, Cuenta_cuenta_id,"
        		+ "Persona_per_cedula, Persona_Empleado_empleado_id) VALUES (?, ?, ?, ?, ?, ?)";
        */
        int intCedula = Integer.parseInt(cedula);
        
        try{
            PreparedStatement psCliente = conexion.con.prepareStatement(query_persona);
         
            psCliente.setInt(1,intCedula);
            psCliente.setString(2,nombre);
            psCliente.setString(3,apellido);
            psCliente.setString(4,direccion);
            psCliente.setString(5,telefono);
            psCliente.setString(6,correo);
            psCliente.setString(7,edad);
            //psCliente.setInt(6,1);

            psCliente.executeUpdate();
            psCliente.close();
            System.out.println("Datos de cliente Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos de cliente no se registraron");
            System.err.println(e);
        }
    }
		
	

}
