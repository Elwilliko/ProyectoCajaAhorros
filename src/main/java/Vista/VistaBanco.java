package Vista;

import Controlador.ControladorBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaBanco extends JFrame{
    private JTextField txtNombreBanco;
    private JTextField txtUbicacionBanco;
    private JTextField txtTelefonoBanco;
    private JTextField txtCorreoBanco;
    private JComboBox cmbHorarioBanco;
    private JButton btnRegistrar;
    private JPanel BancoPanel;

    public VistaBanco(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(BancoPanel);
        this.setSize(600,600);
        this.pack();
        //Se agrega los itmes al comboBOX
        cmbHorarioBanco.addItem("Select One");
        cmbHorarioBanco.addItem("Matutito");

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre=txtNombreBanco.getText();
                String ubicacion=txtUbicacionBanco.getText();
                String telefono=txtTelefonoBanco.getText();
                String correo=txtCorreoBanco.getText();
                String horario= (String) cmbHorarioBanco.getSelectedItem();
                if(horario.equals("Matutito")){
                    int horarioBanco=1;
                }
                //Se inserta al nuevo BANCO
                ControladorBanco cb = new ControladorBanco();
                cb.CrearBanco(nombre,ubicacion,telefono,correo);
                JOptionPane.showMessageDialog(null,"Banco Creado Exitosamente. ");
                txtNombreBanco.setText("");
                txtUbicacionBanco.setText("");
                txtTelefonoBanco.setText("");
                txtCorreoBanco.setText("");
            }
        });
    }


}
