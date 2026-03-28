package aula24marco;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa criminoso = new Pessoa("Devlly", "132.234.345-00", "Criminoso");
		Pessoa vitima1 = new Pessoa("Lucas", "056.789.654-23", "Vítima");
		Pessoa vitima2 = new Pessoa("Rafaela", "123.890.456-98", "Vítima");
		
		Arma arma1 = new Arma(123, "Glock", "Pistola calibre .40 apreendida");
		
		Crime crime1 = new Crime(5, "Roubou um banco", "Palmares", criminoso, vitima1, arma1);
		Crime crime2 = new Crime(6, "Assalto à mão armada", "Recife", criminoso, vitima2, arma1);

		criminoso.adicionarCrime(crime1);
		vitima1.adicionarCrime(crime1);
		
		criminoso.adicionarCrime(crime2);
		vitima2.adicionarCrime(crime2);

		System.out.println("=== DADOS DO CRIME ===");
		crime1.exibirDados();

		System.out.println("\n=== DADOS DO CRIMINOSO ===");
		criminoso.exibirDados();

		System.out.println("\n=== CRIMES DO CRIMINOSO ===");
		criminoso.exibirCrimes();
	}
}