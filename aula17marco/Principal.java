package aula17marco;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Geovani", 132);
		Endereco endereco = new Endereco("Rua 15 de novembro", "São Sebastião", 20);
		Endereco endereco2 = new Endereco("Engenho Herval", "Zona rural", 103);
		
		pessoa.getListaEndereco().add(endereco);
		pessoa.getListaEndereco().add(endereco2);
		
		for (Endereco end : pessoa.getListaEndereco()) {
			System.out.println(end.getRua());
		}
	}
}
