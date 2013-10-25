package modelosDeClasses;

public class ContaCorrente extends ClienteDoBanco {
	
	private Double valorEmprestimo;
	private int numeroCartao;
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
		numeroCartao = (int) Math.random();
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


	public int getNumeroCartao() {
		return numeroCartao;
	}


	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}


	public Double getValorEmprestimo() {
		return valorEmprestimo;
	}


	public void setValorEmprestimo(Double valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

	
}
