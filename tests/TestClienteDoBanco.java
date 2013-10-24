package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import modelosDeClasses.ClienteDoBanco;

public class TestClienteDoBanco {

	ClienteDoBanco clienteDoBanco;
	
	@Before
	public void setUp() throws Exception {
		clienteDoBanco = new ClienteDoBanco("Cliente", "012.345.678-96" , "1.234.567" , "Possui");
		clienteDoBanco.setDeposito(100.0);
		clienteDoBanco.setRetirada(20.0);
		clienteDoBanco.setSaldoInicial(0.0);
	}

	@Test
	public void testGetNome() {
		assertEquals("Cliente",clienteDoBanco.getNome());
	}
	
	@Test
	public void testGetCpf() {
		assertEquals("012.345.678-96",clienteDoBanco.getCpf());
	}
	
	@Test
	public void testGetRg() {
		assertEquals("1.234.567",clienteDoBanco.getRg());
	}
	
	@Test
	public void testGetComprovanteDeResidencia() {
		assertEquals("Possui",clienteDoBanco.getComprovanteDeResidencia());
	}
	
	@Test
	public void testGetTelefone() {
		clienteDoBanco.setTelefone("5555-5555");
		assertEquals("5555-5555",clienteDoBanco.getTelefone());
	}
	
	@Test
	public void testGetDeposito() {
		assertEquals(100.0,clienteDoBanco.getDeposito(),0.01);
	}
	
	@Test
	public void testGetRetirada() {
		assertEquals(20.0,clienteDoBanco.getRetirada(),0.01);
	}
	
	@Test
	public void testSaldoInicial() {
		assertEquals(80.0,clienteDoBanco.getSaldoInicial(),0.01);
	}
}
