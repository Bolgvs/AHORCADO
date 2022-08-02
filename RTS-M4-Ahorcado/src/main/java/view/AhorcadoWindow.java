package view;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AhorcadoWindow {
	private JFrame frame;
	
	private JButton b, b1;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
  
        // Creating a new buttons
        b = new JButton("button1");
        b1 = new JButton("button2");
  
        // Creating a panel to add buttons
        JPanel p = new JPanel();
  
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        
        // Adding buttons and textfield to panel
        // using add() method
        p.add(b);
        p.add(b1);
  
        
  
        // Adding panel to frame
        frame.add(p);
	}
}
