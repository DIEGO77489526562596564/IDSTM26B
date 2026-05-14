package views;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.UsersController;

public class HomeView {
	
	public HomeView(){
		
	}
	
	public void HomeView(){
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
		
		JButton home = new JButton("Ir al panel de usuarios");
		home.setBounds(100,200,150,150);
		contenedor.add(home);
		
		home.addActionListener(e->{

		    ventana.dispose();
		    UsersController users = new UsersController();
		    users.showUsers();

		});
		
		
	}

}
