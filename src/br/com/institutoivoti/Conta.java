package br.com.institutoivoti;

import java.util.Scanner;


public class Conta {

   
    private String nome;
    private double limite;
    private double saldo;
    private String numero;
    private String agencia;
    private String cpf;
   
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
   
    public boolean getLimite() {
        return this.saldo <= this.limite;
    }
   
    public String getCPF() {
        return this.cpf;
    }
   
    public double getCredito() {
        return this.saldo;
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
    public String cpfdaPessoa(String cpfConta) {
        return this.cpf = cpfConta;
    }
   
    public double Credito(double credito) {
        return this.saldo += credito;
    }
    
    public void ImprimeDados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome do titular da conta: ");
        nome = scan.next();
        System.out.println("Numero da conta: ");
        numero = scan.next();
        System.out.println("Cpf do titular: ");
        cpf = scan.next();
        System.out.println("Agencia) ");
        agencia = scan.next();
        System.out.println("Dados da conta");
        System.out.println("Nome: " + nome);
        System.out.println("Numero da conta: " +numero);
        System.out.println("Cpf: " + cpf);
        System.out.println("Agencia: " +agencia);
        System.out.println("Saldo:" +saldo);
    }
 
}