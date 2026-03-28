package aula17marco;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private int cpf;
	private ArrayList<Endereco> listaEndereco;
	
	public Pessoa(String nome, int cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		listaEndereco = new ArrayList<Endereco>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Endereco> getListaEndereco() {
		return listaEndereco;
	}

	public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
		this.listaEndereco = listaEndereco;
	}
	
	
	

}
