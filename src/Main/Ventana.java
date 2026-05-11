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
		//this.registro();
		//this.alta();
		//this.p1_usuario();
		//this.p3_contra();
		//this.p2_sistema();
		//this.recovery_password();
		//this.baja();
		//consultar();
		//this.calculadora();
		//this.CalculadoraIntereses();;
		//pintar();
		//casa();
		//pintarMarioBros();
		menu();
		
		
		this.repaint();
		this.revalidate();
		
	}
	
	public void login () {
		
	}
	
	public void registro() {
		
	}
	
	public void recovery_password() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("RECUPERAR CUENTA");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JLabel correo = new JLabel();
		correo.setText("CORREO ELECTRÓNICO:");
		correo.setSize(250, 30);
		correo.setOpaque(true);
		correo.setLocation(20, 90);
		correo.setBackground(Color.decode("#63FFC7"));
		correo.setForeground(Color.BLACK);
		correo.setFont(new Font("Arial",Font.BOLD,18));
		correo.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(correo);
		
		JTextField correo1 = new JTextField();
		correo1.setSize(350, 30);
		correo1.setLocation(30, 130);
		correo1.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(correo1);
		
		JLabel usuario = new JLabel();
		usuario.setText("CONTRASEÑA:");
		usuario.setSize(250, 30);
		usuario.setOpaque(true);
		usuario.setLocation(-20, 180);
		usuario.setBackground(Color.decode("#63FFC7"));
		usuario.setForeground(Color.BLACK);
		usuario.setFont(new Font("Arial",Font.BOLD,18));
		usuario.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(usuario);
		
		JPasswordField user = new JPasswordField();
		user.setSize(350, 30);
		user.setLocation(30, 220);
		user.setFont(new Font("Arial", Font.BOLD, 18));
		register_container.add(user);
		
		JButton cancelar = new JButton();
		cancelar.setText("Recuperar");
		cancelar.setLocation(30, 270);
		cancelar.setSize(130, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(cancelar);
		
		cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Se te envío un link a tu correo.");
            }
        });
		
		if(cancelar != null) {
			cancelar.addActionListener(e -> {
				this.router("login");
			});
		}
		
		JButton volver = new JButton();
		volver.setText("Volver");
		volver.setLocation(250, 270);
		volver.setSize(130, 50);
		volver.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(volver);
		
		volver.addActionListener(e -> {
			this.router("login");
		});
		
		register_container.repaint();
	}
	
	public void alta() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("DAR DE ALTA");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JTextField correo1 = new JTextField();
		correo1.setSize(350, 30);
		correo1.setLocation(30, 130);
		correo1.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(correo1);
		
		JButton acceder = new JButton();
		acceder.setText("Guardar");
		acceder.setLocation(30, 350);
		acceder.setSize(150, 50);
		acceder.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(acceder);
		
		JTextField user = new JTextField();
		user.setSize(350, 30);
		user.setLocation(30, 220);
		user.setFont(new Font("Arial", Font.BOLD, 18));
		register_container.add(user);
		
		JPasswordField contra = new JPasswordField();
		contra.setSize(350, 30);
		contra.setLocation(30, 300);
		contra.setFont(new Font("Arial", Font.BOLD, 18));
		register_container.add(contra);
		
		JLabel correo = new JLabel();
		correo.setText("CORREO ELECTRÓNICO:");
		correo.setSize(250, 30);
		correo.setOpaque(true);
		correo.setLocation(20, 90);
		correo.setBackground(Color.decode("#63FFC7"));
		correo.setForeground(Color.BLACK);
		correo.setFont(new Font("Arial",Font.BOLD,18));
		correo.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(correo);
		
		JLabel usuario = new JLabel();
		usuario.setText("NOMBRE DE USUARIO:");
		usuario.setSize(250, 30);
		usuario.setOpaque(true);
		usuario.setLocation(15, 180);
		usuario.setBackground(Color.decode("#63FFC7"));
		usuario.setForeground(Color.BLACK);
		usuario.setFont(new Font("Arial",Font.BOLD,18));
		usuario.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(usuario);
		
		JLabel contraseña = new JLabel();
		contraseña.setText("CONTRASEÑA:");
		contraseña.setSize(250, 30);
		contraseña.setOpaque(true);
		contraseña.setLocation(-20, 260);
		contraseña.setBackground(Color.decode("#63FFC7"));
		contraseña.setForeground(Color.BLACK);
		contraseña.setFont(new Font("Arial",Font.BOLD,18));
		contraseña.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(contraseña);
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setLocation(230, 350);
		cancelar.setSize(150, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(cancelar);
		
		cancelar.addActionListener(e -> {
			this.router("login");
		});
		register_container.repaint();
	}
	
	
	public void baja() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("DAR DE BAJA");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JLabel correo = new JLabel();
		correo.setText("SELECCIONE UN USUARIO:");
		correo.setSize(250, 30);
		correo.setOpaque(true);
		correo.setLocation(80, 110);
		correo.setBackground(Color.decode("#63FFC7"));
		correo.setForeground(Color.BLACK);
		correo.setFont(new Font("Arial",Font.BOLD,16));
		correo.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(correo);
		
		JButton eliminar = new JButton();
		eliminar.setText("Eliminar");
		eliminar.setLocation(570, 400);
		eliminar.setSize(130, 50);
		eliminar.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(eliminar);
		
		Object [] table_head = {"No. control", "Nombre", "Apellido", "Acciones"};
		
		Object [][] table_content = {
				{"22150001", "Carlos", "Ramírez", "Editar"},
				{"22150002", "María", "López", "Editar"},
				{"22150003", "José", "Hernández", "Editar"},
				{"22150004", "Ana", "García", "Editar"},
				{"22150005", "Luis", "Martínez", "Editar"},
				{"22150006", "Fernanda", "Sánchez", "Editar"},
				{"22150007", "Miguel", "Torres", "Editar"},
				{"22150008", "Daniela", "Flores", "Editar"},
				{"22150009", "Jorge", "Castillo", "Editar"},
				{"22150010", "Valeria", "Morales", "Editar"},
				{"22150011", "Ricardo", "Ortiz", "Editar"},
				{"22150012", "Paola", "Reyes", "Editar"},
				{"22150013", "Alejandro", "Cruz", "Editar"},
				{"22150014", "Sofía", "Vargas", "Editar"},
				{"22150015", "David", "Mendoza", "Editar"},
				{"22150016", "Camila", "Rojas", "Editar"},
				{"22150017", "Emmanuel", "Navarro", "Editar"},
				{"22150018", "Andrea", "Delgado", "Editar"},
				{"22150019", "Hugo", "Paredes", "Editar"},
				{"22150020", "Lucía", "Silva", "Editar"},
				{"22150021", "Brandon", "Campos", "Editar"},
				{"22150022", "Natalia", "Peña", "Editar"},
				{"22150023", "Kevin", "Aguilar", "Editar"},
				{"22150024", "Renata", "Fuentes", "Editar"},
				{"22150025", "Iván", "Salazar", "Editar"}
			};
		
		JTable users_table = new JTable(table_content, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		
		scrollPane.setLocation(100, 150);
		scrollPane.setSize(600, 240);
		register_container.add(scrollPane);
		
		JButton cancelar = new JButton();
		cancelar.setText("Cancelar");
		cancelar.setLocation(430, 400);
		cancelar.setSize(130, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(cancelar);
		
		cancelar.addActionListener(e -> {
			this.router("consultar");
		});
		
		register_container.repaint();
	}
	
	public void consultar() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("CONSULTAR USUARIOS");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JLabel correo = new JLabel();
		correo.setText("LISTA DE LOS USUARIOS:");
		correo.setSize(250, 30);
		correo.setOpaque(true);
		correo.setLocation(90, 110);
		correo.setBackground(Color.decode("#63FFC7"));
		correo.setForeground(Color.BLACK);
		correo.setFont(new Font("Arial",Font.BOLD,18));
		correo.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(correo);
		
		Object [] table_head = {"No. control", "Nombre", "Apellido", "Acciones"};
		
		Object [][] table_content = {
				{"22150001", "Carlos", "Ramírez", "Editar"},
				{"22150002", "María", "López", "Editar"},
				{"22150003", "José", "Hernández", "Editar"},
				{"22150004", "Ana", "García", "Editar"},
				{"22150005", "Luis", "Martínez", "Editar"},
				{"22150006", "Fernanda", "Sánchez", "Editar"},
				{"22150007", "Miguel", "Torres", "Editar"},
				{"22150008", "Daniela", "Flores", "Editar"},
				{"22150009", "Jorge", "Castillo", "Editar"},
				{"22150010", "Valeria", "Morales", "Editar"},
				{"22150011", "Ricardo", "Ortiz", "Editar"},
				{"22150012", "Paola", "Reyes", "Editar"},
				{"22150013", "Alejandro", "Cruz", "Editar"},
				{"22150014", "Sofía", "Vargas", "Editar"},
				{"22150015", "David", "Mendoza", "Editar"},
				{"22150016", "Camila", "Rojas", "Editar"},
				{"22150017", "Emmanuel", "Navarro", "Editar"},
				{"22150018", "Andrea", "Delgado", "Editar"},
				{"22150019", "Hugo", "Paredes", "Editar"},
				{"22150020", "Lucía", "Silva", "Editar"},
				{"22150021", "Brandon", "Campos", "Editar"},
				{"22150022", "Natalia", "Peña", "Editar"},
				{"22150023", "Kevin", "Aguilar", "Editar"},
				{"22150024", "Renata", "Fuentes", "Editar"},
				{"22150025", "Iván", "Salazar", "Editar"}
			};
		
		JTable users_table = new JTable(table_content, table_head);
		JScrollPane scrollPane = new JScrollPane(users_table);
		
		scrollPane.setLocation(100, 150);
		scrollPane.setSize(600, 240);
		register_container.add(scrollPane);
		
		JButton cancelar = new JButton();
		cancelar.setText("Volver");
		cancelar.setLocation(570, 400);
		cancelar.setSize(130, 50);
		cancelar.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(cancelar);
		
		cancelar.addActionListener(e -> {
			this.router("login");
		});
		
		register_container.repaint();
	}
	
	public void p1_usuario() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Cómo crear un usuario?");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JTextArea user_nombre = new JTextArea("Para crear un nuevo usuario da clic en el siguiente boton.");
		user_nombre.setSize(550, 30);
		user_nombre.setLocation(80, 110);
		user_nombre.setBackground(Color.decode("#63FFC7"));
		user_nombre.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(user_nombre);
		
		JButton ir_registro = new JButton();
		ir_registro.setText("Registro");
		ir_registro.setLocation(80, 150);
		ir_registro.setSize(140, 50);
		ir_registro.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(ir_registro);
		
		ir_registro.addActionListener(e -> {
			this.router("registro");
		});
		
		JTextArea siguiente_paso = new JTextArea("Despues ingresa tus datos personales y dale al boton de crear cuenta. Y listo.");
		siguiente_paso.setSize(700, 30);
		siguiente_paso.setLocation(80, 230);
		siguiente_paso.setBackground(Color.decode("#63FFC7"));
		siguiente_paso.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(siguiente_paso);
		
		JButton volver = new JButton();
		volver.setText("Volver");
		volver.setLocation(80, 270);
		volver.setSize(140, 50);
		volver.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(volver);
		
		ir_registro.addActionListener(e -> {
			this.router("login");
		});
		
		register_container.repaint();
	}
	
	public void p2_sistema() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Cómo acceder al sistema?");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JTextArea user_nombre = new JTextArea("Para ingresar al sistema da clic en el siguiente boton.");
		user_nombre.setSize(550, 30);
		user_nombre.setLocation(80, 110);
		user_nombre.setBackground(Color.decode("#63FFC7"));
		user_nombre.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(user_nombre);
		
		JButton ir_registro = new JButton();
		ir_registro.setText("Login");
		ir_registro.setLocation(80, 150);
		ir_registro.setSize(140, 50);
		ir_registro.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(ir_registro);
		
		ir_registro.addActionListener(e -> {
			this.router("login");
		});
		
		JTextArea siguiente_paso = new JTextArea("Despues ingresa tus correo y contraseña y dale al boton de login. Y listo.");
		siguiente_paso.setSize(700, 30);
		siguiente_paso.setLocation(80, 230);
		siguiente_paso.setBackground(Color.decode("#63FFC7"));
		siguiente_paso.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(siguiente_paso);
		
		register_container.repaint();
	}
	
	public void p3_contra() {
		JPanel register_container = new JPanel();
		register_container.setSize(800, 700);
		register_container.setLocation(200, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		this.add(register_container);
		
		JLabel title_login = new JLabel();
		title_login.setText("¿Cómo acceder al sistema?");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(250, 10);
		title_login.setBackground(Color.red);
		title_login.setForeground(Color.WHITE);
		title_login.setFont(new Font("Arial",Font.BOLD,22));
		title_login.setHorizontalAlignment(JLabel.CENTER);
		register_container.add(title_login);
		
		JTextArea user_nombre = new JTextArea("Para recuperar tu contraseña da clic en el siguiente boton.");
		user_nombre.setSize(550, 30);
		user_nombre.setLocation(80, 110);
		user_nombre.setBackground(Color.decode("#63FFC7"));
		user_nombre.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(user_nombre);
		
		JButton ir_registro = new JButton();
		ir_registro.setText("Recuperar");
		ir_registro.setLocation(80, 150);
		ir_registro.setSize(140, 50);
		ir_registro.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(ir_registro);
		
		ir_registro.addActionListener(e -> {
			this.router("recovery");
		});
		
		JTextArea siguiente_paso = new JTextArea("Despues ingresa tus correo y contraseña y dale al boton de recuperar. Y listo.");
		siguiente_paso.setSize(700, 30);
		siguiente_paso.setLocation(80, 230);
		siguiente_paso.setBackground(Color.decode("#63FFC7"));
		siguiente_paso.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(siguiente_paso);
		
		JButton volver = new JButton();
		volver.setText("Volver");
		volver.setLocation(80, 270);
		volver.setSize(140, 50);
		volver.setFont(new Font("Arial",Font.BOLD,18));
		register_container.add(volver);
		
		volver.addActionListener(e -> {
			this.router("login");
		});
		
		register_container.repaint();
	}
	
	public void users() {
		
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
	
	public void router (String target) {
		
		this.getContentPane().removeAll();
		
		//cuenta
		if (target .equals("login")) 
			this.login();
		
		if (target .equals("registro")) 
			this.registro();
		
		if(target.equals("recovery"))
			this.recovery_password();
		
		//usuarios
		if (target .equals("alta")) 
			this.alta();
		
		if (target .equals("baja")) 
			this.baja();
		
		
		if(target.equals("consultar"))
			this.consultar();
		
		//preguntas
		if (target .equals("p1_usuario")) 
			this.p1_usuario();
		
		if (target .equals("p2_sistema")) 
			this.p2_sistema();
		
		if(target.equals("p3_contra"))
			this.p3_contra();
		
		
		this.setVisible(true);
		this.repaint();
		this.revalidate();
	}
	
	public void menu() {
		JMenuBar barra = new JMenuBar();
		JMenu archivo = new JMenu("Archivo");
		JMenu cuenta = new JMenu("Cuenta");
		JMenu usuarios = new JMenu("Usuarios");
		JMenu ayuda = new JMenu("Ayuda");
		
		JMenuItem open = new JMenuItem("Abrir");
		JMenuItem close = new JMenuItem("Cerrar");
		JMenuItem save = new JMenuItem("Guardar");
		JMenuItem newFile = new JMenuItem("Nuevo");
		archivo.add(open);
		archivo.add(close);
		archivo.add(save);
		archivo.add(newFile);
		
		JMenuItem acceder = new JMenuItem("Acceder");
		JMenuItem registrarse = new JMenuItem("Registrarse");
		JMenuItem recover_item = new JMenuItem("Recuperacion de cuenta");
		cuenta.add(acceder);
		cuenta.add(registrarse);
		cuenta.add(recover_item);
		
		acceder.addActionListener(e -> {
			this.router("login");
		});
		
		registrarse.addActionListener(e -> {
			this.router("registro");
		});
		
		recover_item.addActionListener(e ->{
			this.router("recovery");
		});
		
		barra.add(archivo);
		barra.add(cuenta);
		barra.add(usuarios);
		barra.add(ayuda);
		
		JMenuItem alta_item = new JMenuItem("Alta");
		JMenuItem baja_item = new JMenuItem("Baja");
		JMenuItem consultar_item = new JMenuItem("Consultar");
		usuarios.add(alta_item);
		usuarios.add(baja_item);
		usuarios.add(consultar_item);
		
		alta_item.addActionListener(e -> {
			this.router("alta");
		});
		
		baja_item.addActionListener(e -> {
			this.router("baja");
		});
		
		consultar_item.addActionListener(e ->{
			this.router("consultar");
		});
		
		JMenuItem crear_usuario = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem acceder_sistema = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem olvide_contra = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		ayuda.add(crear_usuario);
		ayuda.add(acceder_sistema);
		ayuda.add(olvide_contra);
		
		crear_usuario.addActionListener(e -> {
			this.router("p1_usuario");
		});
		
		acceder_sistema.addActionListener(e -> {
			this.router("p2_sistema");
		});
		
		olvide_contra.addActionListener(e ->{
			this.router("p3_contra");
		});
		
		
		JMenu submenu = new JMenu("Otros");
		archivo.addSeparator();
		
		JMenuItem menuItem = new JMenuItem("An item in the submenu");
		submenu.add(menuItem);
		menuItem = new JMenuItem("Another item");
		submenu.add(menuItem);
		
		archivo.add(submenu);
		
		
		this.setJMenuBar(barra);
		
	}
	
	public void pintarMarioBros() {
		JPanel pane = new JPanel() {
	        @Override
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            Graphics2D g2d = (Graphics2D) g;
	            
	            g2d.setColor(Color.decode("#1E8E00"));
	            g2d.fillOval(120, 520, 80, 80);
	            g2d.fillOval(160, 500, 90, 90);
	            g2d.fillOval(210, 520, 80, 80);
	            
	            g2d.setStroke(new BasicStroke(2));
	            g2d.setColor(Color.decode("#ffc3ac"));     
	            g2d.fillRect(30, 580, 1155, 150);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRect(30, 580, 1155, 150);
	            
	            g2d.setColor(Color.black);
	            g2d.fillRoundRect(530, 340, 180, 240, 15, 15);
	            
	            g2d.setColor(Color.decode("#54D6FF"));
	            g2d.fillRoundRect(500, 300, 180, 280, 15, 15);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRoundRect(500, 300, 180, 280, 15, 15);
	            g2d.setStroke(new BasicStroke(10));
	            g2d.setColor(Color.decode("#82E6FF"));
	            g2d.drawLine(676, 307, 676, 574);
	            g2d.setStroke(new BasicStroke(7));
	            g2d.drawLine(480, 576, 676, 576);
	            
	            g2d.setStroke(new BasicStroke(2));
	            g2d.setColor(Color.black);
	            g2d.fillRoundRect(450, 410, 180, 170, 15, 15);
	            
	            g2d.setColor(Color.decode("#ffc3ac"));
	            g2d.fillRoundRect(400, 380, 180, 200, 15, 15);
	            g2d.setColor(Color.BLACK);
	            g2d.drawRoundRect(400, 380, 180, 200, 15, 15);
	            
	            g2d.setColor(Color.lightGray);
	            g2d.fillOval(510, 310, 15, 15);
	            g2d.fillOval(650, 310, 15, 15);
	            g2d.fillOval(650, 560, 15, 15);
	            
	            g2d.fillOval(410, 390, 15, 15);
	            g2d.fillOval(560, 390, 15, 15);
	            g2d.fillOval(410, 560, 15, 15);
	            g2d.fillOval(560, 560, 15, 15);
	            
	            g2d.setColor(Color.black);
		        g2d.drawOval(510, 310, 15, 15);
		        g2d.drawOval(650, 310, 15, 15);
		        g2d.drawOval(650, 560, 15, 15);
	            
		        g2d.setColor(Color.black);
		        g2d.drawOval(410, 390, 15, 15);
		        g2d.drawOval(560, 390, 15, 15);
		        g2d.drawOval(410, 560, 15, 15);
		        g2d.drawOval(560, 560, 15, 15);
		        
		        g2d.setStroke(new BasicStroke(6));
		        g2d.setColor(Color.decode("#00852F"));
		        g2d.fillRect(830, 450, 110, 130);
		        g2d.fillRect(820, 400, 130, 50);
		        
		        g2d.setColor(Color.black);
	            g2d.drawRect(830, 450, 110, 130);
	            g2d.drawRect(820, 400, 130, 50);
	            
	            g2d.setColor(Color.decode("#C4FEFF"));
	            g2d.fillRect(822, 403, 20, 45);
	            g2d.fillRect(833, 453, 10, 124);
	            
	            g2d.setColor(Color.decode("#00541B"));
	            g2d.fillRect(890, 403, 15, 45);
	            g2d.fillRect(890, 453, 15, 124);
	            
	            g2d.setColor(Color.decode("#00300E"));
	            g2d.fillRect(900, 403, 48, 45);
	            g2d.fillRect(900, 453, 38, 124);
	            
	            g2d.setColor(Color.decode("#00C853"));
	            g2d.fillRoundRect(1050, 400, 180, 180, 15, 15);
	
	            g2d.setStroke(new BasicStroke(3));
	            g2d.setColor(Color.BLACK);
	            g2d.drawRoundRect(1050, 400, 180, 180, 15, 15);
	            
	            g2d.setColor(Color.lightGray);
	            g2d.fillOval(1060, 410, 15, 15);
	            g2d.fillOval(1060, 560, 15, 15);
	            
	            g2d.setStroke(new BasicStroke(2));
	            g2d.setColor(Color.black);
	            g2d.drawOval(1060, 410, 15, 15);
	            g2d.drawOval(1060, 560, 15, 15);
	            
	            g2d.setStroke(new BasicStroke(3));
	            g2d.setColor(Color.decode("#BD9A3C"));
	            g2d.fillRect(250, 100, 50, 50);
	            g2d.fillRect(300, 100, 50, 50);
	            g2d.fillRect(100, 300, 50, 50);
	            g2d.fillRect(1050, 200, 50, 50);
	            
	            g2d.setColor(Color.black);
	            g2d.drawRect(250, 100, 50, 50);
	            g2d.drawRect(300, 100, 50, 50);
	            g2d.drawRect(100, 300, 50, 50);
	            g2d.drawRect(1050, 200, 50, 50);
	            
	            g2d.setColor(Color.BLACK);
		        g2d.fillOval(255, 105, 5, 5);
		        g2d.fillOval(289, 105, 5, 5);
		        g2d.fillOval(255, 139, 5, 5);
		        g2d.fillOval(289, 139, 5, 5);
	
		        g2d.fillOval(305, 105, 5, 5);
		        g2d.fillOval(339, 105, 5, 5);
		        g2d.fillOval(305, 139, 5, 5);
		        g2d.fillOval(339, 139, 5, 5);
		
		        g2d.fillOval(105, 305, 5, 5);
		        g2d.fillOval(139, 305, 5, 5);
		        g2d.fillOval(105, 339, 5, 5);
		        g2d.fillOval(139, 339, 5, 5);
		
		        g2d.fillOval(1055, 205, 5, 5);
		        g2d.fillOval(1089, 205, 5, 5);
		        g2d.fillOval(1055, 239, 5, 5);
		        g2d.fillOval(1089, 239, 5, 5);
	            
	            
	            
	        }
		};
		
		pane.setSize(1200,700);
	    pane.setLocation(0,0);
	    pane.setBackground(Color.decode("#C4FEFF"));
		    this.add(pane);
		}
		
	}

