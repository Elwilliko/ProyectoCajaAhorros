package Vista;

import Controlador.ClienteCRUD;
import Controlador.ControladorBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaCliente extends JFrame{
    private JPanel panelCliente;
    private JLabel lblCedula;
    private JTextField txtNombre;
    private JTextField txtCedula;
    private JTextField txtApellido;
    private JTextField txtDirección;
    private JLabel lblNombre;
    private JLabel lblApellido;
    private JLabel lblDireccion;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtEdad;
    private JLabel lblTelefono;
    private JLabel lblEdad;
    private JLabel lblCorreo;
    private JComboBox cmbBanco;
    private JLabel lblBanco;
    private JLabel lblCuenta;
    private JComboBox cmbCuenta;
    private JLabel lblContrasena;
    private JTextField txtContrasena;
    private JButton btnRegistrar;

    public VistaCliente() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelCliente);
        this.setSize(600,600);
        this.pack();
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = txtCedula.getText();
                String nombre = txtNombre.getText();
                String apellido = txtApellido.getText();
                String direccion = txtDirección.getText();
                String telefono = txtTelefono.getText();
                String correo = txtCorreo.getText();
                String edad = txtEdad.getText();
                String nombreB = (String) cmbBanco.getSelectedItem();
                String cuentaC = (String) cmbCuenta.getSelectedItem();
                String contrasena = txtContrasena.getText();

                ControladorBanco cb= new ControladorBanco();
                int idBanco = cb.BucarIdBanco(nombreB);
                ClienteCRUD cli = new ClienteCRUD();
                int idCuenta = cli.getCuenta(cuentaC);
                cli.crearCliente(cedula,nombre,apellido, direccion,telefono, correo, edad,contrasena,idBanco, idCuenta);

            }
        });
    }

    public void CargarBancos(){
        ControladorBanco cb = new ControladorBanco();
        ArrayList<String> bancos = new ArrayList<String>();
        bancos= (ArrayList<String>) cb.listarNombreBancos();

        System.out.println("Se imprime los bancos desde la clase empleados");
        for (int i = 0; i <bancos.size() ; i++) {
            //System.out.println(bancos.get(i));
            cmbBanco.addItem(bancos.get(i));

        }
    }
}
