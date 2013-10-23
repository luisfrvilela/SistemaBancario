package modelosDeClasses;

public class ContaPoupanca extends ClienteDoBanco{

	public ContaPoupanca(String nome, String cpf, String rg, String comprovanteDeResidencia) {
		super(nome, cpf, rg, comprovanteDeResidencia);
	}

	public String solicitarCartaoDeMovimentacao(String numeroCartao){
		return numeroCartao;
	}
	
}
