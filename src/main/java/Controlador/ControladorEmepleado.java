package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorEmepleado {

    public void CrearEmpleado(String cedula, String nombre, String apellido, String direccion, String telefono, String correo, int edad, String empleado_cargo,int Banco_id){
        Conexion conexion = new Conexion();
        conexion.getConnection();

        String query_persona = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_direccion,"
                + "per_telefono, per_correo, per_edad) VALUES (?, ?, ?, ?, ?, ?, ?)";

        String query = "INSERT INTO empleado(empleado_id, empleado_cargo, Banco_banco_id, Banco_Horario_horario_id, persona_per_cedula)"+
                "VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement psPersona = conexion.con.prepareStatement(query_persona);
            PreparedStatement psEmpleado=conexion.con.prepareStatement(query);

            psPersona.setString(1, cedula);
            psPersona.setString(2,nombre);
            psPersona.setString(3,apellido);
            psPersona.setString(4,direccion);
            psPersona.setString(5,telefono);
            psPersona.setString(6,correo);
            psPersona.setInt(7, edad);

            psEmpleado.setInt(1,0);
            psEmpleado.setString(2,empleado_cargo);
            psEmpleado.setInt(3,Banco_id);
            psEmpleado.setInt(4,1);
            psEmpleado.setString(5,cedula);


            psPersona.executeUpdate();
            psPersona.close();

            psEmpleado.executeUpdate();
            psEmpleado.close();
            System.out.println("Datos Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos no se registraron" + e);
        }
    }
    public void ListarEmpleados(){
        //Conexion y Query para el Select
        Conexion conexion = new Conexion();
        conexion.getConnection();

        try{
            String query = " SELECT * FROM empleado ";
            Statement select = conexion.con.createStatement();
            ResultSet resultSet=select.executeQuery(query);

            while (resultSet.next()) {
                System.out.println(" ID: "+resultSet.getInt("empleado_id") + " | Empleado: "+resultSet.getString(
                        "empleado_cargo")+" | ID BANCO: "+resultSet.getInt("Banco_banco_id")+" | ID Horario: "+
                        resultSet.getInt("Banco_Horario_horario_id"));
            }
            resultSet.close();
            select.close();

        }catch (SQLException e){
            System.out.println("Error!, No se encuentran datos registrados"+ e);
        }

    }
}
