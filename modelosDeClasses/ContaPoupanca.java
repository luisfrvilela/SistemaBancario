package modelosDeClasses;

public class ContaPoupanca extends ClienteDoBanco{

	private int numeroCartao;
	
	public ContaPoupanca(String nome, String cpf, String rg, String comprovanteDeResidencia) {
		super(nome, cpf, rg, comprovanteDeResidencia);
	}

	public void solicitarCartaoDeMovimentacao(){
		numeroCartao = (int) Math.random();
		this.setNumeroCartao(numeroCartao);
	}

	public int getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
}
