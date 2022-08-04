package logic;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;

public class Partida {

	// Game difficulty types enum
	enum tipos_dificultad {
		principiante, intermedio, avanzado
	};

	// Number of tries per life
	private int intentos;
	
	// Number of hints
	private final int PISTAS = 5;

	// Array with Strings that contains the words to guess
	private String[] arrayPalabras = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve",
			"diez" };
	
	// List of words using Java's List
	private List<String> palabras = Arrays.asList(arrayPalabras);

	// String to guess
	private String palabra = new String();

	// String to guess's display in-game
	private String palabraOculta = new String();
	
	// List of current, already used letters
	private List<Character> letras;

	// String-to-guess in char array form for easier and more straightforward manipulation
	private char[] palabraArray = palabra.toCharArray();

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
		for (int i = 0; i < palabraArray.length; i++) {
			if (letras.contains(palabraArray[i]))
				palabraOculta += palabraArray[i] + " ";
			else
				palabraOculta += "_ ";
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
	}
	
	/*
	 * 	Partida's default
	 */
	public Partida() {
		// Assume 'beginner dificulty' on default constructor
		this.intentos = 10;
	}

	/*
	 * 	palabraOculta's getter
	 * 
	 * 	@return String	:	Returns palabraOculta
	 */
	public String getPalabraOculta() {
		return palabraOculta;
	}

}
