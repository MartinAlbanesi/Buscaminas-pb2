package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBuscaminas {

	
	@Test
	public void queSePuedaCrearUnTablero() {
		//Preparacion
		Tablero nuevo;
		final Integer FILA_ESPERADA = 5;
		final Integer COLUMNA_ESPERADA = 5;
		final Integer CANTIDAD_DE_MINAS_ESPERADAS = 4;
		//Ejecucion
		nuevo = new Tablero (FILA_ESPERADA,COLUMNA_ESPERADA,CANTIDAD_DE_MINAS_ESPERADAS);
		//Validacion
		assertEquals(FILA_ESPERADA,nuevo.getFilas());
		assertEquals(FILA_ESPERADA,nuevo.getColumnas());
	}
	
	@Test
	public void queSePuedaCrearUnaCasilla() {
		//Preparacion
		Casilla nueva;
		final Integer POS_FILA_ESPERADA = 5;
		final Integer POS_COLUMNA_ESPERADA = 5;
		//Ejecucion
		nueva = new Casilla(POS_FILA_ESPERADA,POS_COLUMNA_ESPERADA);
		//Validacion
		assertEquals(POS_FILA_ESPERADA,nueva.getPosFila());
		assertEquals(POS_COLUMNA_ESPERADA,nueva.getPosColumna());
	}
	
	@Test
	public void queSePuedanIniciarlizarLasCasillasEnElTablero() {
		//Preparacion
		Tablero nuevo;
		final Integer FILA_ESPERADA = 5;
		final Integer COLUMNA_ESPERADA = 5;
		final Integer CANTIDAD_DE_MINAS_ESPERADAS = 4;
		//Ejecucion
		nuevo = new Tablero(FILA_ESPERADA,COLUMNA_ESPERADA,CANTIDAD_DE_MINAS_ESPERADAS);
		nuevo.imprimirTablero();
		//Validacion
	}

}
