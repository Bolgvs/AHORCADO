package logic;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Partida {
	private String[] arrayPalabras = {"uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
	private List<String> palabras = Arrays.asList(arrayPalabras);
	private String palabra = "";
	private int intentos = 10;
	private String palabraOculta = "";
	private List<Character> letras;
	private char[] palabraArray = palabra.toCharArray();
	
	
	private void generarPalabra() {
		Random rand = new Random();
		palabra = palabras.get(rand.nextInt(palabras.size()));
	}
	
	public boolean contieneLetra(String a) {
		
		letras.add(a.charAt(0));
		return palabra.contains(a);
	}
	
	
	public void actualizarPalabraOculta(char a) {
		
		for(int i=0; i<palabraArray.length; i++) {
			if(letras.contains(palabraArray[i]))
				palabraOculta += palabraArray[i] + " ";
			else
				palabraOculta += "_ ";
		}
	}
	
	public void comprobarLetra(char a, Button b) {
		if(!contieneLetra(a + "")) {
			intentos--;
		}
		
		b.setEnabled(false);
		actualizarPalabraOculta(a);
	}
	
}
