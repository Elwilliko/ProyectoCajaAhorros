package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con=null;
    public Connection getConnection(){
        try {
        	
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/cahorros?useTimezone=true&serverTimezone=UTC";
			String usuario = "root";
			String clave = "Patito.123";

			con = DriverManager.getConnection(url, usuario, clave);
           // Class.forName("com.mysql.jdbc.Driver");

            //con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cahorros","root","Patito.123");

            System.out.println("Conexion Exitosa:");
        } catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error con la ====> BD");
			e.printStackTrace();
		}
		
		return con;

	}
    
}
