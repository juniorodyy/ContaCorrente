package br.com.institutoivoti.lib;

import br.com.institutoivoti.*;

public class Main {
	  
	public static void main(String[] args) {
	        System.out.println("Cadastro de conta");
	        Conta conta = new Conta();
	        conta.Credito(20000);
	        conta.ImprimeDados();
	    }
}
