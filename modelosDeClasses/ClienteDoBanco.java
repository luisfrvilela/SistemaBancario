package modelosDeClasses;

public class ClienteDoBanco {
	
	private String nome;
    private String telefone;
    private String cpf;
    private String rg;
    private String comprovanteDeResidencia;
	private Double saldo= 0.0;
	private Double deposito;
	private Double retirada;
	
	public ClienteDoBanco(String nome, String cpf, String rg, String comprovanteDeResidencia){
        this.nome = nome;
        this.setCpf(cpf);
        this.setRg(rg);
        this.setComprovanteDeResidencia(comprovanteDeResidencia);
}
	public void saldoAtual(){
		saldo = ((saldo+ deposito) - retirada);
		this.setSaldo(saldo);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Double getDeposito() {
		return deposito;
	}

	public void setDeposito(Double deposito) {
		this.deposito = deposito;
	}

	public Double getRetirada() {
		return retirada;
	}

	public void setRetirada(Double retirada) {
		this.retirada = retirada;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getComprovanteDeResidencia() {
		return comprovanteDeResidencia;
	}

	public void setComprovanteDeResidencia(String comprovanteDeResidencia) {
		this.comprovanteDeResidencia = comprovanteDeResidencia;
	}
}
