package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListarBancos extends JFrame{
    private JPanel ListaBancos;
    private JButton listarButton;
    private JButton eliminarBancoButton;
    private JTextField txtBancoEliminar;
    private JTable showTable;
    //Constructor
    public ListarBancos(){

        CreateTable();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ListaBancos);
        //this.setContentPane(TablaBancos);
        this.setSize(600,600);
        this.pack();

        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Se lista los bancos existentes");
            }
        });
        eliminarBancoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id=txtBancoEliminar.getText();
                JOptionPane.showMessageDialog(null,"Se elimina el banco con el id"+id);
            }
        });
    }

    public void CreateTable(){
        showTable.setModel(new DefaultTableModel(
                null,
                new String[]{"ID","NOMBRE","UBICACION","TELEFONO","CORREO"}
        ));
    }
}
