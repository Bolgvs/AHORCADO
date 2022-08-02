package logic;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Partida {
	private String[] arrayPalabras = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	private List<String> palabras = Arrays.asList(arrayPalabras);
	
	private String palabra = new String();
	
	private int intentos = 10;
	
	private String palabraOculta = new String();
	private List<Character> letras;
	
	private char[] palabraArray = palabra.toCharArray();
	
	
	private void escogerPalabra() {
		// Generate random integer to select a word from the string array
		Random rand = new Random();
		palabra = palabras.get(rand.nextInt(palabras.size()));
	}
	
	public boolean contieneLetra(char a) {
		// Add the letter to the guessed letters array
		letras.add(a);
		
		// Check if the current random word contains the character the user inputted
		return palabra.contains(Character.toString(a));
	}
	
	public void actualizarPalabraOculta(char a) {
		
		for (int i = 0; i < palabraArray.length; i++) {
			if (letras.contains(palabraArray[i]))
				palabraOculta += palabraArray[i] + " ";
			else
				palabraOculta += "_ ";
		}
	}
	
	public void comprobarLetra(char a, Button b) {
		if (!contieneLetra(a)) {
			intentos--;
		}
		
		b.setEnabled(false);
		actualizarPalabraOculta(a);
	}
	
}
