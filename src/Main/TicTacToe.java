package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TicTacToe {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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
		
		JButton btnNewButton_9 = new JButton("Reiniciar");
		panel.add(btnNewButton_9);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setBackground(Color.decode("#BAFA9B"));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.decode("#BAFA9B"));
		panel_1.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("0:00");
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel panel_5 = new JPanel();
		panel_4.add(panel_5);
		panel_5.setBackground(Color.decode("#BAFA9B"));
		
		JLabel lblNewLabel_1 = new JLabel("X:0");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_5.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.decode("#BAFA9B"));
		panel_4.add(panel_6);
		
		JLabel lblNewLabel_2 = new JLabel("O:0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panel_6.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setBackground(Color.decode("#BAFA9B"));
		panel_2.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		panel_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("");
		panel_2.add(btnNewButton_6);
		
		JButton btnNewButton = new JButton("");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_5 = new JButton("");
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_7 = new JButton("");
		panel_2.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		panel_2.add(btnNewButton_8);
	}

}
