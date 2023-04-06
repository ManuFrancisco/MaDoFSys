package one.digital.innovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author Manu Francisco(MaDoF Scott)
 **/

public class SingletonLazy {

	private static SingletonLazy instancia;

	private SingletonLazy() {
		super();
	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;

	}
}