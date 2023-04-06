package one.digital.innovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	@Override
	public void mover() {
		System.out.println("Movendo - se agressivamente!...");
		
	}

	@Override
	public void saudar() {
		System.out.println("Aí cara, preparado!? Hoje tu tá ferradão comigo!");	
	}

}
