package controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ahorros","root","Patito.123");
            System.out.println("Conexion Exitosa:");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    
}
