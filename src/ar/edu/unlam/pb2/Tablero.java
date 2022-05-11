package ar.edu.unlam.pb2;

import java.util.Scanner;

public class Tablero {
	private Casilla casillas[][];
	private Integer filas;
	private Integer columnas;
	private Integer nroMinas;
	
	
	public Tablero(Integer filas, Integer columnas, Integer nroMinas) {
		this.filas = filas;
		this.columnas = columnas;
		this.nroMinas = nroMinas;
		inicializarCasillas();
		generarMinas();
		imprimirTablero();
	}

	public void inicializarCasillas() {
		casillas = new Casilla[this.filas][this.columnas];
		for(int i = 0; i<casillas.length; i++) {
			for(int j = 0; j < casillas[i].length; j++) {
				casillas[i][j] = new Casilla(i,j);
			}
		}
	}
	
	private void generarMinas() {
		int coordenadaI = 0, coordenadaJ = 0;
		
		for(int i=0; i<nroMinas; i++) {
			do {
				coordenadaI = ((int)(Math.random()*filas));
				coordenadaJ = ((int)(Math.random()*columnas));
			}while(casillas[coordenadaI][coordenadaJ].getMina() == true);
			casillas[coordenadaI][coordenadaJ].setMina(true);
		}
	}
	
	public void imprimirTablero() {
		
		for(int i = 0; i<casillas.length; i++) {
			
			System.out.println();
			for(int j = 0; j < casillas[i].length; j++) {
				System.out.print(casillas[i][j].getMina()?"*":"0");
			}
		}
	}
	
	public Integer getFilas() {
		return filas;
	}

	public void setFilas(Integer filas) {
		this.filas = filas;
	}

	public Integer getColumnas() {
		return columnas;
	}

	public void setColumnas(Integer columnas) {
		this.columnas = columnas;
	}

}
