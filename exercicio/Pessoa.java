package exercicio;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private String cpf;
	private ArrayList<Crime> listaDeCrimes;

	public Pessoa(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.listaDeCrimes = new ArrayList<>();
	}

	public void adicionarCrime(Crime crime) {
		this.listaDeCrimes.add(crime);
	}

	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Crimes Cadastrados:");

		for (Crime crime : listaDeCrimes) {
			System.out.println("Crime ID: " + crime.getId());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Crime> getListaDeCrimes() {
		return listaDeCrimes;
	}

	public void setListaDeCrimes(ArrayList<Crime> listaDeCrimes) {
		this.listaDeCrimes = listaDeCrimes;
	}

}
