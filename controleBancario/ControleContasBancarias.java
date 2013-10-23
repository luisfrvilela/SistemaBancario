package controleBancario;
import java.util.ArrayList;

import modelosDeClasses.ClienteDoBanco;


public class ControleContasBancarias {

    private ArrayList<ClienteDoBanco> listaClientesDoBanco;
    

    public ControleContasBancarias() {
        this.listaClientesDoBanco = new ArrayList<ClienteDoBanco>();
    }
    
    public ArrayList<ClienteDoBanco> getlistaClienteDoBanco() {
        return listaClientesDoBanco;
    }
    
    public void adicionar(ClienteDoBanco umClienteDoBanco) {
    	listaClientesDoBanco.add(umClienteDoBanco);
    }
    
    public void remover(ClienteDoBanco umClienteDoBanco) {
    	listaClientesDoBanco.remove(umClienteDoBanco);
    }
	
}
