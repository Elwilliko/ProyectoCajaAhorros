package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Conexion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class RegistroPersona extends JFrame {

	private JPanel contentPane;
	private JTextField textCedula;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textDireccion;
	private JTextField textTelefono;
	private JTextField textCorreo;
	private JTextField textEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPersona frame = new RegistroPersona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 *
	 */
	private void limpiar() {
		textCedula.setText(null);
		textNombre.setText(null);
		textApellido.setText(null);
		textDireccion.setText(null);
		textTelefono.setText(null);
		textCorreo.setText(null);
		textEdad.setText(null);
	}
	public RegistroPersona() {
		setTitle("Registro Persona");
		getContentPane().setLayout(null);
		setTitle("Registro Persona");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCedula = new JLabel("Cédula:");
		lblCedula.setBounds(89, 43, 56, 16);
		contentPane.add(lblCedula);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(89, 84, 56, 16);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(89, 125, 56, 16);
		contentPane.add(lblApellido);
		
		JLabel lblDireccion = new JLabel("Dirección:");
		lblDireccion.setBounds(89, 169, 64, 16);
		contentPane.add(lblDireccion);
		
		JLabel lblTelefono = new JLabel("Teléfono:");
		lblTelefono.setBounds(89, 209, 56, 16);
		contentPane.add(lblTelefono);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(89, 251, 56, 16);
		contentPane.add(lblCorreo);
		
		JLabel lblNewLabel = new JLabel("Edad:");
		lblNewLabel.setBounds(89, 291, 56, 16);
		contentPane.add(lblNewLabel);
		
		textCedula = new JTextField();
		textCedula.setBounds(157, 40, 115, 22);
		contentPane.add(textCedula);
		textCedula.setColumns(10);
		
		textNombre = new JTextField();
		textNombre.setBounds(157, 75, 206, 22);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(157, 119, 206, 22);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textDireccion = new JTextField();
		textDireccion.setBounds(157, 166, 206, 22);
		contentPane.add(textDireccion);
		textDireccion.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(157, 206, 206, 22);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(157, 248, 206, 22);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textEdad = new JTextField();
		textEdad.setBounds(157, 288, 206, 22);
		contentPane.add(textEdad);
		textEdad.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PreparedStatement ps = null;

				  try {
			        
			            Conexion Con = new Conexion();
			            Connection con = Con.getConnection();
			            System.out.println("hola");
			            ps = con.prepareStatement("INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_direccion,per_telefono,per_correo, per_edad) VALUES (?,?,?,?,?,?,?)");
			            ps.setString(1, textCedula.getText());
			            ps.setString(2, textNombre.getText());
			            ps.setString(3, textApellido.getText());
			            ps.setString(4, textDireccion.getText());
			            ps.setString(5, textTelefono.getText());
			            ps.setString(6, textCorreo.getText());
			            ps.setString(7, textEdad.getText());


			            int res = ps.executeUpdate();
			            
			            if(res > 0) {
				            JOptionPane.showMessageDialog(null, "Persona Agregada");
			            	limpiar();
			            }else {
			            	JOptionPane.showMessageDialog(null, "error al guardar persona");
			            	limpiar();
			            }

			            con.close();
			            
			        } catch (SQLException ex) {
			            JOptionPane.showMessageDialog(null, "Persona no se ingreso correctamente");
			            System.out.println(ex);
			        }
			}
			
		});
		btnGuardar.setBounds(477, 116, 97, 25);
		contentPane.add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(477, 160, 97, 25);
		contentPane.add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(477, 205, 97, 25);
		contentPane.add(btnEliminar);
		
		
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(477, 247, 97, 25);
		contentPane.add(btnLimpiar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(284, 39, 79, 25);
		contentPane.add(btnBuscar);
	}
}
