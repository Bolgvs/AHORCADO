package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
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
		frame.setBounds(100, 100, 499, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Teclado");
		lblNewLabel_2.setBounds(10, 301, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 314, 224, 233);
		frame.getContentPane().add(panel);
		
		JButton btnNewButton_1 = new JButton("A");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("B");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("C");
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("D");
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("E");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("F");
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("G");
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("H");
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("I");
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("J");
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("K");
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("L");
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("M");
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("N");
		panel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("Ñ");
		panel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("O");
		panel.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("P");
		panel.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("Q");
		panel.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("R");
		panel.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("S");
		panel.add(btnNewButton_19);
		
		JButton btnNewButton_20 = new JButton("T");
		panel.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("U");
		panel.add(btnNewButton_21);
		
		JButton btnNewButton_22 = new JButton("V");
		panel.add(btnNewButton_22);
		
		JButton btnNewButton_23 = new JButton("W");
		panel.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("X");
		panel.add(btnNewButton_24);
		
		JButton btnNewButton_25 = new JButton("Y");
		panel.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Z");
		panel.add(btnNewButton_26);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 23, 224, 111);
		frame.getContentPane().add(panel_2);
		
		JButton btnNewButton_27 = new JButton("Iniciar juego");
		panel_2.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("Resolver");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_28);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 242, 224, 48);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Palabra secreta");
		lblNewLabel_2_1.setBounds(10, 225, 129, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 156, 224, 58);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(234, 11, 239, 536);
		frame.getContentPane().add(panel_4);
	}
}
