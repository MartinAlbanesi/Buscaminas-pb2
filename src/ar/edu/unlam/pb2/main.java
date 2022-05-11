package ar.edu.unlam.pb2;
import java.util.Scanner;

import ar.edu.unlam.pb2.*;

public class main {

	public static void main(String[] args) {
		Tablero nuevo;
		final Integer FILA_ESPERADA = 5;
		final Integer COLUMNA_ESPERADA = 5;
		final Integer CANTIDAD_DE_MINAS_ESPERADAS = 4;
		
		seleccionarDificultad();
		
		
	}
	
	
	public static void seleccionarDificultad() {
		Boolean repetir = false;
		do {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione la dificultad: ");
		System.out.println("1. Fácil    2. Normal    3. Difícil");
		int dificultad = teclado.nextInt();
		switch(dificultad) {
			case 1: {
				Tablero tableroFacil = new Tablero(9,9,10);	
				break;
			}
			case 2: {
				Tablero tableroNormal = new Tablero(16,16,40);
				break;
			}
			case 3: {
				Tablero tableroDificil = new Tablero(30,16,99);
				break;
			}
			default: {
				System.out.println("No se ha seleccionado una opción válida");
				System.out.println("Vuelva a ingresar una opcion");
				System.out.println("---------------------------------------");
				repetir = true;
				break;
			}
		}	

		
		}while(repetir==true);
	}
}

/*
	public static void seleccionarCasilla() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Seleccione la dificultad: ");
		System.out.println("1. Fácil    2. Normal    3. Difícil");
		int dificultad = teclado.nextInt();
	}
	*/
