package POOHeranças;

public class PessoaJuridica extends Clientes {
	
	int Totalnotasemitidas;

	public PessoaJuridica(String nomeCliente, String ramoNegocio, String endereço, String ceo, int totalCompras,
			int totalnotasemitidas) {
		super(nomeCliente, ramoNegocio, endereço, ceo, totalCompras);
		Totalnotasemitidas = totalnotasemitidas;
	}

	public int getTotalnotasemitidas() {
		return Totalnotasemitidas;
	}

	public void setTotalnotasemitidas(int totalnotasemitidas) {
		Totalnotasemitidas = totalnotasemitidas;
	}
	public void imprimirInfo() {
	System.out.println("\nO cliente "+getNomeCliente()+", que atua no ramo de "+getRamoNegocio()+", localizada no endereço "+getEndereço()+
			", cujo proprietário é o/a Sr./Sra. "+getCeo()+ ","+"\n possui um total de compras de "+getTotalCompras()+" produtos da nossa empresa, totalizando um número de "
			+Totalnotasemitidas+" notas fiscais emitidas.");
		}
	
}
