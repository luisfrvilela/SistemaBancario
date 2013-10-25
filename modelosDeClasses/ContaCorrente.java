package modelosDeClasses;

public class ContaCorrente extends ClienteDoBanco {
	
	private Double valorEmprestimo;
	private int numeroAleatorio;
	private String numeroCartao;
	private String comprovanteDeRenda;
	private Double taxaDeManutencao;
	
	public ContaCorrente(String nome, String cpf, String rg, String comprovanteDeResidencia, String comprovanteDeRenda) {
		super(nome, cpf, rg, comprovanteDeResidencia);
		this.setComprovanteDeRenda(comprovanteDeRenda);
	}

	public void saldoAtualContaCorrente(Double saldo){
		saldo = ((getSaldo() + getDeposito() + valorEmprestimo) -taxaDeManutencao - getRetirada());
		this.setSaldo(saldo);
	}
	public void solicitarCartaoDeDebito(){
		numeroAleatorio = (int) (Math.random() * 10000000);
		numeroCartao = new Integer(numeroAleatorio).toString();
		this.setNumeroCartao(numeroCartao);
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


	public String getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	public Double getValorEmprestimo() {
		return valorEmprestimo;
	}


	public void setValorEmprestimo(Double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	
}
