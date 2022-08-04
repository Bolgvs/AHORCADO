package view;

import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Partida;

import java.awt.Color;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.awt.BorderLayout;
import java.awt.Font;


public class AhorcadoWindow {
	private JFrame frame;
	private Partida partida;
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
		frame.setResizable(false);
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 571, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panelJuego = new JPanel();
		panelJuego.setBounds(10, 0, 549, 371);
		frame.getContentPane().add(panelJuego);
		panelJuego.setLayout(new GridLayout(1, 0, 25, 0));
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMenu.setBounds(10, 11, 46, 14);
		
		JLabel lblTeclado = new JLabel("Teclado");
		lblTeclado.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTeclado.setBounds(10, 283, 46, 14);
		
		JPanel panelLetras_1 = new JPanel();
		panelLetras_1.setBackground(Color.BLACK);
		panelLetras_1.setBounds(10, 213, 224, 48);
		
		JLabel lblPalabraSecreta = new JLabel("Palabra secreta");
		lblPalabraSecreta.setBackground(Color.BLACK);
		lblPalabraSecreta.setForeground(Color.BLACK);
		lblPalabraSecreta.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPalabraSecreta.setBounds(10, 188, 129, 14);
		
		JLabel lblPalabraOculta = new JLabel("");
		lblPalabraOculta.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPalabraOculta.setForeground(Color.WHITE);
		panelLetras_1.add(lblPalabraOculta);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(10, 308, 46, 23);
		clickBotonTeclado(btnA, lblPalabraOculta);
		
		JButton btnC = new JButton("C");
		btnC.setBounds(104, 308, 46, 23);
		clickBotonTeclado(btnC, lblPalabraOculta);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(58, 308, 46, 23);
		clickBotonTeclado(btnB, lblPalabraOculta);
		
		JButton btnK = new JButton("K");
		btnK.setBounds(10, 354, 46, 23);
		clickBotonTeclado(btnK, lblPalabraOculta);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(58, 331, 46, 23);
		clickBotonTeclado(btnG, lblPalabraOculta);
		
		JButton btnJ = new JButton("J");
		btnJ.setBounds(193, 331, 46, 23);
		clickBotonTeclado(btnJ, lblPalabraOculta);
		
		JButton btnR = new JButton("R");
		btnR.setBounds(147, 376, 46, 23);
		clickBotonTeclado(btnR, lblPalabraOculta);
		
		JButton btnN = new JButton("N");
		btnN.setBounds(147, 354, 46, 23);
		clickBotonTeclado(btnN, lblPalabraOculta);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(193, 308, 46, 23);
		clickBotonTeclado(btnE, lblPalabraOculta);
		
		JButton btnH = new JButton("H");
		btnH.setBounds(104, 331, 46, 23);
		clickBotonTeclado(btnH, lblPalabraOculta);
		
		JButton btnP = new JButton("P");
		btnP.setBounds(58, 376, 46, 23);
		clickBotonTeclado(btnP, lblPalabraOculta);
		
		JButton btnM = new JButton("M");
		btnM.setBounds(104, 354, 46, 23);
		clickBotonTeclado(btnM, lblPalabraOculta);
		
		JButton btnW = new JButton("W");
		btnW.setBounds(147, 400, 46, 23);
		clickBotonTeclado(btnW, lblPalabraOculta);
		
		JButton btnS = new JButton("S");
		btnS.setBounds(193, 376, 46, 23);
		clickBotonTeclado(btnS, lblPalabraOculta);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(10, 331, 46, 23);
		clickBotonTeclado(btnF, lblPalabraOculta);
		
		JButton btnL = new JButton("L");
		btnL.setBounds(58, 354, 46, 23);
		clickBotonTeclado(btnL, lblPalabraOculta);
		
		JButton btnT = new JButton("T");
		btnT.setBounds(10, 400, 46, 23);
		clickBotonTeclado(btnT, lblPalabraOculta);
		
		JButton btnY = new JButton("Y");
		btnY.setBounds(10, 423, 46, 23);
		clickBotonTeclado(btnY, lblPalabraOculta);
		
		JButton btnQ = new JButton("Q");
		btnQ.setBounds(104, 376, 46, 23);
		clickBotonTeclado(btnQ, lblPalabraOculta);
		
		JButton btnO = new JButton("O");
		btnO.setBounds(10, 376, 46, 23);
		clickBotonTeclado(btnO, lblPalabraOculta);
		
		JButton btnZ = new JButton("Z");
		btnZ.setBounds(58, 423, 46, 23);
		clickBotonTeclado(btnZ, lblPalabraOculta);
		
		JButton btnU = new JButton("U");
		btnU.setBounds(58, 400, 46, 23);
		clickBotonTeclado(btnU, lblPalabraOculta);
		
		JButton btnV = new JButton("V");
		btnV.setBounds(104, 400, 46, 23);
		clickBotonTeclado(btnV, lblPalabraOculta);
		
		JButton btnI = new JButton("I");
		btnI.setBounds(147, 331, 46, 23);
		clickBotonTeclado(btnI, lblPalabraOculta);
		
		JButton btnX = new JButton("X");
		btnX.setBounds(193, 400, 46, 23);
		clickBotonTeclado(btnX, lblPalabraOculta);
		
		JButton btnNN = new JButton("Ñ");
		btnNN.setBounds(193, 354, 46, 23);
		clickBotonTeclado(btnNN, lblPalabraOculta);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(147, 308, 46, 23);
		clickBotonTeclado(btnD, lblPalabraOculta);
		
		JPanel panelLetras = new JPanel();
		panelLetras.setBounds(10, 308, 238, 181);
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
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(1, 11, 179, 120);
		panel_menu.setLayout(new GridLayout(2, 0, 0, 0));
		panel_menu.add(lblMenu);
		panel_menu.add(btnResolver);
		
		JPanel panel_palabra = new JPanel();
		panel_palabra.setBounds(1, 142, 167, 142);
		panel_palabra.setLayout(new GridLayout(3, 0, 0, 0));
		
		JPanel panel_pistas = new JPanel();
		panel_palabra.add(panel_pistas);
		panel_pistas.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnPista1 = new JButton("");
		btnPista1.setBackground(Color.RED);
		panel_pistas.add(btnPista1);
		
		JButton btnPista2 = new JButton("");
		btnPista2.setBackground(Color.RED);
		panel_pistas.add(btnPista2);
		
		JButton btnPista3 = new JButton("");
		btnPista3.setBackground(Color.RED);
		panel_pistas.add(btnPista3);
		
		JButton btnPista4 = new JButton("");
		btnPista4.setBackground(Color.RED);
		panel_pistas.add(btnPista4);
		
		JButton btnPista5 = new JButton("");
		btnPista5.setBackground(Color.RED);
		panel_pistas.add(btnPista5);
		panel_palabra.add(lblPalabraSecreta);
		panel_palabra.add(panelLetras_1);
		

		JPanel panel_teclado = new JPanel();
		panel_teclado.setBounds(185, 106, 167, 166);
		panel_teclado.setLayout(new BorderLayout(0, 0));
		panel_teclado.add(lblTeclado, BorderLayout.NORTH);
		panel_teclado.add(panelLetras, BorderLayout.CENTER);
		
		
		JPanel panelMecanicas = new JPanel();
		panelJuego.add(panelMecanicas);
		panelMecanicas.setLayout(new BorderLayout(0, 10));
		
		panelMecanicas.add(panel_menu, BorderLayout.NORTH);
		panelMecanicas.add(panel_palabra, BorderLayout.CENTER);
		panelMecanicas.add(panel_teclado, BorderLayout.SOUTH);
		
		JPanel panelImagen = new JPanel();
		panelJuego.add(panelImagen);
		panelImagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		panelJuego.setVisible(false);
		

		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(12, 0, 547, 383);
		frame.getContentPane().add(panelInicio);
		panelInicio.setLayout(null);
		
		JLabel lblHangmanV = new JLabel("Hangman v1.0\n");
		lblHangmanV.setFont(new Font("URW Gothic", Font.BOLD, 33));
		lblHangmanV.setBounds(152, 100, 265, 37);
		panelInicio.add(lblHangmanV);
		
		JLabel lblByNicoPau = new JLabel("by  Nico, Pau & Joel");
		lblByNicoPau.setBounds(202, 139, 226, 15);
		
		panelInicio.add(lblByNicoPau);		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnAbout.setBounds(218, 256, 117, 25);
		panelInicio.add(btnAbout);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] buttons = { "Principiante", "Intermedio", "Avanzado" };
				
				int dificultad = JOptionPane.showOptionDialog(null, "Escoje la dificultad", "Preparando partida...",
				        JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[2]);
				
				if (dificultad == -1)
				{
					dificultad = 0;
				}
				
				switch (dificultad) {
					case 0:
						partida = new Partida();
						break;
					
					case 1:
						partida = new Partida(Partida.tipos_dificultad.intermedio);
						break;
						
					case 2:
						partida = new Partida(Partida.tipos_dificultad.avanzado);
						break;	
				}
				
				panelInicio.setVisible(false);
				panelJuego.setVisible(true);
				
				lblPalabraOculta.setText(partida.getPalabraOculta());

			}
		});
		
		btnPlay.setBounds(218, 205, 117, 25);
		panelInicio.add(btnPlay);
		
		/*
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		InputStream input = classLoader.getResourceAsStream("/images/hangman_sprite/hangman00i.jpg");
		try {
			Image logo = ImageIO.read(input);
			panelImagen.add(logo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
	}
	
	
	private void clickBotonTeclado(JButton btn, JLabel lbl) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				partida.comprobarLetra(btn);
				lbl.setText(partida.getPalabraOculta());
			}
		});
	}
}

