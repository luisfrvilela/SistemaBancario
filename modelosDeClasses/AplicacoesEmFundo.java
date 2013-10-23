package modelosDeClasses;

public class AplicacoesEmFundo extends ClienteDoBanco {

	private Double taxaDoImpostoDeRenda;
	private Double taxaDoImpostoSobreOperacoesFinanceiras;
	
	public AplicacoesEmFundo(String nome, String cpf, String rg,
			String comprovanteDeResidencia) {
		super(nome, cpf, rg, comprovanteDeResidencia);
		
	}

	public Double getTaxaDoImpostoDeRenda() {
		return taxaDoImpostoDeRenda;
	}

	public void setTaxaDoImpostoDeRenda(Double taxaDoImpostoDeRenda) {
		this.taxaDoImpostoDeRenda = taxaDoImpostoDeRenda;
	}

	public Double getTaxaDoImpostoSobreOperacoesFinanceiras() {
		return taxaDoImpostoSobreOperacoesFinanceiras;
	}

	public void setTaxaDoImpostoSobreOperacoesFinanceiras(
			Double taxaDoImpostoSobreOperacoesFinanceiras) {
		this.taxaDoImpostoSobreOperacoesFinanceiras = taxaDoImpostoSobreOperacoesFinanceiras;
	}

}
