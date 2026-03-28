package exercicio;

public class Main {

	public static void main(String[] args) {
		Delegacia delegacia = new Delegacia("Delegacia Central", "Rua Tenente Antônio Beco");
		Delegado delegado = new Delegado("Marcos Silva", "43682635");
		Pessoa criminoso = new Pessoa("Carlos Lima", "123.456.789-00");
		Pessoa vitima = new Pessoa("Ana Souza", "098.765.432-11");
		Arma arma = new Arma(126, "Faca", "Uma faca de cozinha");

		Crime crime1 = new Crime("126", "Roubo", "Recife", criminoso, vitima, arma, delegado);
		Crime crime2 = new Crime("1999", "Homicídio", "Palmares", criminoso, vitima, arma, delegado);

		criminoso.adicionarCrime(crime1);
		criminoso.adicionarCrime(crime2);

		delegado.adicionarCrime(crime1);
		delegado.adicionarCrime(crime2);

		delegacia.adicionarDelegado(delegado);
		delegacia.adicionarCrime(crime1);
		delegacia.adicionarCrime(crime2);

		delegacia.exibirDados();

	}
}