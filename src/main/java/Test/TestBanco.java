package Test;
import controlador.ControladorBanco;
import controlador.ControladorHorario;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestBanco {
    @Test
    public void ListarBancos(){
        //Instancia de la clase Controlador Banco
        ControladorBanco cb = new ControladorBanco();
        String R=cb.listarBancoTest();
        String expected="Correcto";

        assertEquals(expected,R);
    }

    @Test
    public void CrearBanco(){
        //Instancia de la clase Controlador Banco
        ControladorBanco cb = new ControladorBanco();
        String nombreB="Pasifico";
        String ubicacionB="Cuenca";
        String telefonoB="230101";
        String correoB="Pasifico.com";
        //cb.CrearBanco(nombreB,ubicacionB,telefonoB,correoB);
        String R=cb.listarBancoTest();
        String expected="Correcto";

        assertEquals(expected,R);
    }
}
