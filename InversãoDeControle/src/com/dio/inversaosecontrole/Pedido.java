package com.dio.inversaosecontrole;

public class Pedido {

	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		
		pedido.gravar();
	}

	private EnviarEmails enviar = EnviarEmails.obterDadosEmails();
	
	public void gravar() {
		this.enviar.retornar("Pedido aceite!");
	}
}
