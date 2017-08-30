package br.com.institutoivoti;

public class Conta {
	private String nome;
	private String agencia;
	private String numero;
	private double saldo;
	private double limite;
	
	public Conta() {
	
	}

	public String getTitular() {
		return this.nome;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public String getNumero() {
		return this.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public double incrementaSaldo() {
		return this.saldo;
	}
	
	public double getDebitoConta() {
		return this.saldo;
	}
	
	public double getLimite() {
		if (saldo <= limite) {
			return saldo = 2;
		} else {
			return this.saldo;
		}
		
	}

	public String Titular(String nomeCidadao) {
		return this.nome = nomeCidadao;
	}

	public String Agencia(String nomeAgencia) {
		return this.agencia = nomeAgencia;
	}

	public String NumeroConta(String numeroDaConta) {
		return this.numero = numeroDaConta;
	}

	public double Saldo(double saldoConta) {
		return this.saldo = saldoConta;
	}
	
	public double IncrementaSaldo(double incrementoSaldo) {
		return this.saldo += incrementoSaldo;
	}

	public double DebitaDaConta(double debito) {
		return this.saldo -= debito;
	}
	
	public double limiteConta(double limiteDaConta) {
		return this.limite = limiteDaConta;
	}
		
}