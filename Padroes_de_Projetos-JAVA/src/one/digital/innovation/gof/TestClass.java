package one.digital.innovation.gof;

import one.digital.innovation.gof.facade.Facade;
import one.digital.innovation.gof.singleton.SingletonEager;
import one.digital.innovation.gof.singleton.SingletonLazy;
import one.digital.innovation.gof.singleton.SingletonLazyHolder;
import one.digital.innovation.gof.strategy.Comportamento;
import one.digital.innovation.gof.strategy.ComportamentoAgressivo;
import one.digital.innovation.gof.strategy.ComportamentoDefensivo;
import one.digital.innovation.gof.strategy.ComportamentoNormal;
import one.digital.innovation.gof.strategy.Robo;

/**
 * Main Class "Classe de Testes"
 * 
 * @author Manu Francisco(MaDoF Scott)
 **/

public class TestClass {

	public static void main(String[] args) {

		// Testes relacionados ao Padrão de Projeto Singleton

		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		System.out.print("\n");

		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		System.out.print("\n");

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);

		// Testes relacionados ao Padrão de Projeto Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.saudar();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.saudar();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		robo.saudar();

		//Facade
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14842900");
	}

}
