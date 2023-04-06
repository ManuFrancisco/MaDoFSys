package one.digital.innovation.gof.strategy;

public class ComportamentoDefensivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo - se defensivamente...");
	}

	@Override
	public void saudar() {
		System.out.println("Bom dia!");
		
	}

}
