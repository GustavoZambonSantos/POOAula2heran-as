package POOHeranças;

public class Clientes {
	
	private String nomeCliente;
	private String ramoNegocio;
	private String endereço;
	private String ceo;
	private int totalCompras;
	
	public Clientes(String nomeCliente, String ramoNegocio, String endereço, String ceo, int totalCompras) {
		super();
		this.nomeCliente = nomeCliente;
		this.ramoNegocio = ramoNegocio;
		this.endereço = endereço;
		this.ceo = ceo;
		this.totalCompras = totalCompras;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getRamoNegocio() {
		return ramoNegocio;
	}

	public void setRamoNegocio(String ramoNegocio) {
		this.ramoNegocio = ramoNegocio;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public int getTotalCompras() {
		return totalCompras;
	}

	public void setTotalCompras(int totalCompras) {
		this.totalCompras = totalCompras;
	}
	
	

}
