package Main;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setForeground(new Color(255, 255, 255));
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Factura en Java");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout());
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del Cliente", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setLayout(null);
		panel_2.setPreferredSize(new Dimension(250, 80));
		panel_1.add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Documento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 29, 69, 12);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(85, 28, 96, 18);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Dirección:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(20, 51, 55, 12);
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 50, 96, 18);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(235, 31, 61, 12);
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(308, 28, 118, 18);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Teléfono:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(233, 52, 63, 12);
		panel_2.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(308, 49, 118, 18);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setPreferredSize(new Dimension(250, 80));
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Datos de Factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setLayout(null);
		panel_3.setBounds(0, 0, 436, 59);
		panel_4.add(panel_3);
		
		JLabel lblNewLabel_5 = new JLabel("No. de Factura:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(10, 23, 82, 12);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("1");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(100, 23, 21, 12);
		panel_3.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(222, 24, 44, 12);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("21/03/2026");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setBounds(273, 24, 82, 12);
		panel_3.add(lblNewLabel_8);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_5.setLayout(null);
		panel_5.setBounds(0, 60, 436, 38);
		panel_4.add(panel_5);
		
		ImageIcon listado = new ImageIcon("menu.jpg");
	    JLabel listado_factura = new JLabel();
	    listado_factura.setBounds(10, 3, 30, 30);
	    listado_factura.setIcon(new ImageIcon(listado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
	    panel_5.add(listado_factura);
	    
	    ImageIcon mas = new ImageIcon("mas.jpg");
	    JLabel mas_factura = new JLabel();
	    mas_factura.setBounds(270, 5, 26, 26);
	    mas_factura.setIcon(new ImageIcon(mas.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH)));
	    panel_5.add(mas_factura);
	    
	    ImageIcon eliminar = new ImageIcon("elim.jpg");
	    JLabel eliminar_factura = new JLabel();
	    eliminar_factura.setBounds(350, 5, 26, 26);
	    eliminar_factura.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(26, 26, Image.SCALE_SMOOTH)));
	    panel_5.add(eliminar_factura);
	    
	    JLabel lblNewLabel_18 = new JLabel("Ver listado de facturas");
	    lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblNewLabel_18.setBounds(46, 13, 129, 12);
	    panel_5.add(lblNewLabel_18);
	    
	    JLabel lblNewLabel_19 = new JLabel("Añadir");
	    lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblNewLabel_19.setBounds(304, 13, 44, 12);
	    panel_5.add(lblNewLabel_19);
	    
	    JLabel lblNewLabel_20 = new JLabel("Eliminar");
	    lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
	    lblNewLabel_20.setBounds(382, 14, 44, 12);
	    panel_5.add(lblNewLabel_20);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", 2, 500, 1000.0},
		        {"Cereal", 5, 1000, 5000.0},
		        {"Leche", 2, 300, 600.0},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Integer.class, Integer.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(98);
		table.getColumnModel().getColumn(0).setMaxWidth(2147483643);
		table.setBounds(0, 124, 436, 59);
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 100, 436, 76);
		
		panel_4.setLayout(null);
		panel_4.add(scrollPane);
		
		JLabel lblNewLabel_9 = new JLabel("SubTotal:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(10, 176, 61, 12);
		panel_4.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("6600.0");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_10.setBounds(92, 178, 44, 12);
		panel_4.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("% Descuento: ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(10, 198, 80, 12);
		panel_4.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 196, 24, 18);
		panel_4.add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(115, 195, 21, 20);
		panel_4.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_12 = new JLabel("IVA 19%:");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(10, 220, 61, 12);
		panel_4.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Total Factura:");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_13.setBounds(10, 242, 80, 12);
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Valor descontado: ");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(155, 199, 98, 12);
		panel_4.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("1254.0");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(92, 220, 44, 12);
		panel_4.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("7524.0");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(92, 243, 44, 12);
		panel_4.add(lblNewLabel_16);
		
		JButton btnNewButton = new JButton("Finalizar Factura");
		btnNewButton.setBounds(232, 266, 117, 20);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(352, 266, 80, 20);
		panel_4.add(btnNewButton_1);
		
		JLabel lblNewLabel_17 = new JLabel("330.0");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(263, 199, 44, 12);
		panel_4.add(lblNewLabel_17);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 283, 436, 19);
		panel_4.add(panel_6);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(0, 64, 128));
		frame.getContentPane().add(panel_7, BorderLayout.SOUTH);
		
		
		
	}
}
