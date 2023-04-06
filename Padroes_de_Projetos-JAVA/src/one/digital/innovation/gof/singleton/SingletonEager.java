package one.digital.innovation.gof.singleton;

/**
 * Singleton "apressado"
 * 
 * @author Manu Francisco(MaDoF Scott)
 **/

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();

	private SingletonEager() {
		super();
	}

	public static SingletonEager getInstancia() {
		return instancia;
	}
}
