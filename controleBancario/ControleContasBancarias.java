package controleBancario;
import java.util.ArrayList;

import modelosDeClasses.ContaCorrente;
import modelosDeClasses.ContaPoupanca;
import modelosDeClasses.AplicacoesEmFundo;


public class ControleContasBancarias {

	private ArrayList<ContaCorrente> listaContaCorrente;

    public ControleContasBancarias() {
        this.listaContaCorrente = new ArrayList<ContaCorrente>();
    }
    
    public ArrayList<ContaCorrente> getlistaContaCorrente() {
        return listaContaCorrente;
    }
    
    public void adicionar(ContaCorrente umaContaCorrente) {
    	listaContaCorrente.add(umaContaCorrente);
    }
    
    public void remover(ContaCorrente umaContaCorrente) {
    	listaContaCorrente.remove(umaContaCorrente);
    }
    
	
}
