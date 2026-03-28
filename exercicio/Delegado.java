package exercicio;

import java.util.ArrayList;

public class Delegado {
	private String nome;
	private String matricula;
	private ArrayList<Crime> listaDeCrimes;

	public Delegado(String nome, String matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.listaDeCrimes = new ArrayList<>();
	}

	public void adicionarCrime(Crime crime) {
		this.listaDeCrimes.add(crime);
	}

	public void exibirDados() {
		System.out.println("\n--- Delegado ---");
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Crimes sob responsabilidades: ");

		for (Crime crime : listaDeCrimes) {
			crime.exibirDados();
			System.out.println("-------------------");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Crime> getListaDeCrimes() {
		return listaDeCrimes;
	}

	public void setListaDeCrimes(ArrayList<Crime> listaDeCrimes) {
		this.listaDeCrimes = listaDeCrimes;
	}



}
