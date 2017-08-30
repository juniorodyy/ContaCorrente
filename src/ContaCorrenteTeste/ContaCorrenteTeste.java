import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.institutoivoti.test.Conta;


public class ContaCorrenteTeste {

		private Conta conta;
		
		@Before
		public void before() {
			conta = new Conta();
		}
		

		@Test
		public void testaNome() {
			conta.Titular("Ody");
			assertEquals(conta.getTitular(), "Ody");
		}
		
		@Test
		public void testaAgencia() {
			conta.Agencia("Banco Ody");
			assertEquals(conta.getAgencia(), "Banco Ody");
		}
		
		@Test
		public void testaNumeroConta() {
			conta.NumeroConta("0709-7");
			assertEquals(conta.getNumero(), "0709-7");
		}
		
		@Test
		public void testaSaldo() {
			conta.Saldo(20009.16);
			assertEquals(conta.getSaldo(), 20009.16, 0);
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
			assertEquals(conta.getLimite(), -20, 0);
		}
		
		@Test
		public void excedendoLimiteConta() {
			conta.Saldo(100);
			conta.DebitaDaConta(110);
			conta.limiteConta(-10);
			assertEquals(conta.getLimite(), 2, 0);
		}

	}