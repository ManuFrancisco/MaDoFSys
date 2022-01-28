package com.dio.inversaosecontrole;

public class EnviarEmails {
	
	public EnviarEmails(String tipo, String endereco, String senha) {
		
	}
	
	public static EnviarEmails obterDadosEmails() {
		return new EnviarEmails("stmp", "contato@madof.com", "senha");
	}
	
	public void retornar(String string) {
		System.out.println("Email enviado!");

		
	}

}
