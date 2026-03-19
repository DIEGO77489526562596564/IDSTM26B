package Main;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;


public class Ventana extends JFrame implements ActionListener{
	
	public Ventana() {
				
		this.setVisible(true);
		this.setSize(1200,700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Mi ventana");
		this.setBackground(Color.BLACK);
		this.getContentPane().setBackground(Color.decode("#03579E"));
		//this.setLocation(500, 200);
		this.setLayout(null);
		
		
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		
		barra.add(archivo);
		
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("An otem in the submenu");
		submenu.add(menuItem);
		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		
		archivo.add(submenu);
		
		this.setJMenuBar(barra);
		
		/*ImageIcon logo_ventana = new ImageIcon("logoventana.jpg");
		setIconImage(logo_ventana.getImage());
		
		ImageIcon imagen = new ImageIcon("logoventana.jpg");
		JLabel labelImagen = new JLabel(imagen);
		labelImagen.setBounds(420,15,50,50);
		labelImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		this.add(labelImagen);
		
		ImageIcon imagen2 = new ImageIcon("logoventana.jpg");
		JLabel labelImagen2 = new JLabel(imagen2);
		labelImagen2.setBounds(670,15,50,50);
		labelImagen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		this.add(labelImagen2);	*/	
		
		//this.users();
		//this.newlogin();
		this.login();	
		this.registro();
		//this.calculadora();
		//this.CalculadoraIntereses();;
		//pintar();
		//casa();
		this.repaint();
		this.revalidate();
		
	}
	
	public void login () {
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(500, 700);
		contenedor.setLocation(0, 0);
		contenedor.setLayout(null);
		this.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("ACCEDER");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(95, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(title_login);
		
		JTextField username = new JTextField();
		username.setSize(350, 30);
		username.setLocation(30, 130);
		username.setFont(new Font("Arial",Font.BOLD,18));
		contenedor.add(username);
		
		JButton acceder = new JButton();
		acceder.setText("Acceder");
		acceder.setLocation(110, 350);
		acceder.setSize(180, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(acceder);
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(350, 30);
		contra.setLocation(30, 220);
		contra.setFont(new Font("Arial", Font.BOLD, 18));
		contenedor.add(contra);
		
		acceder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username_val = username.getText();
				String contra_val = new String (contra.getPassword());
				
				String user_correct = "Diego Romero";
				String contra_correct = "1206";
				
				if(username_val.equals("")) {
					username.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				} else {
					username.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}
				
				if (contra_val.equals("")) {
					contra.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				} else {
					contra.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}
				
				if (username_val.equals(user_correct) && contra_val.equals(contra_correct)) {
					JOptionPane.showMessageDialog(null, "Bienvenido " + username_val);
				} else {
					JOptionPane.showMessageDialog(null, "Error al iniciar sesión!");
				}
				
				
				
			}
		});
		
		JLabel usuario = new JLabel();
		usuario.setText("NOMBRE DE USUARIO:");
		usuario.setSize(250, 30);
		usuario.setOpaque(true);
		usuario.setLocation(10, 90);
		usuario.setBackground(Color.gray);
		usuario.setForeground(Color.BLACK);
		usuario.setFont(new Font("Arial",Font.BOLD,18));
		usuario.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(usuario);
		
		JLabel contraseña = new JLabel();
		contraseña.setText("CONTRASEÑA:");
		contraseña.setSize(250, 30);
		contraseña.setOpaque(true);
		contraseña.setLocation(-25, 180);
		contraseña.setBackground(Color.gray);
		contraseña.setForeground(Color.BLACK);
		contraseña.setFont(new Font("Arial",Font.BOLD,18));
		contraseña.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(contraseña);
		
		
		JCheckBox recordarme = new JCheckBox();
		recordarme.setText("Recordarme");
		recordarme.setBounds(30, 250, 100, 40);
		recordarme.setBackground(Color.gray);
		contenedor.add(recordarme);
		
		
		JLabel olvidocontra = new JLabel();
		olvidocontra.setText("¿Olvidó su contraseña?");
		olvidocontra.setSize(200, 75);
		olvidocontra.setOpaque(true);
		olvidocontra.setLocation(200, 235);
		olvidocontra.setBackground(Color.gray);
		olvidocontra.setForeground(Color.BLACK);
		olvidocontra.setFont(new Font("Arial",Font.BOLD,15));
		olvidocontra.setHorizontalAlignment(JLabel.CENTER);
		contenedor.add(olvidocontra);
		
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registro() {
		JPanel register_container = new JPanel();
		register_container.setSize(500, 700);
		register_container.setLocation(600, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel registro = new JLabel("REGISTRO");
		registro.setBounds(180, 10, 150, 40);
		registro.setBackground(Color.white);
		registro.setBackground(Color.decode("#63FFC7"));
		registro.setHorizontalAlignment(JLabel.CENTER);
		registro.setOpaque(true);
		registro.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(registro);
		
		JLabel bio_tag = new JLabel("Biografía");
		bio_tag.setBounds(100, 120, 310, 40);
		bio_tag.setBackground(Color.white);
		bio_tag.setBackground(Color.decode("#63FFC7"));
		bio_tag.setHorizontalAlignment(JLabel.CENTER);
		bio_tag.setOpaque(true);
		bio_tag.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(bio_tag);
		
		JLabel nombre_usuario = new JLabel("NOMBRE DE USUARIO");
		nombre_usuario.setBounds(100, 30, 300, 70);
		nombre_usuario.setBackground(Color.white);
		nombre_usuario.setBackground(Color.decode("#63FFC7"));
		nombre_usuario.setHorizontalAlignment(JLabel.CENTER);
		nombre_usuario.setOpaque(true);
		nombre_usuario.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(nombre_usuario);
		
		JTextField user_nombre = new JTextField();
		user_nombre.setSize(350, 30);
		user_nombre.setLocation(80, 80);
		user_nombre.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(user_nombre);
		
		JTextArea bio = new JTextArea();
		bio.setBounds(130, 170, 250, 120);
		bio.setBorder(BorderFactory.createLineBorder(Color.black));
		register_container.add(bio);
		
		JLabel preference = new JLabel("Preferencias");
		preference.setBounds(100, 300, 310, 40);
		preference.setBackground(Color.white);
		preference.setBackground(Color.decode("#63FFC7"));
		preference.setHorizontalAlignment(JLabel.CENTER);
		preference.setOpaque(true);
		preference.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(preference);
		
		JCheckBox sweet = new JCheckBox("Dulce");
		sweet.setBounds(110, 340, 80, 30);
		sweet.setBackground(Color.decode("#63FFC7"));
		sweet.setBorderPainted(true);
		sweet.setBorder(BorderFactory.createLineBorder(Color.black));
		register_container.add(sweet);
		
		JCheckBox salty = new JCheckBox("Salado");
		salty.setBounds(210, 340, 80, 30);
		salty.setBackground(Color.decode("#63FFC7"));
		salty.setBorderPainted(true);
		salty.setBorder(BorderFactory.createLineBorder(Color.black));
		register_container.add(salty);
		
		JCheckBox healthy = new JCheckBox("Saludable");
		healthy.setBounds(310, 340, 80, 30);
		healthy.setBackground(Color.decode("#63FFC7"));
		healthy.setBorderPainted(true);
		healthy.setBorder(BorderFactory.createLineBorder(Color.black));
		register_container.add(healthy);
		
		JLabel terms = new JLabel("Terminos");
		terms.setBounds(180, 380, 150, 40);
		terms.setBackground(Color.white);
		terms.setBackground(Color.decode("#63FFC7"));
		terms.setHorizontalAlignment(JLabel.CENTER);
		terms.setOpaque(true);
		terms.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(terms);
		
		JRadioButton acept_terms = new JRadioButton("Acepto los terminos");
		acept_terms.setBounds(110, 410, 100, 50);
		acept_terms.setBackground(Color.decode("#63FFC7"));
		register_container.add(acept_terms);
		
		JRadioButton reject_terms = new JRadioButton("Rechazo los terminos");
		reject_terms.setBounds(290, 410, 100, 50);
		reject_terms.setBackground(Color.decode("#63FFC7"));
		register_container.add(reject_terms);
		
		ButtonGroup terminos = new ButtonGroup();
		terminos.add(acept_terms);
		terminos.add(reject_terms);
		
		String [] colonias = {"Camino Real", "La Fuente", "Diana Laura", "Calafia"};
		
		JComboBox list = new JComboBox(colonias);
		list.setBounds(160,460, 200, 40);
		register_container.add(list);
		
		JButton crear_cuenta = new JButton("Crear cuenta");
		crear_cuenta.setLocation(180, 510);
		crear_cuenta.setSize(165, 50);
		crear_cuenta.setFont(new Font("Arial",Font.BOLD,20));
		register_container.add(crear_cuenta);
		
		crear_cuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String username_val = user_nombre.getText();
				String bio_val = bio.getText();
				
				if(username_val.equals("")) {
					user_nombre.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				} else {
					user_nombre.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}
				
				if (bio_val.equals("")) {
					bio.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
				} else {
					bio.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
				}
				
			}
			
		});
		
		register_container.repaint();
	}
	
	public void users() {
		JPanel users = new JPanel();
		users.setSize(1000, 500);
		users.setLocation(70, 30);
		users.setBackground(Color.white);
		users.setLayout(null);
		this.add(users);
		
		JLabel users_title = new JLabel("USUARIOS");
		users_title.setBounds(450, 40, 200, 40);
		users_title.setOpaque(true);
		users_title.setBackground(Color.white);
		users_title.setHorizontalAlignment(JLabel.CENTER);
		users_title.setFont(new Font("Arial", Font.BOLD, 22));
		users.add(users_title);
		
		JButton export = new JButton("Exportar");
		export.setBounds(50, 90, 100, 40);
		users.add(export);
		
		JButton add = new JButton("Añadir");
		add.setBounds(155, 90,100, 40);
		users.add(add);
		
		Object [] table_head = {"No. control", "Nombre", "Apellido", "Semestre", "Promedio", "Acciones"};
		
		Object [][] table_content = {
			    {"22150001", "Carlos", "Ramírez", "1", "8.5", "Editar"},
			    {"22150002", "María", "López", "2", "9.1", "Editar"},
			    {"22150003", "José", "Hernández", "3", "7.8", "Editar"},
			    {"22150004", "Ana", "García", "4", "9.5", "Editar"},
			    {"22150005", "Luis", "Martínez", "5", "8.2", "Editar"},
			    {"22150006", "Fernanda", "Sánchez", "6", "9.0", "Editar"},
			    {"22150007", "Miguel", "Torres", "1", "7.5", "Editar"},
			    {"22150008", "Daniela", "Flores", "2", "8.9", "Editar"},
			    {"22150009", "Jorge", "Castillo", "3", "6.8", "Editar"},
			    {"22150010", "Valeria", "Morales", "4", "9.7", "Editar"},
			    {"22150011", "Ricardo", "Ortiz", "5", "8.0", "Editar"},
			    {"22150012", "Paola", "Reyes", "6", "9.3", "Editar"},
			    {"22150013", "Alejandro", "Cruz", "1", "7.9", "Editar"},
			    {"22150014", "Sofía", "Vargas", "2", "8.6", "Editar"},
			    {"22150015", "David", "Mendoza", "3", "8.4", "Editar"},
			    {"22150016", "Camila", "Rojas", "4", "9.2", "Editar"},
			    {"22150017", "Emmanuel", "Navarro", "5", "7.3", "Editar"},
			    {"22150018", "Andrea", "Delgado", "6", "9.8", "Editar"},
			    {"22150019", "Hugo", "Paredes", "1", "6.9", "Editar"},
			    {"22150020", "Lucía", "Silva", "2", "8.7", "Editar"},
			    {"22150021", "Brandon", "Campos", "3", "7.6", "Editar"},
			    {"22150022", "Natalia", "Peña", "4", "9.4", "Editar"},
			    {"22150023", "Kevin", "Aguilar", "5", "8.1", "Editar"},
			    {"22150024", "Renata", "Fuentes", "6", "9.6", "Editar"},
			    {"22150025", "Iván", "Salazar", "1", "7.2", "Editar"}
			};
		
		JTable users_table = new JTable(table_content, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		
		scrollPane.setLocation(50, 150);
		scrollPane.setSize(800, 240);
		users.add(scrollPane);
		
		
		
		users.repaint();
	}
	
	public void newlogin() {
		    JPanel login2 = new JPanel();
		    login2.setSize(1150, 600);
		    login2.setLocation(0, 0);
		    login2.setLayout(null);
		    this.add(login2);
		    
		    JButton crear_cuenta = new JButton("Registrarse");
		    crear_cuenta.setLocation(500, 480);
		    crear_cuenta.setSize(140, 50);
		    crear_cuenta.setFont(new Font("Tahoma",Font.BOLD,22));
		    crear_cuenta.setBorderPainted(true);
		    crear_cuenta.setBorder(BorderFactory.createLineBorder(Color.white));
		    crear_cuenta.setBackground(Color.decode("#E6BB09"));
		    crear_cuenta.setForeground(Color.black);
		    crear_cuenta.setHorizontalAlignment(JLabel.CENTER);
		    crear_cuenta.addActionListener(this);
		    crear_cuenta.addMouseListener (new java.awt.event.MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					crear_cuenta.setBackground(Color.decode("#B8860B"));
					crear_cuenta.setForeground(Color.white);
					super.mouseEntered(e);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					crear_cuenta.setBackground(Color.decode("#E6BB09"));
					crear_cuenta.setForeground(Color.black);
					super.mouseExited(e);
				}
		    	
		    });
		    login2.add(crear_cuenta);

		    ImageIcon fondo = new ImageIcon("fondo5.jpg");
		    JLabel fondoazul = new JLabel();
		    fondoazul.setBounds(0, 0, 1150, 600);
		    fondoazul.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(1150, 600, Image.SCALE_SMOOTH)));
		    login2.add(fondoazul);

		    login2.setComponentZOrder(fondoazul, login2.getComponentCount()-1);

		    JPanel cuadroLogin = new JPanel();
		    cuadroLogin.setBounds(280, 80, 600, 350);
		    cuadroLogin.setBackground(Color.decode("#0B1F47"));
		    cuadroLogin.setBorder(BorderFactory.createLineBorder(Color.white));
		    cuadroLogin.setLayout(null);
		    fondoazul.add(cuadroLogin);

		    JLabel user_login = new JLabel("USER LOGIN");
		    user_login.setBounds(480, 20, 250, 40);
		    user_login.setForeground(Color.white);
		    user_login.setFont(new Font("Tahoma",Font.ITALIC | Font.BOLD, 28));
		    fondoazul.add(user_login);
		    
		    JLabel users_title = new JLabel("Mi Cuenta");
		    users_title.setBounds(220, 20, 250, 40);
		    users_title.setForeground(Color.decode("#E6BB09"));
		    users_title.setFont(new Font("Tahoma", Font.BOLD, 28));
		    cuadroLogin.add(users_title);
		    
		    JLabel name = new JLabel("Ingresa tu nombre");
		    name.setBounds(100, 70, 400, 40);
		    name.setForeground(Color.white);
		    name.setFont(new Font("Tahoma", Font.BOLD, 20));
		    cuadroLogin.add(name);
		    
		    JTextField ingresar_nombre = new JTextField();
		    ingresar_nombre.setSize(350, 30);
		    ingresar_nombre.setLocation(100, 120);
		    ingresar_nombre.setFont(new Font("Arial",Font.BOLD,18));
		    cuadroLogin.add(ingresar_nombre);
		    
		    JLabel contra = new JLabel("Ingresa tu contraseña");
		    contra.setBounds(100, 180, 400, 40);
		    contra.setForeground(Color.white);
		    contra.setFont(new Font("Tahoma", Font.BOLD, 20));
		    cuadroLogin.add(contra);
		    
		    JPasswordField ingresar_contra = new JPasswordField();
		    ingresar_contra.setSize(350, 30);
		    ingresar_contra.setLocation(100, 230);
		    ingresar_contra.setFont(new Font("Arial",Font.BOLD,18));
		    cuadroLogin.add(ingresar_contra);
		    
		    JButton login;
		    
		    login = new JButton("Login");
		    login.setLocation(250, 280);
		    login.setSize(80, 40);
		    login.setFont(new Font("Tahoma",Font.BOLD,25));
		    login.setBorderPainted(true);
		    login.setBorder(BorderFactory.createLineBorder(Color.white));
		    login.setBackground(Color.decode("#E6BB09"));
		    login.setForeground(Color.black);
		    login.setHorizontalAlignment(JLabel.CENTER);
		    login.addActionListener(this);
		    login.addMouseListener (new java.awt.event.MouseAdapter() {

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					login.setBackground(Color.decode("#B8860B"));
					login.setForeground(Color.white);
					super.mouseEntered(e);
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					login.setBackground(Color.decode("#E6BB09"));
					login.setForeground(Color.black);
					super.mouseExited(e);
				}
		    	
		    });
		    cuadroLogin.add(login);
		    
		    ImageIcon usuario = new ImageIcon("usuario.jpg");
		    JLabel usaurio_login = new JLabel();
		    usaurio_login.setBounds(40, 100, 50, 50);
		    usaurio_login.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		    cuadroLogin.add(usaurio_login);
		    
		    ImageIcon contraImage = new ImageIcon("contra.jpg");
		    JLabel usaurio_contra = new JLabel();
		    usaurio_contra.setBounds(40, 210, 50, 50);
		    usaurio_contra.setIcon(new ImageIcon(contraImage.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
		    cuadroLogin.add(usaurio_contra);
		    
		    JLabel noaccount = new JLabel("¿No tienes cuenta?");
		    noaccount.setBounds(490, 310, 500, 290);
		    noaccount.setForeground(Color.white);
		    noaccount.setFont(new Font("Tahoma", Font.BOLD, 17));
		    fondoazul.add(noaccount);
		    
		    

			this.repaint();
			this.revalidate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void calculadora() {

	    JPanel calculadora = new JPanel();
	    calculadora.setSize(600, 450);
	    calculadora.setLocation(270, 60);
	    calculadora.setBackground(Color.white);
	    calculadora.setLayout(new BorderLayout(0, 0)); 
	    this.add(calculadora);
	    
	    JPanel panelSuperior = new JPanel();
	    panelSuperior.setLayout(new GridLayout(2,1));

	    JTextField barranum = new JTextField("100");
	    barranum.setFont(new Font("Arial", Font.BOLD, 40));
	    barranum.setBorder(BorderFactory.createLineBorder(Color.black));
	    barranum.setHorizontalAlignment(JTextField.RIGHT);

	    panelSuperior.add(barranum);

	    JPanel memoria = new JPanel();
	    memoria.setLayout(new FlowLayout(0, 50, 10));
	    memoria.setBackground(Color.red);

	    JButton mc = new JButton("    MC    ");
	    mc.setFont(new Font("Arial", Font.BOLD, 20));

	    JButton mp = new JButton("    M+    ");
	    mp.setFont(new Font("Arial", Font.BOLD, 20));

	    JButton div = new JButton("    /    ");
	    div.setFont(new Font("Arial", Font.BOLD, 20));

	    JButton mult = new JButton("    *    ");
	    mult.setFont(new Font("Arial", Font.BOLD, 20));

	    memoria.add(mc);
	    memoria.add(mp);
	    memoria.add(div);
	    memoria.add(mult);

	    panelSuperior.add(memoria);

	    calculadora.add(panelSuperior, BorderLayout.NORTH);
	    
	    JPanel center_cal = new JPanel();
	    center_cal.setBackground(Color.yellow);
	    center_cal.setLayout(new GridLayout(4, 3, 5, 5));

	    center_cal.add(new JButton("7"));
	    center_cal.add(new JButton("8"));
	    center_cal.add(new JButton("9"));
	    center_cal.add(new JButton("4"));
	    center_cal.add(new JButton("5"));
	    center_cal.add(new JButton("6"));
	    center_cal.add(new JButton("1"));
	    center_cal.add(new JButton("2"));
	    center_cal.add(new JButton("3"));
	    center_cal.add(new JButton("0"));
	    center_cal.add(new JButton("."));
	    center_cal.add(new JButton("/"));

	    calculadora.add(center_cal, BorderLayout.CENTER);

	    JPanel signos = new JPanel();
	    signos.setBackground(Color.black);
	    signos.setLayout(new GridLayout(4, 1, 5, 5));

	    signos.add(new JButton("X"));
	    signos.add(new JButton("+"));
	    signos.add(new JButton("-"));
	    signos.add(new JButton("="));

	    calculadora.add(signos, BorderLayout.EAST);
	    
	    
	}
	
	public void CalculadoraIntereses() {

	    JPanel calculadora = new JPanel();
	    calculadora.setSize(1000, 500);
	    calculadora.setLocation(100, 50);
	    calculadora.setBackground(Color.white);
	    calculadora.setLayout(new BorderLayout(20,20));
	    this.add(calculadora);


	    JLabel title = new JLabel("INTERÉS");
	    title.setFont(new Font("Arial", Font.BOLD, 26));
	    title.setForeground(Color.red);
	    title.setHorizontalAlignment(JLabel.CENTER);
	    calculadora.add(title, BorderLayout.NORTH);

	    
	    JPanel datos = new JPanel();
	    datos.setBackground(new Color(120,230,100));
	    datos.setLayout(new BorderLayout(10,10));

	    calculadora.add(datos, BorderLayout.CENTER);

	    JLabel subtitulo = new JLabel("Calcular interés");
	    subtitulo.setFont(new Font("Arial", Font.BOLD, 20));

	    datos.add(subtitulo, BorderLayout.NORTH);


	    JPanel campos = new JPanel();
	    campos.setLayout(new GridLayout(3,2,20,20));
	    campos.setOpaque(false);

	    JLabel l1 = new JLabel("Capital:");
	    l1.setFont(new Font("Arial", Font.BOLD, 16));

	    JTextField capital = new JTextField();
	    capital.setFont(new Font("Arial", Font.PLAIN, 16));

	    JLabel l2 = new JLabel("Tiempo:");
	    l2.setFont(new Font("Arial", Font.BOLD, 16));

	    JTextField tiempo = new JTextField();
	    tiempo.setFont(new Font("Arial", Font.PLAIN, 16));

	    JLabel l3 = new JLabel("Tasa interés:");
	    l3.setFont(new Font("Arial", Font.BOLD, 16));

	    JTextField tasa = new JTextField();
	    tasa.setFont(new Font("Arial", Font.PLAIN, 16));

	    campos.add(l1);
	    campos.add(capital);

	    campos.add(l2);
	    campos.add(tiempo);

	    campos.add(l3);
	    campos.add(tasa);

	    datos.add(campos, BorderLayout.CENTER);


	    JPanel botones = new JPanel(new FlowLayout());
	    botones.setOpaque(false);

	    JButton calcular = new JButton("Calcular");
	    JButton cancelar = new JButton("Cancelar");

	    botones.add(calcular);
	    botones.add(cancelar);

	    datos.add(botones, BorderLayout.SOUTH);

	    JPanel resultados = new JPanel();
	    resultados.setLayout(new GridLayout(2,2,20,10));
	    resultados.setBackground(new Color(240,120,110));

	    JLabel r1 = new JLabel("Interés:");
	    r1.setFont(new Font("Arial", Font.BOLD, 16));

	    JTextField interes = new JTextField();
	    interes.setEditable(false);

	    JLabel r2 = new JLabel("Monto:");
	    r2.setFont(new Font("Arial", Font.BOLD, 16));

	    JTextField monto = new JTextField();
	    monto.setEditable(false);

	    resultados.add(r1);
	    resultados.add(interes);

	    resultados.add(r2);
	    resultados.add(monto);

	    calculadora.add(resultados, BorderLayout.SOUTH);

	    setVisible(true);
	}
	
	public void pintar() {
		
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.drawLine(0,0,100,100);
                
                g2d.setStroke(new BasicStroke(3));
                g2d.setColor(Color.red);
                
                g2d.drawLine(200,  200,  500, 200);
                
                g2d.drawRect(250, 250, 100, 100);
                
                g2d.setColor(Color.green);
                
                g2d.drawOval(400, 100, 90, 30);
                
                g2d.setStroke(new BasicStroke(5));
                
                g2d.drawArc(300, 100, 100, 100, 0, 270);
                
                g2d.drawPolygon(new int [] {200,100,300},new int [] {100,300,500},3);
                
                g2d.setColor(Color.orange);
                
                g2d.fillRect(500,  300, 100, 100);
                
                g2d.fillOval(400, 200, 100, 100);
                
                g2d.fillArc(300, 300, 100, 100, 90, 90);
                
                g2d.fillPolygon(new int [] {400,300,500},new int [] {200,300,500},3);
                
                try {
					BufferedImage image = ImageIO.read(new File ("src/imagenes/pacman.png"));
					g2d.drawImage(image, 500, 9, null);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            
            }
        };

       pane.setSize(1200,700);
       pane.setLocation(0,0);
       this.add(pane);
	}

	
	public void casa() {
		JPanel pane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                g2d.setStroke(new BasicStroke(50));
                g2d.setColor(Color.decode("#453200"));             
                g2d.drawLine(0,620,1200,620);
                
                g2d.setStroke(new BasicStroke(40));
                g2d.setColor(Color.decode("#00AB12"));             
                g2d.drawLine(0,580,1200,580);
                
                g2d.setColor(Color.decode("#00996C"));     
                g2d.fillRect(330,  210, 570, 350);
                
                g2d.setColor(Color.decode("#00DB99"));     
                g2d.fillRect(350,  230, 530, 330);
                
                g2d.setColor(Color.decode("#5C8065"));     
                g2d.drawLine(330,  190, 900, 190);
                
                g2d.setStroke(new BasicStroke(50));
                g2d.setColor(Color.decode("#FFBE1A"));     
                g2d.drawLine(925, 410, 925, 535);
                
                g2d.setStroke(new BasicStroke(15));
                g2d.setColor(Color.decode("#D18600"));     
                g2d.drawLine(907, 390, 942, 390);
                
                g2d.setStroke(new BasicStroke(10));
                g2d.setColor(Color.decode("#D18600"));     
                g2d.drawLine(915, 380, 932, 380);
                
                g2d.setStroke(new BasicStroke(7));
                g2d.setColor(Color.white);     
                g2d.drawLine(905, 371, 920, 371);
                
                g2d.setColor(Color.white);     
                g2d.fillRect(400,  280, 160, 160);
                
                g2d.setColor(Color.decode("#99FFE9"));     
                g2d.fillRect(410,  290, 60, 140);
                
                g2d.setColor(Color.decode("#99FFE9"));     
                g2d.fillRect(490,  290, 60, 140);
                
                g2d.setStroke(new BasicStroke(20));
                g2d.setColor(Color.decode("#00BF67"));     
                g2d.drawLine(400, 450, 560, 450);
                
                g2d.setStroke(new BasicStroke(15));
                g2d.setColor(Color.decode("#B57900"));             
                g2d.drawLine(0,480,1200,480);
                
                g2d.setColor(Color.decode("#B57900"));             
                g2d.drawLine(0,510,1200,510);
                
                g2d.setColor(Color.decode("#B57900"));             
                g2d.drawLine(0,540,1200,540);
                
                g2d.setStroke(new BasicStroke(10));
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(420,465,420,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(10,465,10,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(60,465,60,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(120,465,120,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(180,465,180,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(240,465,240,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(300,465,300,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(360,465,360,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(480,465,480,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(540,465,540,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(600,465,600,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(660,465,660,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(720,465,720,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(780,465,780,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(840,465,840,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(900,465,900,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(960,465,960,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(1000,465,1000,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(1060,465,1060,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(1120,465,1120,555);
                
                g2d.setColor(Color.decode("#D19C32"));             
                g2d.drawLine(1180,465,1180,555);
                
                g2d.setColor(Color.gray);     
                g2d.fillRect(650,  311, 140, 250);
                
                g2d.setColor(Color.white);     
                g2d.fillRect(665, 325, 110, 220);
                
                g2d.setColor(Color.yellow);     
                g2d.fillRect(750,  420, 13, 20);
                
                g2d.setStroke(new BasicStroke(7));
                g2d.setColor(Color.decode("#D6D6D6"));             
                g2d.drawLine(360,166,360,110);
                
                g2d.setColor(Color.decode("#D6D6D6"));             
                g2d.drawLine(390,166,390,140);
                
                g2d.setColor(Color.black);     
                g2d.fillRect(780, 90, 70, 80);
                
                g2d.setStroke(new BasicStroke(15));
                g2d.setColor(Color.black);             
                g2d.drawLine(800,85,827,85);
                
                g2d.setColor(Color.white);             
                g2d.drawLine(800,120,827,120);
                
            }
		};
		
		pane.setSize(1200,700);
	    pane.setLocation(0,0);
	    pane.setBackground(Color.decode("#5CA3FF"));
	    this.add(pane);
	}
}

