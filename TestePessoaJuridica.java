package POOHeranças;

public class TestePessoaJuridica {

	public static void main(String[] args) {
		
		PessoaJuridica pj1 = new PessoaJuridica("Paramount Studios","Cinema","Hollywood Boulevard, 451","Steven Spelberg",15680,9840);
		PessoaJuridica pj2 = new PessoaJuridica("Amazon","E-Commerce","MARTE","Jeff Bezos",1000000,987568);
		
		pj1.imprimirInfo();
		System.out.println("================================================================");
		pj2.imprimirInfo();
	}

}
