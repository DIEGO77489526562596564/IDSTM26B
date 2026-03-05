package Main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

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
		this.setSize(1150, 700);
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
				
		
		//this.users();
		//this.newlogin();
		this.calculadora();
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
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(350, 30);
		contra.setLocation(30, 220);
		contra.setFont(new Font("Arial", Font.BOLD, 18));
		contenedor.add(contra);
		
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
	

}
