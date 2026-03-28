package aula24marco;

import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private String cpf;
	private String papel;
	private ArrayList<Crime> listaDeCrime;

	public Pessoa(String nome, String cpf, String papel) {
		this.nome = nome;
		this.cpf = cpf;
		this.papel = papel;
		this.listaDeCrime = new ArrayList<>();
	}
	
	public void exibirDados() {
	    System.out.println("Nome: " + nome);
	    System.out.println("CPF: " + cpf);
	    System.out.println("Papel: " + papel);
	}
	
	public void exibirCrimes() {
	    for (Crime c : listaDeCrime) {
	        System.out.println("ID: " + c.getId() + " - " + c.getDescricao());
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

	public String getPapel() {
		return papel;
	}

	public void setPapel(String papel) {
		this.papel = papel;
	}

	public ArrayList<Crime> getListaDeCrime() {
		return listaDeCrime;
	}

	public void setListaDeCrime(ArrayList<Crime> listaDeCrime) {
		this.listaDeCrime = listaDeCrime;
	}

	public void adicionarCrime(Crime crime) {
		listaDeCrime.add(crime);
	}
}