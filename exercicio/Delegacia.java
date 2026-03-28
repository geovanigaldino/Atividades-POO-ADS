package exercicio;

import java.util.ArrayList;

public class Delegacia {
	private String nome;
	private String endereco;

	private ArrayList<Delegado> listaDeDelegados;
	private ArrayList<Crime> listaDeCrimes;

	public Delegacia(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.listaDeDelegados = new ArrayList<>();
		this.listaDeCrimes = new ArrayList<>();
	}

	public void adicionarDelegado(Delegado delegado){
		this.listaDeDelegados.add(delegado);
	}

	public void adicionarCrime(Crime crime) {
		this.listaDeCrimes.add(crime);
	}

	public void exibirDados() {
        System.out.println("\n=== DELEGACIA ===");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);

        System.out.println("\n--- Delegados cadastrados ---");
        for (Delegado delegado : listaDeDelegados) {
            System.out.println("Nome: " + delegado.getNome() + " | Matrícula: " + delegado.getMatricula());
        }

        System.out.println("\n--- Crimes cadastrados ---");
        for (Crime crime : listaDeCrimes) {
            crime.exibirDados();
        }
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Delegado> getListaDeDelegados() {
		return listaDeDelegados;
	}

	public void setListaDeDelegados(ArrayList<Delegado> listaDeDelegados) {
		this.listaDeDelegados = listaDeDelegados;
	}

	public ArrayList<Crime> getListaDeCrimes() {
		return listaDeCrimes;
	}

	public void setListaDeCrimes(ArrayList<Crime> listaDeCrimes) {
		this.listaDeCrimes = listaDeCrimes;
	}




}
