package Vista;

import Controlador.ControladorBanco;
import Controlador.ControladorEmepleado;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VistaEmpleados extends JFrame {
    private JTextField txtNombreEmpleado;
    private JComboBox cmbBancoE;
    private JComboBox cmbHorarioE;
    private JButton btnRegistrar;
    private JPanel panelEmpleados;
    private JTextField txtApellido;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JTextField txtCorreo;
    private JTextField txtEdad;
    private JTextField txtCedula;
    private JLabel lblCedula;
    private JTextField txtCargo;

    //Constructor
    public VistaEmpleados(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panelEmpleados);
        this.setSize(600,600);
        this.pack();
        CargarBancos();
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = txtCedula.getText();
                String nombreE=txtNombreEmpleado.getText();
                String apellido = txtApellido.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();
                String correo = txtCorreo.getText();
                int edad = Integer.parseInt(txtEdad.getText());
                String cargo = txtCargo.getText();
                String nombreB= (String) cmbBancoE.getSelectedItem();
                ControladorBanco cb= new ControladorBanco();
                int idBnaco=cb.BucarIdBanco(nombreB);
                System.out.println(idBnaco);
                //Se procede a insertar en la BD
                ControladorEmepleado ce = new ControladorEmepleado();
                ce.CrearEmpleado(cedula,nombreE, apellido, direccion, telefono, correo, edad, cargo, idBnaco);

                JOptionPane.showMessageDialog(null,"Empleado creado Correctamente");
                txtNombreEmpleado.setText("");
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
            cmbBancoE.addItem(bancos.get(i));

        }
        cmbHorarioE.addItem("Select One");
        cmbHorarioE.addItem("Matutino");
    }
}
