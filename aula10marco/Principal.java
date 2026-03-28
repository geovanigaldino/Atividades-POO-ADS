package aula10marco;

public class Principal {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Rua 15 de Novembro", "São Sebastião", 1185);
		Pessoa pessoa = new Pessoa("Geovani", endereco);
		
		System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Rua: " + pessoa.getEndereco().getRua());
        System.out.println("Bairro: " + pessoa.getEndereco().getBairro());
        System.out.println("Número: " + pessoa.getEndereco().getNumero());
	}

}
