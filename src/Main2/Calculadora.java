package Main2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Calculadora extends JFrame {
	
	public Calculadora() {
		this.setVisible(true);
		this.setSize(360, 375);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setMinimumSize(new Dimension(200,200));
		this.setMaximumSize(new Dimension(800,800));
		this.setTitle("Calculadora");
		this.setBackground(Color.BLACK);
		this.getContentPane().setBackground(Color.white);
		this.setLayout(null);
		
		JPanel calculadora = new JPanel();
		calculadora.setSize(360, 395);
		calculadora.setOpaque(true);
		calculadora.setBackground(Color.black);
		calculadora.setLayout(null);
		this.add(calculadora);
		
		JTextField result = new JTextField();
		result.setSize(335, 50);
		result.setLocation(5, 5);
		result.setBackground(Color.black);
		result.setHorizontalAlignment(JLabel.CENTER);
		result.setForeground(Color.white);
		result.setFont(new Font("Arial",Font.BOLD,20));
		result.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(result);
		
		JButton borrar = new JButton("CE");
		borrar.setBounds(5, 60, 80, 50);
		borrar.setBackground(Color.gray);
		borrar.setForeground(Color.white);
		borrar.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(borrar);
		
		JPanel rect = new JPanel();
		rect.setBounds(90, 60, 250, 50);
		rect.setBackground(Color.gray);
		calculadora.add(rect);
		
		JButton siete = new JButton("7");
		siete.setBounds(5, 115, 80, 50);
		siete.setBackground(Color.darkGray);
		siete.setForeground(Color.white);
		siete.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(siete);
		
		JButton cuatro = new JButton("4");
		cuatro.setBounds(5, 170, 80, 50);
		cuatro.setBackground(Color.darkGray);
		cuatro.setForeground(Color.white);
		cuatro.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(cuatro);
		
		JButton uno = new JButton("1");
		uno.setBounds(5, 225, 80, 50);
		uno.setBackground(Color.darkGray);
		uno.setForeground(Color.white);
		uno.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(uno);
		
		JButton cero = new JButton("0");
		cero.setBounds(5, 280, 80, 50);
		cero.setBackground(Color.darkGray);
		cero.setForeground(Color.white);
		cero.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(cero);
		
		JButton ocho = new JButton("8");
		ocho.setBounds(90, 115, 80, 50);
		ocho.setBackground(Color.darkGray);
		ocho.setForeground(Color.white);
		ocho.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(ocho);
		
		JButton cinco = new JButton("5");
		cinco.setBounds(90, 170, 80, 50);
		cinco.setBackground(Color.darkGray);
		cinco.setForeground(Color.white);
		cinco.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(cinco);
		
		JButton dos = new JButton("2");
		dos.setBounds(90, 225, 80, 50);
		dos.setBackground(Color.darkGray);
		dos.setForeground(Color.white);
		dos.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(dos);
		
		JButton punto = new JButton(".");
		punto.setBounds(90, 280, 80, 50);
		punto.setBackground(Color.darkGray);
		punto.setForeground(Color.white);
		punto.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(punto);
		
		JButton nine = new JButton("9");
		nine.setBounds(175, 115, 80, 50);
		nine.setBackground(Color.darkGray);
		nine.setForeground(Color.white);
		nine.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(nine);
		
		JButton six = new JButton("6");
		six.setBounds(175, 170, 80, 50);
		six.setBackground(Color.darkGray);
		six.setForeground(Color.white);
		six.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(six);
		
		JButton tres = new JButton("3");
		tres.setBounds(175, 225, 80, 50);
		tres.setBackground(Color.darkGray);
		tres.setForeground(Color.white);
		tres.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(tres);
		
		JButton igual = new JButton("=");
		igual.setBounds(175, 280, 80, 50);
		igual.setBackground(Color.orange);
		igual.setForeground(Color.white);
		igual.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(igual);
		
		JButton div = new JButton("/");
		div.setBounds(260, 115, 80, 50);
		div.setBackground(Color.orange);
		div.setForeground(Color.white);
		div.setFont(new Font("Arial",Font.BOLD,20));
		div.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(div);
		
		JButton por = new JButton("*");
		por.setBounds(260, 170, 80, 50);
		por.setBackground(Color.orange);
		por.setForeground(Color.white);
		por.setFont(new Font("Arial",Font.BOLD,20));
		por.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(por);
		
		JButton menos = new JButton("-");
		menos.setBounds(260, 225, 80, 50);
		menos.setBackground(Color.orange);
		menos.setForeground(Color.white);
		menos.setFont(new Font("Arial",Font.BOLD,20));
		menos.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(menos);
		
		JButton mas = new JButton("+");
		mas.setBounds(260, 280, 80, 50);
		mas.setBackground(Color.orange);
		mas.setForeground(Color.white);
		mas.setFont(new Font("Arial",Font.BOLD,20));
		mas.setBorder(BorderFactory.createLineBorder(Color.white));
		calculadora.add(mas);
		
		calculadora.repaint();
		
		
;		
	}
	

}
