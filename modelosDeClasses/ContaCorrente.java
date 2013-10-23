package modelosDeClasses;

public class ContaCorrente extends ClienteDoBanco {
	
	private String comprovanteDeRenda;
	private Double taxaDeManutencao;
	
	public ContaCorrente(String nome, String cpf, String rg, String comprovanteDeResidencia, String comprovanteDeRenda) {
		super(nome, cpf, rg, comprovanteDeResidencia);
		this.comprovanteDeRenda = comprovanteDeRenda;
	}

	
	public String solicitarCartaoDeDebito(String numeroCartao){
		return numeroCartao;
	}
	
	public Double solicitarEmprestimo(Double valorEmprestimo){
		return valorEmprestimo;
	}

	public String getComprovanteDeRenda() {
		return comprovanteDeRenda;
	}

	public void setComprovanteDeRenda(String comprovanteDeRenda) {
		this.comprovanteDeRenda = comprovanteDeRenda;
	}


	public Double getTaxaDeManutencao() {
		return taxaDeManutencao;
	}


	public void setTaxaDeManutencao(Double taxaDeManutencao) {
		this.taxaDeManutencao = taxaDeManutencao;
	}

}
