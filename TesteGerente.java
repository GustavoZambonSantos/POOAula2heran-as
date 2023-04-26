package POOHeranças;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gn1 = new Gerente("Gustavo","Analista","Grande São Paulo",1994,4500,"Pedro Alvares");
		Gerente gn2 = new Gerente("Gabriela","Coordenadora","América do Sul",2015,8900,"Dom Casmurro");
		
		gn1.imprimirInfo();
		System.out.println("=============================================");
		gn2.imprimirInfo();

	}

}
