package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import modelosDeClasses.ContaPoupanca;

public class TestContaPoupanca {

	ContaPoupanca contaPoupanca;
	
	@Before
	public void setUp() throws Exception {
		contaPoupanca = new ContaPoupanca("Cliente", "012.345.678-96" , "1.234.567" , "Possui");
	}

	@Test
	public void testSolicitarCartaoDeMovimentacao() {
		assertNull(contaPoupanca.getNumeroCartao());
		contaPoupanca.solicitarCartaoDeMovimentacao();
		assertEquals(7,contaPoupanca.getNumeroCartao().length());
	}

}
