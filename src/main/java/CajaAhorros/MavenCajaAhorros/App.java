package CajaAhorros.MavenCajaAhorros;

import Controlador.ControladorBanco;
import Controlador.ControladorEmepleado;
import Controlador.ControladorHorario;
import Vista.ListarBancos;
import Vista.VistaBanco;
import Vista.VistaEmpleados;
import Vista.VistaHorario;
import modelo.Banco;
import modelo.Horario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        VistaBanco vb = new VistaBanco();
        vb.setVisible(true);
        ListarBancos lb = new ListarBancos();
        lb.setVisible(true);
        VistaEmpleados ve = new VistaEmpleados();
        ve.setVisible(true);
        //ve.CargarBancos();
        ControladorBanco cb= new ControladorBanco();
        //cb.BucarIdBanco("Guayaquil");
        VistaHorario vh = new VistaHorario();
        vh.setVisible(true);

    }
}
