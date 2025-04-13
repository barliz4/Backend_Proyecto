import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class catalogo_productos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxClasicEdition;
	private JCheckBox chckbxClasicCapBlack;
	private JLabel lblProductosSeleccionados;
	int productosSeleccionados = 0; // empieza en 0



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					catalogo_productos frame = new catalogo_productos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public catalogo_productos() {
		setResizable(false);
		setTitle("Cátalogo");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\Imagen de WhatsApp 2025-03-10 a las 16.15.25_2ef7bec4.jpg"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 740, 515);
		contentPane = new JPanel();

		setContentPane(contentPane);
		contentPane.setLayout(null);	// es el AbsoluteLayout
		
		
		
		JLabel lblTitulo = new JLabel("BirdCaps");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 43));
		lblTitulo.setBounds(192, 11, 337, 43);
		GridBagConstraints gbc_lblTitulo = new GridBagConstraints();
		gbc_lblTitulo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitulo.gridx = 1;
		gbc_lblTitulo.gridy = 0;
		contentPane.add(lblTitulo, gbc_lblTitulo);
		
		JLabel lblGorra1 = new JLabel("");
		lblGorra1.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\sinletras-removebg-preview (1).png"));
		lblGorra1.setBounds(10, 143, 182, 96);
		GridBagConstraints gbc_lblGorra1 = new GridBagConstraints();
		gbc_lblGorra1.insets = new Insets(0, 0, 0, 5);
		gbc_lblGorra1.gridx = 1;
		gbc_lblGorra1.gridy = 1;
		contentPane.add(lblGorra1, gbc_lblGorra1);
		
		JLabel lblTula = new JLabel("");
		lblTula.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\tula22-removebg-preview (1).png"));
		lblTula.setBounds(271, 143, 180, 96);
		GridBagConstraints gbc_lblTula = new GridBagConstraints();
		gbc_lblTula.insets = new Insets(0, 0, 0, 5);
		gbc_lblTula.gridx = 2;
		gbc_lblTula.gridy = 1;
		contentPane.add(lblTula, gbc_lblTula);
		
		JLabel lblGorra3 = new JLabel("");
		lblGorra3.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\cap_black_dimensiones.png"));
		lblGorra3.setBounds(532, 143, 182, 96);
		GridBagConstraints gbc_lblGorra3 = new GridBagConstraints();
		gbc_lblGorra3.insets = new Insets(0, 0, 0, 5);
		gbc_lblGorra3.gridx = 3;
		gbc_lblGorra3.gridy = 1;
		contentPane.add(lblGorra3, gbc_lblGorra3);
		
		JLabel lblLogoIzquierda = new JLabel("");
		lblLogoIzquierda.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\logo_redimensionado.png"));
		lblLogoIzquierda.setBounds(-76, -19, 138, 88);
		GridBagConstraints gbc_lblLogoIzquierda = new GridBagConstraints();
		gbc_lblLogoIzquierda.insets = new Insets(0, 0, 0, 5);
		gbc_lblLogoIzquierda.gridx = 4;
		gbc_lblLogoIzquierda.gridy = 1;
		contentPane.add(lblLogoIzquierda, gbc_lblLogoIzquierda);
		
		JLabel lblSubGorra1 = new JLabel("Classic Cap Green Edition");
		lblSubGorra1.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1.setForeground(new Color(255, 255, 255));
		lblSubGorra1.setBounds(10, 105, 182, 27);
		GridBagConstraints gbc_lblSubGorra1 = new GridBagConstraints();
		gbc_lblSubGorra1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1.gridx = 5;
		gbc_lblSubGorra1.gridy = 1;
		contentPane.add(lblSubGorra1, gbc_lblSubGorra1);
		
		JLabel lblSubGorra2 = new JLabel("Classic Edition");
		lblSubGorra2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra2.setForeground(Color.WHITE);
		lblSubGorra2.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra2.setBounds(271, 105, 182, 27);
		GridBagConstraints gbc_lblSubGorra2 = new GridBagConstraints();
		gbc_lblSubGorra2.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra2.gridx = 6;
		gbc_lblSubGorra2.gridy = 1;
		contentPane.add(lblSubGorra2, gbc_lblSubGorra2);
		
		JLabel lblSubGorra3 = new JLabel("Classic Cap Black");
		lblSubGorra3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra3.setForeground(Color.WHITE);
		lblSubGorra3.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra3.setBounds(532, 105, 182, 27);
		GridBagConstraints gbc_lblSubGorra3 = new GridBagConstraints();
		gbc_lblSubGorra3.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra3.gridx = 7;
		gbc_lblSubGorra3.gridy = 1;
		contentPane.add(lblSubGorra3, gbc_lblSubGorra3);
		
		JLabel lblSubGorra1_1 = new JLabel("BirCaps");
		lblSubGorra1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1.setForeground(Color.WHITE);
		lblSubGorra1_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblSubGorra1_1.setBounds(10, 260, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1 = new GridBagConstraints();
		gbc_lblSubGorra1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1.gridx = 8;
		gbc_lblSubGorra1_1.gridy = 1;
		contentPane.add(lblSubGorra1_1, gbc_lblSubGorra1_1);
		
		JLabel lblSubGorra1_1_1 = new JLabel("$70.000");
		lblSubGorra1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1_1.setForeground(Color.WHITE);
		lblSubGorra1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra1_1_1.setBounds(10, 298, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1_1 = new GridBagConstraints();
		gbc_lblSubGorra1_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1_1.gridx = 9;
		gbc_lblSubGorra1_1_1.gridy = 1;
		contentPane.add(lblSubGorra1_1_1, gbc_lblSubGorra1_1_1);
		
		JLabel lblSubGorra1_1_2 = new JLabel("BirCaps");
		lblSubGorra1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1_2.setForeground(Color.WHITE);
		lblSubGorra1_1_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblSubGorra1_1_2.setBounds(271, 260, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1_2 = new GridBagConstraints();
		gbc_lblSubGorra1_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1_2.gridx = 10;
		gbc_lblSubGorra1_1_2.gridy = 1;
		contentPane.add(lblSubGorra1_1_2, gbc_lblSubGorra1_1_2);
		
		JLabel lblSubGorra1_1_2_1 = new JLabel("BirCaps");
		lblSubGorra1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1_2_1.setForeground(Color.WHITE);
		lblSubGorra1_1_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 14));
		lblSubGorra1_1_2_1.setBounds(532, 267, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1_2_1 = new GridBagConstraints();
		gbc_lblSubGorra1_1_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1_2_1.gridx = 11;
		gbc_lblSubGorra1_1_2_1.gridy = 1;
		contentPane.add(lblSubGorra1_1_2_1, gbc_lblSubGorra1_1_2_1);
		
		JLabel lblSubGorra1_1_1_1 = new JLabel("$70.000");
		lblSubGorra1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1_1_1.setForeground(Color.WHITE);
		lblSubGorra1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra1_1_1_1.setBounds(271, 298, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1_1_1 = new GridBagConstraints();
		gbc_lblSubGorra1_1_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1_1_1.gridx = 12;
		gbc_lblSubGorra1_1_1_1.gridy = 1;
		contentPane.add(lblSubGorra1_1_1_1, gbc_lblSubGorra1_1_1_1);
		
		JLabel lblSubGorra1_1_1_1_1 = new JLabel("$70.000");
		lblSubGorra1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubGorra1_1_1_1_1.setForeground(Color.WHITE);
		lblSubGorra1_1_1_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblSubGorra1_1_1_1_1.setBounds(532, 298, 182, 27);
		GridBagConstraints gbc_lblSubGorra1_1_1_1_1 = new GridBagConstraints();
		gbc_lblSubGorra1_1_1_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblSubGorra1_1_1_1_1.gridx = 13;
		gbc_lblSubGorra1_1_1_1_1.gridy = 1;
		contentPane.add(lblSubGorra1_1_1_1_1, gbc_lblSubGorra1_1_1_1_1);
		
		
		
		//BOTON CONFIRMAR
		JButton btnComprar = new JButton("");
		btnComprar.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\carro_verdetamaño.png"));
		
		btnComprar.setContentAreaFilled(false);	// Quita el fondo de relleno
		btnComprar.setBorderPainted(false);		// Quita el borde
		btnComprar.setFocusPainted(false);		// Quita el contorno de enfoque
		

		btnComprar.addActionListener(new ActionListener() {
			
		    public void actionPerformed(ActionEvent e) {
		        // Verificación: Si NO hay ningún producto seleccionado
		        if (!chckbxNewCheckBox.isSelected() &&
		            !chckbxClasicEdition.isSelected() &&
		            !chckbxClasicCapBlack.isSelected()) {

		            JOptionPane.showMessageDialog(null, "No has seleccionado ningún producto.");
		            return; // Detiene la ejecución
		        }
		        try {Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/proyecto_sena", "santiago", "123456!");

		        	String fechaHoy = LocalDate.now().toString();

		           
		        	if (chckbxNewCheckBox.isSelected()) {
		        		PreparedStatement ps = conn.prepareStatement("INSERT INTO productos (nombre, fecha_registro, precio, id_color) VALUES (?, ?, ?, ?)");
		        	    ps.setString(1, "Classic Cap Green Edition");
		        	    ps.setString(2, fechaHoy);
		        	    ps.setInt(3, 70000); // Precios sin decimales
		        	    ps.setInt(4, 1); //  Este es el ID de 'verde'
		        	    ps.executeUpdate();
		        	}

					if (chckbxClasicEdition.isSelected()) {
						PreparedStatement ps = conn.prepareStatement("INSERT INTO productos (nombre, fecha_registro, precio, id_color) VALUES (?, ?, ?, ?)");
		                ps.setString(1, "Classic Edition");
		                ps.setString(2, fechaHoy);
		        	    ps.setInt(3, 70000); // Precios sin decimales
		        	    ps.setInt(4, 1); //  Este es el ID de 'verde'
		        	    ps.executeUpdate();		            
		            }


					if (chckbxClasicCapBlack.isSelected()) {
						PreparedStatement ps = conn.prepareStatement("INSERT INTO productos (nombre, fecha_registro, precio, id_color) VALUES (?, ?, ?, ?)");
		                ps.setString(1, "Classic Cap Black");
		                ps.setString(2, fechaHoy);
		                ps.setInt(3, 70000);	// Precios sin decimales
		                ps.setInt(4, 2); //  Este es el ID de 'negro'
		                ps.executeUpdate();
		            }

		            conn.close();
		            JOptionPane.showMessageDialog(null, "¡Productos registrados con éxito!");

		        } catch (SQLException ex) {
		            ex.printStackTrace();
		            JOptionPane.showMessageDialog(null, "Error al registrar los productos: " + ex.getMessage());
		        }
		    }
		});
		
		
		
		btnComprar.setFont(new Font("Arial", Font.BOLD, 15));
		btnComprar.setForeground(new Color(255, 255, 0));
		btnComprar.setBackground(new Color(0, 0, 0));
		btnComprar.setBounds(615, 11, 99, 32);
		GridBagConstraints gbc_btnComprar = new GridBagConstraints();
		gbc_btnComprar.insets = new Insets(0, 0, 0, 5);
		gbc_btnComprar.gridx = 14;
		gbc_btnComprar.gridy = 1;
		contentPane.add(btnComprar, gbc_btnComprar);
		
	

		
		
		//CHEKBOX 1
		chckbxNewCheckBox = new JCheckBox("Añadir");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 0));
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(10, 343, 182, 23);
		// Eliminar fondo
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBackground(null);
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxNewCheckBox.gridx = 15;
		gbc_chckbxNewCheckBox.gridy = 1;
		contentPane.add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		
		
		
		
		//CHEKBOX 2
		chckbxClasicEdition = new JCheckBox("Añadir");
		chckbxClasicEdition.setOpaque(false);
		chckbxClasicEdition.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxClasicEdition.setForeground(new Color(0, 0, 0));
		chckbxClasicEdition.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxClasicEdition.setBackground((Color) null);
		chckbxClasicEdition.setBounds(271, 343, 182, 23);
		GridBagConstraints gbc_chckbxClasicEdition = new GridBagConstraints();
		gbc_chckbxClasicEdition.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxClasicEdition.gridx = 16;
		gbc_chckbxClasicEdition.gridy = 1;
		contentPane.add(chckbxClasicEdition, gbc_chckbxClasicEdition);
		
		
		//CHEKBOX 3
		 chckbxClasicCapBlack = new JCheckBox("Añadir");
		chckbxClasicCapBlack.setOpaque(false);
		chckbxClasicCapBlack.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxClasicCapBlack.setForeground(new Color(0, 0, 0));
		chckbxClasicCapBlack.setFont(new Font("Arial", Font.BOLD, 12));
		chckbxClasicCapBlack.setBackground((Color) null);
		chckbxClasicCapBlack.setBounds(532, 343, 182, 23);
		GridBagConstraints gbc_chckbxClasicCapBlack = new GridBagConstraints();
		gbc_chckbxClasicCapBlack.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxClasicCapBlack.gridx = 17;
		gbc_chckbxClasicCapBlack.gridy = 1;
		contentPane.add(chckbxClasicCapBlack, gbc_chckbxClasicCapBlack);
		
		
		
		lblProductosSeleccionados = new JLabel("Productos Seleccionados: ");
		lblProductosSeleccionados.setForeground(Color.WHITE);
		lblProductosSeleccionados.setFont(new Font("Arial", Font.BOLD, 14));
		lblProductosSeleccionados.setBounds(10, 438, 227, 27);
		GridBagConstraints gbc_lblProductosSeleccionados = new GridBagConstraints();
		gbc_lblProductosSeleccionados.insets = new Insets(0, 0, 0, 5);
		gbc_lblProductosSeleccionados.gridx = 18;
		gbc_lblProductosSeleccionados.gridy = 1;
		contentPane.add(lblProductosSeleccionados, gbc_lblProductosSeleccionados);
		
		
		
		
		// Label Precio total de los productos seleccionados por el usuario
		JLabel lblTotal = new JLabel("Total: ");
		lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setFont(new Font("Arial", Font.BOLD, 16));
		lblTotal.setBounds(299, 437, 124, 27);
		GridBagConstraints gbc_lblTotal = new GridBagConstraints();
		gbc_lblTotal.gridx = 19;
		gbc_lblTotal.gridy = 1;
		contentPane.add(lblTotal, gbc_lblTotal);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Diana Lizcano\\OneDrive\\Escritorio\\iconos_proyecto\\fondo_gris (1).png"));
		lblNewLabel.setBounds(0, -224, 724, 700);
		contentPane.add(lblNewLabel);
	}

}
