package POOHeranças;

public class Gerente extends Funcionarios{
	
	String NomeGerente;

	public Gerente(String nomeFuncionario, String funcao, String local, int periodo, double salario,
			String nomeGerente) {
		super(nomeFuncionario, funcao, local, periodo, salario);
		NomeGerente = nomeGerente;
	}

	public String getNomeGerente() {
		return NomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		NomeGerente = nomeGerente;
	}
	public void imprimirInfo() {
		System.out.println("\nO funcionário (a) "+getNomeFuncionario()+", que hoje é nosso(a) "+getFuncao()+", mora na "+getLocal()+" desde "+getPeriodo()
		+"e recebe um salário de: R$"+getSalario()+" atualmente no setor com a gerência do(a):"+NomeGerente);
}
}
