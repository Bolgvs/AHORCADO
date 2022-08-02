package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.GridLayout;


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
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblMenu);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setBounds(10, 283, 46, 14);
		frame.getContentPane().add(lblTeclado);
		
		JPanel panelLetras_1 = new JPanel();
		panelLetras_1.setBackground(Color.BLACK);
		panelLetras_1.setBounds(10, 213, 224, 48);
		frame.getContentPane().add(panelLetras_1);
		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setBounds(10, 188, 129, 14);
		frame.getContentPane().add(lblPalabraSecreta);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 308, 46, 23);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(104, 308, 46, 23);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(58, 308, 46, 23);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(10, 354, 46, 23);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(58, 331, 46, 23);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(193, 331, 46, 23);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(147, 376, 46, 23);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(147, 354, 46, 23);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(193, 308, 46, 23);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(104, 331, 46, 23);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(58, 376, 46, 23);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(104, 354, 46, 23);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(147, 400, 46, 23);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(193, 376, 46, 23);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(10, 331, 46, 23);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(58, 354, 46, 23);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(10, 400, 46, 23);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(10, 423, 46, 23);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(104, 376, 46, 23);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(10, 376, 46, 23);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(58, 423, 46, 23);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(58, 400, 46, 23);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(104, 400, 46, 23);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(147, 331, 46, 23);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(193, 400, 46, 23);
		
		JButton btnNN = new JButton("Ñ");
		btnNN.setBounds(193, 354, 46, 23);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(147, 308, 46, 23);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 142, 224, 35);
		frame.getContentPane().add(editorPane);
		
		JPanel panelLetras = new JPanel();
		panelLetras.setBounds(10, 308, 214, 181);
		frame.getContentPane().add(panelLetras);
		panelLetras.setLayout(new GridLayout(0, 5, 1, 0));
		
		panelLetras.add(btnA);
		
		panelLetras.add(btnB);
		
		panelLetras.add(btnC);
		
		panelLetras.add(btnD);
		
		panelLetras.add(btnE);
		
		panelLetras.add(btnF);
		
		panelLetras.add(btnG);
		
		panelLetras.add(btnH);
		
		panelLetras.add(btnI);
		
		panelLetras.add(btnJ);
		
		panelLetras.add(btnK);
		
		panelLetras.add(btnL);
		
		panelLetras.add(btnM);
		
		panelLetras.add(btnN);
		
		panelLetras.add(btnNN);
		
		panelLetras.add(btnO);
		
		panelLetras.add(btnP);
		
		panelLetras.add(btnQ);
		
		panelLetras.add(btnR);
		
		panelLetras.add(btnS);
		
		panelLetras.add(btnT);
		
		panelLetras.add(btnU);
		
		panelLetras.add(btnV);
		
		panelLetras.add(btnW);
		
		panelLetras.add(btnX);
		
		panelLetras.add(btnY);
		
		panelLetras.add(btnZ);
		
		JPanel panelIniciar = new JPanel();
		panelIniciar.setBounds(10, 36, 163, 77);
		frame.getContentPane().add(panelIniciar);
		panelIniciar.setLayout(new GridLayout(2, 0, 0, 2));
		
		JButton btnResolver = new JButton("Resolver");
		panelIniciar.add(btnResolver);
		
		JButton btnIniciar = new JButton("Iniciar juego");
		panelIniciar.add(btnIniciar);
	}
}
