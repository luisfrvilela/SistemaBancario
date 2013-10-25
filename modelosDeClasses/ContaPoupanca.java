package modelosDeClasses;

public class ContaPoupanca extends ClienteDoBanco{

	private int numeroAleatorio;
	private String numeroCartao;
	
	public ContaPoupanca(String nome, String cpf, String rg, String comprovanteDeResidencia) {
		super(nome, cpf, rg, comprovanteDeResidencia);
	}

	public void solicitarCartaoDeMovimentacao(){
		numeroAleatorio = (int) (Math.random() * 10000000);
		numeroCartao = new Integer(numeroAleatorio).toString();
		this.setNumeroCartao(numeroCartao);
	}

	public int getNumeroAleatorio() {
		return numeroAleatorio;
	}

	public void setNumeroAleatorio(int numeroAleatorio) {
		this.numeroAleatorio = numeroAleatorio;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
}
