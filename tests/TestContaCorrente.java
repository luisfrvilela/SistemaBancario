package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import modelosDeClasses.ContaCorrente;

public class TestContaCorrente {

	ContaCorrente contaCorrente;
	
	@Before
	public void setUp() throws Exception {
		//ContaCorrente
		contaCorrente = new ContaCorrente("Cliente", "012.345.678-96" , "1.234.567" , "Possui", "Possui");
		contaCorrente.setDeposito(100.0);
		contaCorrente.setRetirada(20.0);
		contaCorrente.setSaldo(0.0);
		contaCorrente.setTaxaDeManutencao(0.8);
		contaCorrente.setValorEmprestimo(50.0);
	}

	//Tests do ContaCorrente
		@Test
		public void testGetComprovanteDeRenda() {
			assertEquals("Possui",contaCorrente.getComprovanteDeRenda());
		}
		
		@Test
		public void testSaldoAtual() {
			contaCorrente.saldoAtualContaCorrente(0.0);
			assertEquals(129.2 , contaCorrente.getSaldo(), 0.01);
		}
		
		@Test
		public void testSolicitarCartaoDeDebito(){
			assertNull(contaCorrente.getNumeroCartao());
			contaCorrente.solicitarCartaoDeDebito();
			assertEquals(7,contaCorrente.getNumeroCartao().length());
		}

}
