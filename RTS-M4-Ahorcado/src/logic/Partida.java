package logic;

import java.awt.Button;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Partida {

	// Game difficulty types enum
	public enum tipos_dificultad {
		principiante, intermedio, avanzado
	};

	// Number of tries per life
	private int intentos;
	
	// Number of hints
	private final int PISTAS = 5;

	// Array with Strings that contains the words to guess
	private String[] arrayPalabras = { "UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE",
			"DIEZ" };
	
	// List of words using Java's List
	private List<String> palabras = Arrays.asList(arrayPalabras);

	// String to guess
	private String palabra = new String();

	// String to guess's display in-game
	private String palabraOculta = new String();
	
	// List of current, already used letters
	private ArrayList<Character> letras = new ArrayList<Character>();

	/*
	 * 	This function grabs a random String off the provided String array with developer-defined
	 * 	game-guessing Strings.
	 * 
	 */
	private void escogerPalabra() {
		// Generate random integer to select a word from the string array
		Random rand = new Random();
		
		// Assign palabra the result of the random String pick
		palabra = palabras.get(rand.nextInt(palabras.size()));
	}

	/*
	 * 	This function returns true-false if it finds the specified char (Or not) in the current
	 * 	game String.
	 * 
	 *	@param	char a	:	Character to find
	 *
	 *	@return	boolean	:	True or false depending if character is found or not respectively
	 */
	public boolean contieneLetra(char a) {
		// Add the letter to the guessed letters array
		letras.add(a);
		
		// Check if the current random word contains the character the user inputted
		return palabra.contains(Character.toString(a));
	}

	/*
	 * 	This function updates the visible-to-user hidden String to inform of the changes regarding
	 * 	it's letter picks.
	 * 
	 *	@param	char a	:	Character to find
	 */
	public void actualizarPalabraOculta(char a) {
		// Generate the word that will show on screen
		palabraOculta = "";
		
		for (int i = 0; i < palabra.length(); i++) {
			if (letras.contains(palabra.charAt(i))) {
				palabraOculta += palabra.charAt(i) + " ";
			} else {
				palabraOculta += "_ ";
			}
		}
	}

	/*
	 * 	This function checks if the String-to-guess contains the pressed-button's character;
	 * 	it then disables the button itself after checking and updating the hidden String,
	 * 
	 *	@param	JButton b	:	Button to get the info from
	 */
	public void comprobarLetra(JButton b) {
		char letraBoton = b.getText().charAt(0);

		if (!contieneLetra(letraBoton)) {
			intentos--;
		}

		b.setEnabled(false);
		actualizarPalabraOculta(letraBoton);
	}
	
	public void finalizarPartida(JPanel panelJuego, JPanel panelInicio) {
		String[] buttons = { "Reintentar", "Salir" };
		
		int quehacer = JOptionPane.showOptionDialog(null, "Has perdido...", "¿Que hacer?",
		        JOptionPane.INFORMATION_MESSAGE, 1, null, buttons, buttons[1]);
		
		if (quehacer == -1) quehacer = 1;
		
		if (quehacer == 0)
		{
			panelJuego.setVisible(false);
			panelInicio.setVisible(true);
		}
		else
		{
			System.exit(0);
		}
		
	}

	/*
	 * 	Partida's constructor using difficulty
	 * 
	 * 	@param tipos_dificultad dificultad	:	Enumeration with the 3 difficulty types
	 */
	public Partida(tipos_dificultad dificultad) {
		// Switch that assigns the corresponding tries based on the provided difficulty
		switch (dificultad) {
			case principiante:
				this.intentos = 10;
				break;
		
			case intermedio:
				this.intentos = 8;
				break;
					
			case avanzado:
				this.intentos = 6;
				break;
		}
		
		escogerPalabra();
		

		System.out.println(this.palabra);
		
		// Dummy
		actualizarPalabraOculta('½');
	}
	
	/*
	 * 	Partida's default
	 */
	public Partida() {
		// Assume 'beginner dificulty' on default constructor
		this.intentos = 10;
		
		escogerPalabra();
		
		System.out.println(this.palabra);

		// Dummy
		actualizarPalabraOculta('½');

	}

	/*
	 * 	palabraOculta's getter
	 * 
	 * 	@return String	:	Returns palabraOculta
	 */
	public String getPalabraOculta() {
		return palabraOculta;
	}
	
	public int getIntentos() {
		return intentos;
	}

}
