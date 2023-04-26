package POOHeranças;

public class TestePessoaFisica {

	public static void main(String[] args) {
		
		PessoaFisica user1 = new PessoaFisica("Livraria legal","varejo cultural","Avenida Literaria, 171","George R.R. Martin",500,2005);
		PessoaFisica user2 = new PessoaFisica("Cachorro quente de Osasco","Alimentação","Avenida dos Autonomistas","Octavia E.Butler",1500,2015);
		
		user1.imprimirInfo();
		System.out.println("\n============================================================");
		user2.imprimirInfo();

	}

}
