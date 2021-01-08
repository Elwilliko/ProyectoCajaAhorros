package Test;
import Controlador.ControladorBanco;
import Controlador.ControladorHorario;
import modelo.Horario;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestHorario {

    @Test
    public void listarhorario(){
        //Instancia de la clase Controlador Horario
        ControladorHorario ch = new ControladorHorario();
        //ch.CrearHorario(HIngreso,HSalida);
        String R=ch.listarHorarioTest();
        String expected="Correcto";

        assertEquals(expected,R);
    }
    @Test
    public void CrearHorario(){
        String HIngreso="7:00";
        String HSalida="18:00";
        //Instancia de la clase Controlador Horario
        ControladorHorario ch = new ControladorHorario();
        //ch.CrearHorario(HIngreso,HSalida);
        String R=ch.listarHorarioTest();
        String expected="Correcto";

        assertEquals(expected,R);
    }
}
