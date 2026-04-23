package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

class BotonGato extends JButton {

	int fila;
	int columna;
	String estado;

	public BotonGato(int f, int c) {
		fila = f;
		columna = c;
		estado = "";
	}
}

public class TicTacToe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	private BotonGato botones[][] = new BotonGato[3][3];
	private String tablero[][] = new String[3][3];

	private String turno = "X";

	private int puntosX = 0;
	private int puntosO = 0;

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		TicTacToe ventana = new TicTacToe();
	    ventana.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBackground(Color.decode("#BAFA9B"));
		frame.setBounds(100, 100, 450, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#BAFA9B"));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

		JButton btnReiniciar = new JButton("Reiniciar");
		panel.add(btnReiniciar);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(Color.decode("#BAFA9B"));
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#BAFA9B"));
		panel_1.add(panel_3, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("TIC TAC TOE");
		panel_3.add(lblNewLabel);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBackground(Color.decode("#BAFA9B"));
		panel_4.add(panel_5);

		lblNewLabel_1 = new JLabel("X:0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(lblNewLabel_1);

		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBackground(Color.decode("#BAFA9B"));
		panel_4.add(panel_6);

		lblNewLabel_2 = new JLabel("O:0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_6.add(lblNewLabel_2);

		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setBackground(Color.decode("#BAFA9B"));
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				tablero[i][j] = "";

				BotonGato boton = new BotonGato(i, j);
				boton.setFont(new Font("Arial", Font.BOLD, 40));
				boton.setFocusPainted(false);

				boton.setContentAreaFilled(false);
				boton.setOpaque(true);
				boton.setBorderPainted(true);

				boton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jugar(boton);
					}
				});

				botones[i][j] = boton;
				panel_2.add(boton);
			}
		}

		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpiar();
			}
		});
	}

	private void jugar(BotonGato boton) {

	    if (!boton.estado.equals("")) {
	        return;
	    }

	    boton.estado = turno;
	    boton.setText(turno);

	    if (turno.equals("X")) {
	        boton.setForeground(Color.RED);
	    } else {
	        boton.setForeground(Color.BLUE);
	    }

	    tablero[boton.fila][boton.columna] = turno;

	    if (ganador(turno)) {

	        JOptionPane.showMessageDialog(null, "Ganó " + turno);

	        if (turno.equals("X")) {
	            puntosX++;
	            lblNewLabel_1.setText("X:" + puntosX);
	        } else {
	            puntosO++;
	            lblNewLabel_2.setText("O:" + puntosO);
	        }

	        limpiar();
	        return;
	    }

	    if (empate()) {
	        JOptionPane.showMessageDialog(null, "Empate");
	        limpiar();
	        return;
	    }

	    turno = turno.equals("X") ? "O" : "X";
	}	

	private boolean ganador(String t) {

		for (int i = 0; i < 3; i++) {
			if (tablero[i][0].equals(t) &&
				tablero[i][1].equals(t) &&
				tablero[i][2].equals(t))
				return true;
		}

		for (int i = 0; i < 3; i++) {
			if (tablero[0][i].equals(t) &&
				tablero[1][i].equals(t) &&
				tablero[2][i].equals(t))
				return true;
		}

		if (tablero[0][0].equals(t) &&
			tablero[1][1].equals(t) &&
			tablero[2][2].equals(t))
			return true;

		if (tablero[0][2].equals(t) &&
			tablero[1][1].equals(t) &&
			tablero[2][0].equals(t))
			return true;

		return false;
	}

	private boolean empate() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (tablero[i][j].equals(""))
					return false;
			}
		}

		return true;
	}

	private void limpiar() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				tablero[i][j] = "";
				botones[i][j].estado = "";
				botones[i][j].setText("");
				botones[i][j].setEnabled(true);
			}
		}

	turno = "X";
	}
}
