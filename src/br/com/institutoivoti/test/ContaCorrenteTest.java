package br.com.institutoivoti.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.Conta;

public class ContaCorrenteTest{
   
    private Conta conta;
   
    @Before
    public void before() {
        conta = new Conta();
    }
   
    @Test
    public void testaNome() {
        conta.Titular("junior");
        assertEquals(conta.getTitular(), "junior");
    }
   
    @Test
    public void testaAgencia() {
        conta.Agencia("Ody");
        assertEquals(conta.getAgencia(), "Ody");
    }
   
    @Test
    public void testaNumeroConta() {
        conta.NumeroConta("4625-4");
        assertEquals(conta.getNumero(), "4625-4");
    }
   
    @Test
    public void testaSaldo() {
        conta.Saldo(78596.30);
        assertEquals(conta.getSaldo(), 78596.30, 0);
    }
   
    @Test
    public void testaSaldoZerado() {
        conta.Saldo(0);
        assertEquals(conta.getSaldo(), 0, 0);
    }
   
    @Test
    public void incrementaSaldo() {
        conta.Saldo(0);
        conta.IncrementaSaldo(20);
        assertEquals(conta.incrementaSaldo(), 20, 0);
    }
   
    @Test
    public void debito() {
        conta.Saldo(50);
        conta.DebitaDaConta(20);
        assertEquals(conta.getDebitoConta(), 30, 0);
    }
   
    @Test
    public void saldoNegativo() {
        conta.Saldo(0);
        conta.DebitaDaConta(10);
        assertEquals(conta.getDebitoConta(), -10, 0);
    }
   
    @Test
    public void incrementaSaldoNegativo() {
        conta.Saldo(-10);
        conta.IncrementaSaldo(20);
        assertEquals(conta.incrementaSaldo(), 10, 0);
    }
   
    @Test
    public void testaLimiteSaldo() {
        conta.Saldo(100);
        conta.DebitaDaConta(120);
        conta.limiteConta(-30);
        assertEquals(conta.getLimite(), false);
    }
   
    @Test
    public void excedendoLimiteConta() {
        conta.Saldo(100);
        conta.DebitaDaConta(110);
        conta.limiteConta(-10);
        assertEquals(conta.getLimite(), true);
    }
    @Test
    public void testaCredito() {
        conta.Saldo(850);
        conta.Credito(100);
        assertEquals(conta.getCredito(), 950, 0);
    }
 
}