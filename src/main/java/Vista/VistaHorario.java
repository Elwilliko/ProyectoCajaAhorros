package Vista;

import Controlador.ControladorHorario;
import modelo.Horario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaHorario extends JFrame {
    private JTextField txtHorarioIngreso;
    private JTextField txtHorarioSalida;
    private JButton btnRegistrarHorario;
    private JPanel PanelHorario;
    //Constructor
    public VistaHorario(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(PanelHorario);
        setSize(600,600);
        this.pack();
        btnRegistrarHorario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horaIngreso=txtHorarioIngreso.getText();
                String horaSalida=txtHorarioSalida.getText();
                Horario h = new Horario();
                ControladorHorario ch = new ControladorHorario();
                ch.CrearHorario(horaIngreso,horaSalida);
                JOptionPane.showMessageDialog(null,"Horario Creado Exitosamente");
                txtHorarioIngreso.setText("");
                txtHorarioSalida.setText("");
            }
        });
    }

}
