package Main;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JButton;

public class Ventana2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana2 window = new Ventana2();
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
	public Ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Registro de usuarios");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(251, 64, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 231, 13));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.decode("#65F7CF"));
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_2.setLayout(null);
		
		JPanel panelTitulo = new JPanel();
		panelTitulo.setBackground(Color.decode("#65F7CF"));
		panelTitulo.setLayout(new FlowLayout(FlowLayout.LEFT));

		panel_2.add(panelTitulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setBounds(10, 21, 100, 28);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno: ");
		lblNewLabel_3.setBounds(10, 40, 100, 50);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno: ");
		lblNewLabel_4.setBounds(10, 70, 130, 50);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de Nacimiento: ");
		lblNewLabel_5.setBounds(10, 100, 130, 50);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Sexo: ");
		lblNewLabel_6.setBounds(10, 130, 50, 50);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad: ");
		lblNewLabel_7.setBounds(10, 200, 120, 50);
		panel_2.add(lblNewLabel_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(1, 1, 240, 20);
		panel_6.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_6.setBackground(Color.decode("#65F7CF"));
		panel_2.add(panel_6);
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_6.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(120, 56, 116, 18);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 86, 106, 18);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 116, 96, 18);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 26, 131, 18);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBackground(Color.decode("#65F7CF"));
		rdbtnNewRadioButton.setBounds(102, 145, 102, 20);
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBackground(Color.decode("#65F7CF"));
		rdbtnNewRadioButton_1.setBounds(104, 174, 102, 20);
		panel_2.add(rdbtnNewRadioButton_1);
		
		ButtonGroup botones = new ButtonGroup();
		botones.add(rdbtnNewRadioButton_1);
		botones.add(rdbtnNewRadioButton);
		
		String [] paises = {"México", "Estados Unidos", "Colombia", "Perú", "Canadá"};
		
		JComboBox comboBox = new JComboBox(paises);
		comboBox.setBounds(102, 215, 104, 20);
		panel_2.add(comboBox);
		

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#FC6882"));
		panel_3.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_3.setLayout(null);
		panel_1.add(panel_3, BorderLayout.EAST);
		
		ImageIcon usuario = new ImageIcon("usuario1.jpg");
	    JLabel usaurio_login = new JLabel();
	    usaurio_login.setBounds(66, 49, 100, 100);
	    usaurio_login.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
	    panel_3.add(usaurio_login);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(1, 0, 240, 20);
		panel_7.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_7.setBackground(Color.decode("#FC6882"));
		panel_3.add(panel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Perfil del Usuario");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_7.add(lblNewLabel_8);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBackground(Color.decode("#FC6882"));
		chckbxNewCheckBox.setBounds(49, 165, 173, 20);
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxNewCheckBox_1.setBackground(Color.decode("#FC6882"));
		chckbxNewCheckBox_1.setBounds(37, 197, 185, 20);
		panel_3.add(chckbxNewCheckBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_4.setBackground(Color.decode("#ED284A"));
		panel_4.setLayout(null);
		panel_1.add(panel_4, BorderLayout.WEST);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(1, 1, 240, 20);
		panel_8.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_8.setBackground(Color.decode("#ED284A"));
		panel_4.add(panel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Datos Opcionales");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_8.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Descripción");
		lblNewLabel_10.setBounds(27, 31, 83, 12);
		panel_4.add(lblNewLabel_10);
		
		JTextArea textArea = new JTextArea();

		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(10, 49, 100, 100);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel_4.add(scroll);
		
		JLabel lblNewLabel_11 = new JLabel("Preferencias");
		lblNewLabel_11.setBounds(140, 31, 83, 12);
		panel_4.add(lblNewLabel_11);
		
		String [] preferences = {"Cantar", "Escuchar Música", "Leer", "Deportes", "Otros"};
		
		JComboBox comboBox_1 = new JComboBox(preferences);
		comboBox_1.setBounds(140, 52, 83, 97);
		panel_4.add(comboBox_1);
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_5.setBackground(Color.decode("#65F7CF"));
		panel_5.setLayout(null);
		panel_1.add(panel_5);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(77, 33, 84, 20);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setBounds(77, 79, 84, 20);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setBounds(77, 125, 84, 20);
		panel_5.add(btnNewButton_2);
		
		
	}
}
