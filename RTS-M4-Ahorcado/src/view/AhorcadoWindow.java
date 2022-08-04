package view;

import java.awt.EventQueue;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import logic.Partida;

import java.awt.Color;
import java.awt.Component;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Font;


public class AhorcadoWindow {
	private JFrame frame;
	private Partida partida;
	private char[] alfabeto = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', '�', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	private JPanel panelJuego;
	private JPanel panelInicio;
	private JPanel panelLetras;
	private JPanel panel_pistas;
	private JPanel panelImagen;
	
	int imagenahora = 0;
	
	Partida.tipos_dificultad dificultad;
	
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
		
		panelJuego = new JPanel();
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
		lblPalabraOculta.setFont(new Font("Ubuntu", Font.BOLD, 23));
		lblPalabraOculta.setForeground(Color.WHITE);
		panelLetras_1.add(lblPalabraOculta);
		
		panelLetras = new JPanel();
		panelLetras.setBounds(10, 308, 238, 181);
		panelLetras.setLayout(new GridLayout(0, 5, 1, 0));
		
		////////////////////////////////////
		crearTeclado(panelLetras, lblPalabraOculta);
		
		////////////////////////
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (partida.getPalabraOculta().replaceAll("\\s+","").equals(partida.getPalabra()) == true)
				{
					partida.finalizarPartida(panelJuego, panelInicio, panelImagen, true);
					visibilidadBotones(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Palabra incorrecta! Sigue intentando...");
				}
				
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
		
		panel_pistas = new JPanel();
		panel_palabra.add(panel_pistas);
		panel_pistas.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnPista1 = new JButton("");
		btnPista1.setOpaque(false);
		btnPista1.setContentAreaFilled(false);
		btnPista1.setBorderPainted(false);

		
		btnPista1.setBackground(Color.RED);
		btnPista1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPista1.setVisible(false);
			}
		});
		
		panel_pistas.add(btnPista1);
		
		JButton btnPista2 = new JButton("");
		btnPista2.setOpaque(false);
		btnPista2.setContentAreaFilled(false);
		btnPista2.setBorderPainted(false);
		
		btnPista2.setBackground(Color.RED);
		btnPista2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPista2.setVisible(false);
			}
		});
		
		panel_pistas.add(btnPista2);
		
		JButton btnPista3 = new JButton("");
		btnPista3.setOpaque(false);
		btnPista3.setContentAreaFilled(false);
		btnPista3.setBorderPainted(false);
		
		btnPista3.setBackground(Color.RED);
		btnPista3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPista3.setVisible(false);
			}
		});
		
		panel_pistas.add(btnPista3);
		
		JButton btnPista4 = new JButton("");
		btnPista4.setOpaque(false);
		btnPista4.setContentAreaFilled(false);
		btnPista4.setBorderPainted(false);
		
		btnPista4.setBackground(Color.RED);
		btnPista4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPista4.setVisible(false);
			}
		});
		
		panel_pistas.add(btnPista4);
		
		JButton btnPista5 = new JButton("");
		btnPista5.setOpaque(false);
		btnPista5.setContentAreaFilled(false);
		btnPista5.setBorderPainted(false);
		
		btnPista5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnPista5.setVisible(false);
			}
		});
		
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
		
		panelImagen = new JPanel();
		panelJuego.add(panelImagen);
		panelImagen.setLayout(new GridLayout(1, 0, 0, 0));
		
		panelJuego.setVisible(false);
		

		panelInicio = new JPanel();
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
				
				int opcion_dificultad = JOptionPane.showOptionDialog(null, "Escoje la dificultad", "Preparando partida...",
				        JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[2]);
				
				if (opcion_dificultad == -1)
				{
					opcion_dificultad = 0;
				}
				
				ImageIcon imageIcon;
				Image image;
				Image newimg;

				
				switch (opcion_dificultad) {
					case 0:
						partida = new Partida();
						dificultad = Partida.tipos_dificultad.principiante;
						imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/Hangman sprite 10/hangman10i.jpg"));
						image = imageIcon.getImage();

						newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
			
						panelImagen.add(new JLabel(new ImageIcon(newimg)));
						
						break;
					
					case 1:
						partida = new Partida(Partida.tipos_dificultad.intermedio);
						dificultad = Partida.tipos_dificultad.intermedio;
						imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/Hangman sprite 10/hangman08i.jpg"));
						image = imageIcon.getImage();

						newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
			
						panelImagen.add(new JLabel(new ImageIcon(newimg)));
						
						break;
						
					case 2:
						partida = new Partida(Partida.tipos_dificultad.avanzado);
						dificultad = Partida.tipos_dificultad.avanzado;
						imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/Hangman sprite 10/hangman06i.jpg"));
						image = imageIcon.getImage();

						
						newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
			
						panelImagen.add(new JLabel(new ImageIcon(newimg)));
						
						break;
				}
				
				panelInicio.setVisible(false);
				imagenesPistas();
				

				panelJuego.setVisible(true);
				
				lblPalabraOculta.setText(partida.getPalabraOculta());

			}
		});
		
		btnPlay.setBounds(218, 205, 117, 25);
		panelInicio.add(btnPlay);
	}
	
	private void visibilidadBotones(boolean estanActivos) {
		Component[] components = panelLetras.getComponents();

		for (Component component : components) {
		    if (component instanceof JButton) {
		        component.setEnabled(estanActivos);
		    }
		}
	}
	
	private void clickBotonTeclado(JButton btn, JLabel lbl) {
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (partida.getIntentos() <= 1)
				{
					actualizarHangman(partida.getIntentos() - 1);
					partida.finalizarPartida(panelJuego, panelInicio, panelImagen, false);
					visibilidadBotones(true);
				}
				else
				{
					if (partida.comprobarLetra(btn) == false)
					{
						actualizarHangman(partida.getIntentos());
					}
					
					lbl.setText(partida.getPalabraOculta());
				}
				
			}
		});
	}
	
	private void crearTeclado(JPanel p, JLabel l) {
		
		for(int i = 0; i<alfabeto.length; i++) {
			JButton btnTecla = new JButton(alfabeto[i]+"");
			btnTecla.setBounds(10, 308, 46, 23);
			clickBotonTeclado(btnTecla, l);
			p.add(btnTecla);
		}
	}
	
	private void imagenesPistas() {
		Component[] components = panel_pistas.getComponents();
		
		ImageIcon imageIcon = new ImageIcon(getClass().getClassLoader().getResource("images/bulb.png"));
		Image image = imageIcon.getImage();
		Image newimg;
		
		for (int i = 0; i < components.length; i++) {
			newimg = image.getScaledInstance(components[i].getSize().height, components[i].getSize().width,  java.awt.Image.SCALE_SMOOTH);
			((JButton) components[i]).setIcon(new ImageIcon(newimg));
		}

	}
	
	private void actualizarHangman(int intentos) {
		String imagename;
		ImageIcon imageIcon;
		Image image;
		Image newimg;
		
		switch (dificultad) {
			case principiante:
				imagename = "images/Hangman sprite 10/hangman0" + (intentos) + "i.jpg"; 
				imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagename));
				image = imageIcon.getImage();

				newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
	
				panelImagen.removeAll();
				panelImagen.revalidate();

				panelImagen.add(new JLabel(new ImageIcon(newimg)));
				
				panelImagen.repaint();
				
				break;
				
			case intermedio:
				imagename = "images/Hangman sprite 10/hangman0" + (intentos) + "i.jpg"; 
				imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagename));
				image = imageIcon.getImage();
				
				newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
	
				panelImagen.removeAll();
				panelImagen.revalidate();

				panelImagen.add(new JLabel(new ImageIcon(newimg)));
				
				panelImagen.repaint();
			
				break;
				
			case avanzado:
				imagename = "images/Hangman sprite 10/hangman0" + (intentos) + "i.jpg"; 
				imageIcon = new ImageIcon(getClass().getClassLoader().getResource(imagename));
				image = imageIcon.getImage();
				
				newimg = image.getScaledInstance(panelImagen.getSize().height, panelImagen.getSize().width,  java.awt.Image.SCALE_SMOOTH);
	
				panelImagen.removeAll();
				panelImagen.revalidate();

				panelImagen.add(new JLabel(new ImageIcon(newimg)));
				
				panelImagen.repaint();
				
				break;
		}
	}
}

