package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Ventana extends JFrame{
	
	public Ventana() {
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Hola");
		this.setBackground(Color.BLACK);
		this.setLocation(500, 200);
		this.setLayout(null);
		
		JPanel contenedor = new JPanel();
		contenedor.setOpaque(true);
		contenedor.setBackground(Color.gray);
		contenedor.setSize(500, 500);
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
		acceder.setLocation(170, 380);
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

}
