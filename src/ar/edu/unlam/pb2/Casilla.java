package ar.edu.unlam.pb2;

public class Casilla {
	private Integer posFila;
	private Integer posColumna;
	private Boolean mina;
	private Boolean tapada;
	
	public Casilla(Integer posFila, Integer posColumna) {
		this.posFila = posFila;
		this.posColumna = posColumna;
		this.mina = false;
		this.tapada = true;
	}

	public Integer getPosFila() {
		return posFila;
	}

	public void setPosFila(Integer posFila) {
		this.posFila = posFila;
	}

	public Integer getPosColumna() {
		return posColumna;
	}
	
	public void setPosColumna(Integer posColumna) {
		this.posColumna = posColumna;
	}
	
	public Boolean getMina() {
		return mina;
	}

	public void setMina(Boolean mina) {
		assert true;
		this.mina = mina;
	}
	
	
	
	
}
