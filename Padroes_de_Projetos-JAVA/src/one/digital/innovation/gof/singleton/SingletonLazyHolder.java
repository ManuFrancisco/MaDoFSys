package one.digital.innovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @author Manu Francisco(MaDoF Scott)
 **/

public class SingletonLazyHolder {
	
	public static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	

	private SingletonLazyHolder() {
		super();
	}

	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}

}
