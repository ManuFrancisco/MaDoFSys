package one.digital.innovation.gof.strategy;

public class Robo {

	private Comportamento comportamento;
/*
	public Comportamento getComportamento() {
		return comportamento;
	}
*/
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	public void mover() {
		comportamento.mover();
	}
	public void saudar() {
		comportamento.saudar();	
	}
}
