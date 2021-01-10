package CajaAhorros.MavenCajaAhorros;

import controlador.Conexion;
import controlador.ControladorBanco;
import controlador.ControladorHorario;
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
    }
}
