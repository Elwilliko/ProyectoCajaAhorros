package CajaAhorros.MavenCajaAhorros;

import controlador.Conexion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Conexion con = new Conexion();
    	con.getConnection();
    }
}
