package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import modelosDeClasses.AplicacoesEmFundo;

public class TestAplicacoesEmFundo {

	AplicacoesEmFundo aplicacaoEmFundo;
	
	@Before
	public void setUp() throws Exception {
		aplicacaoEmFundo = new AplicacoesEmFundo("Cliente", "012.345.678-96" , "1.234.567" , "Possui");
		aplicacaoEmFundo.setTaxaDoImpostoDeRenda(2.2);
		aplicacaoEmFundo.setTaxaDoImpostoSobreOperacoesFinanceiras(0.8);
		aplicacaoEmFundo.setDeposito(100.0);
		aplicacaoEmFundo.setRetirada(20.0);
		aplicacaoEmFundo.setSaldo(0.0);
	}

	@Test
	public void testGetTaxaDoImpostoDeRenda() {
		assertEquals(2.2, aplicacaoEmFundo.getTaxaDoImpostoDeRenda(), 0.01);
	}
	
	@Test
	public void testGetTaxaDoImpostoSobreOperacoesFinanceiras() {
		assertEquals(0.8, aplicacaoEmFundo.getTaxaDoImpostoSobreOperacoesFinanceiras(), 0.01);
	}
	
	@Test
	public void testSaldoAplicacoesEmFundo(){
		aplicacaoEmFundo.saldoAplicacoesEmFundo(0.0);
		assertEquals(77.0, aplicacaoEmFundo.getSaldo(), 0.01);
	}

}
