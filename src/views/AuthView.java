package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.AuthController;
import model.AuthModel;
import model.RegistroModel;

public class AuthView {
	private AuthModel model;
	private AuthController controller;

	public AuthView(AuthController controller, AuthModel model){
	    this.controller = controller;
	    this.model = model;
	}
	
	
	public void loginView() {
		
		JFrame ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setSize(1200,700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("Mi ventana");
		ventana.setBackground(Color.BLACK);
		ventana.getContentPane().setBackground(Color.decode("#03579E"));
		ventana.setLayout(null);
		ventana.setVisible(true);
		
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(1160, 610);
		contenedor.setLocation(10, 10);
		contenedor.setLayout(null);
		ventana.add(contenedor);
		
		JLabel title_login = new JLabel();
		title_login.setText("ACCEDER");
		title_login.setSize(300, 60);
		title_login.setOpaque(true);
		title_login.setLocation(60, 10);
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
	        String contra_val = new String(contra.getPassword());

	        boolean valid = controller.login(username_val, contra_val);

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

	        if(valid) {

	            JOptionPane.showMessageDialog(null, "Bienvenido " + username_val);

	            ventana.dispose();

	            HomeView home = new HomeView();
	            home.HomeView();

	        } else {

	            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");

	        }
	    }
		});
		
		JButton registro = new JButton("¿Aun no tienes cuenta?");
		registro.setLocation(100, 430);
		registro.setSize(200, 50);
		registro.setFont(new Font("Arial",Font.BOLD,22));
		contenedor.add(registro);
		
		registro.addActionListener(e -> {
			ventana.dispose();
			registerView();
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
		
		contenedor.setVisible(true);
		contenedor.repaint();
		contenedor.revalidate();
	}
	
	public void registerView() {
		
		JFrame ventana = new JFrame();
		ventana.setVisible(true);
		ventana.setSize(1200,700);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLocationRelativeTo(null);
		ventana.setMinimumSize(new Dimension(200,200));
		ventana.setMaximumSize(new Dimension(800,800));
		ventana.setTitle("Mi ventana");
		ventana.setBackground(Color.BLACK);
		ventana.getContentPane().setBackground(Color.decode("#03579E"));
		ventana.setLayout(null);
		ventana.setVisible(true);
		
		JPanel register_container = new JPanel();
		register_container.setSize(500, 700);
		register_container.setLocation(600, 0);
		register_container.setOpaque(true);
		register_container.setBackground(Color.decode("#63FFC7"));
		register_container.setLayout(null);
		ventana.add(register_container);
		
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

			    if(bio_val.equals("")) {
			        bio.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
			    } else {
			        bio.setBorder(BorderFactory.createLineBorder(Color.green,3,true));
			    }

			    if(!username_val.equals("") && !bio_val.equals("")) {

			        RegistroModel model = new RegistroModel();

			        boolean ok = model.registrar(username_val, bio_val);

			        if(ok) {
			            JOptionPane.showMessageDialog(null, "Cuenta creada");
			        } else {
			            JOptionPane.showMessageDialog(null, "Error al registrar");
			        }
			    }
			}
		});
		
		JButton login = new JButton("cancelar");
		login.setLocation(190, 570);
		login.setSize(130, 40);
		login.setFont(new Font("Arial",Font.BOLD,22));
		register_container.add(login);
		
		login.addActionListener(e -> {
			ventana.dispose();
			loginView();
			
		});
		
		register_container.setVisible(true);
		register_container.repaint();
		register_container.revalidate();
	}
}
