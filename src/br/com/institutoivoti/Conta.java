package br.com.institutoivoti;


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
   
 
}