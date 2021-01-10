package controlador;

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


	public void crearCliente(int codigo, String nombre, String apellido, String cedula, String direccion, String telefono, String correo, int edad, String contrasena) {
		Cliente cliente = new Cliente();
		cliente.setPer_nombre(nombre);
		cliente.setPer_apellido(apellido);
		cliente.setPer_edad(edad);
		cliente.setPer_cedula(cedula);
		cliente.setPer_direccion(direccion);
		cliente.setPer_telefono(telefono);
		cliente.setPer_correo(correo);
		cliente.setCli_contrasena(contrasena);
		setListadoClientes(cliente);
	}
	
	

}
