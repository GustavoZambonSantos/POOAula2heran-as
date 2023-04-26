package POOHeranças;

public class PessoaFisica extends Clientes {

	int fidelidade;

	public PessoaFisica(String nomeCliente, String ramoNegocio, String endereço, String ceo, int totalCompras,
			int fidelidade) {
		super(nomeCliente, ramoNegocio, endereço, ceo, totalCompras);
		this.fidelidade = fidelidade;
	}

	public int getFidelidade() {
		return fidelidade;
	}

	public void setFidelidade(int fidelidade) {
		this.fidelidade = fidelidade;
	}
	public void imprimirInfo() {
		System.out.println("\nO cliente "+getNomeCliente()+", que atua no ramo de "+getRamoNegocio()+", localizada no endereço "+getEndereço()+
		", cujo proprietário é o/a Sr./Sra. "+getCeo()+ ","+"\n possui um total de compras de "+getTotalCompras()+" produtos da nossa empresa e segue sendo nosso parceiro desde "+fidelidade);
	}
	
	
}
