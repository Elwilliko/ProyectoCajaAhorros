package CajaAhorros.MavenCajaAhorros;

import Controlador.ControladorBanco;
import Controlador.ControladorEmepleado;
import Controlador.ControladorHorario;
import Vista.ListarBancos;
import Vista.VistaBanco;
import Vista.VistaCliente;
import Vista.VistaEmpleados;
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
        VistaCliente vc = new VistaCliente();
        vc.setVisible(true);
        //ve.CargarBancos();
        ControladorBanco cb= new ControladorBanco();
        //cb.BucarIdBanco("Guayaquil");

    }
}
