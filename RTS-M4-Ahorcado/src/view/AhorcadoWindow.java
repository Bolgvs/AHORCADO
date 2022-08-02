package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

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
		frame.setBounds(100, 100, 499, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Teclado");
		lblNewLabel_2.setBounds(10, 301, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 314, 224, 167);
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 23, 224, 111);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 242, 224, 48);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Palabra secreta");
		lblNewLabel_2_1.setBounds(10, 225, 129, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 156, 224, 58);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(234, 11, 239, 470);
		frame.getContentPane().add(panel_4);
	}
}
