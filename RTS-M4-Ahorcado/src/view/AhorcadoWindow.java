package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;


public class AhorcadoWindow {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AhorcadoWindow window = new AhorcadoWindow();
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
	public AhorcadoWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 571, 539);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Teclado");
		lblNewLabel_2.setBounds(10, 283, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 207, 224, 48);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Palabra secreta");
		lblNewLabel_2_1.setBounds(10, 188, 129, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JButton btnNewButton_27 = new JButton("Iniciar juego");
		frame.getContentPane().add(btnNewButton_27);
		btnNewButton_27.setBounds(0, 36, 224, 48);
		
		JButton btnNewButton_28 = new JButton("Resolver");
		btnNewButton_28.setBounds(0, 83, 224, 48);
		frame.getContentPane().add(btnNewButton_28);
		
		JButton btnNewButton_1 = new JButton("A");
		btnNewButton_1.setBounds(10, 308, 46, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBounds(104, 308, 46, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("B");
		btnNewButton_2.setBounds(58, 308, 46, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_10 = new JButton("K");
		btnNewButton_10.setBounds(10, 354, 46, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_6 = new JButton("G");
		btnNewButton_6.setBounds(58, 331, 46, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("J");
		btnNewButton_9.setBounds(193, 331, 46, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_18 = new JButton("R");
		btnNewButton_18.setBounds(147, 376, 46, 23);
		frame.getContentPane().add(btnNewButton_18);
		
		JButton btnNewButton_13 = new JButton("N");
		btnNewButton_13.setBounds(147, 354, 46, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_4 = new JButton("E");
		btnNewButton_4.setBounds(193, 308, 46, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_7 = new JButton("H");
		btnNewButton_7.setBounds(104, 331, 46, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_16 = new JButton("P");
		btnNewButton_16.setBounds(58, 376, 46, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_12 = new JButton("M");
		btnNewButton_12.setBounds(104, 354, 46, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_23 = new JButton("W");
		btnNewButton_23.setBounds(147, 400, 46, 23);
		frame.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_19 = new JButton("S");
		btnNewButton_19.setBounds(193, 376, 46, 23);
		frame.getContentPane().add(btnNewButton_19);
		
		JButton btnNewButton_5 = new JButton("F");
		btnNewButton_5.setBounds(10, 331, 46, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_11 = new JButton("L");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11.setBounds(58, 354, 46, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_20 = new JButton("T");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_20.setBounds(10, 400, 46, 23);
		frame.getContentPane().add(btnNewButton_20);
		
		JButton btnNewButton_25 = new JButton("Y");
		btnNewButton_25.setBounds(10, 423, 46, 23);
		frame.getContentPane().add(btnNewButton_25);
		
		JButton btnNewButton_17 = new JButton("Q");
		btnNewButton_17.setBounds(104, 376, 46, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_15 = new JButton("O");
		btnNewButton_15.setBounds(10, 376, 46, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_26 = new JButton("Z");
		btnNewButton_26.setBounds(58, 423, 46, 23);
		frame.getContentPane().add(btnNewButton_26);
		
		JButton btnNewButton_21 = new JButton("U");
		btnNewButton_21.setBounds(58, 400, 46, 23);
		frame.getContentPane().add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("V");
		btnNewButton_22.setBounds(104, 400, 46, 23);
		frame.getContentPane().add(btnNewButton_22);
		
		JButton btnNewButton_8 = new JButton("I");
		btnNewButton_8.setBounds(147, 331, 46, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_24 = new JButton("X");
		btnNewButton_24.setBounds(193, 400, 46, 23);
		frame.getContentPane().add(btnNewButton_24);
		
		JButton btnNewButton_14 = new JButton("Ñ");
		btnNewButton_14.setBounds(193, 354, 46, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_4_1 = new JButton("D");
		btnNewButton_4_1.setBounds(147, 308, 46, 23);
		frame.getContentPane().add(btnNewButton_4_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(0, 142, 224, 35);
		frame.getContentPane().add(editorPane);
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}
}
