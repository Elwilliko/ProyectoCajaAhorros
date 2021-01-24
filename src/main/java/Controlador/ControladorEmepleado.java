package Controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ControladorEmepleado {

    public void CrearEmpleado(String empleado_cargo,int Banco_id){
        Conexion conexion = new Conexion();
        conexion.getConnection();

        String query="INSERT INTO empleado(empleado_id,empleado_cargo,Banco_banco_id,Banco_Horario_horario_id)"+
                "VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement psEmpleado=conexion.con.prepareStatement(query);

            psEmpleado.setInt(1,0);
            psEmpleado.setString(2,empleado_cargo);
            psEmpleado.setInt(3,Banco_id);
            psEmpleado.setInt(4,1);
;

            psEmpleado.executeUpdate();
            psEmpleado.close();
            System.out.println("Datos Registrados Correctamente.");
        }catch (SQLException e){
            System.out.println("Error!, Los datos no se registraron");
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
