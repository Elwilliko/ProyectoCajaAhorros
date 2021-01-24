package CajaAhorros.MavenCajaAhorros;

import Controlador.ClienteCRUD;
import Controlador.Conexion;
import Controlador.ControladorBanco;
import Controlador.ControladorHorario;
import modelo.Banco;
import modelo.Horario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	//Conexion con = new Conexion();
    	//con.getConnection();
    	//Instancia de la clase Horario
        Horario horario = new Horario();
        String HIngreso="7:00";
        String HSalida="18:00";
        //Instancia de la clase Controlador Horario
        ControladorHorario ch = new ControladorHorario();
        //ch.CrearHorario(HIngreso,HSalida);
        ch.listarHorario();
        //Instancia de la clase Controlador Banco
        ControladorBanco cb = new ControladorBanco();
        String nombreB="Pichincha";
        String ubicacionB="Cuenca";
        String telefonoB="5230101";
        String correoB="Pichincha.com";
        //cb.CrearBanco(nombreB,ubicacionB,telefonoB,correoB);
        cb.listarBanco();
        //Actualizacion de banco
        String ubicacionN="Quito";
        cb.actualizarBanco(ubicacionN);
        //Eliminacion de banco
        int bancoEliminar=2;
        //cb.eliminarBanco(bancoEliminar);
        
        ClienteCRUD cli = new ClienteCRUD();
        String cedula = "0105820138";
        String nombre = "Juan";
        String apellido = "Ramirez";
        String direccion = "Calle 1.10 y Sin npmbre";
        String telefono = "2053421";
        String email = "jramirez@gmail.com";
        String edad = "24";
        //, String cli_contrasena, int Banco_banco_id, String Cuenta_cuenta_id, String Persona_per_cedula, String Persona_Empleado_empleado_id
     
        cli.crearCliente(cedula, nombre, apellido, direccion, telefono, email, edad);
    }
}
