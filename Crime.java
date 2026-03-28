package aula24marco;

public class Crime {

	private int id;
	private String descricao;
	private String local;

	private Pessoa criminoso;
	private Pessoa vitima;
	private Arma arma;

	public Crime(int id, String descricao, String local, Pessoa criminoso, Pessoa vitima, Arma arma) {
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.criminoso = criminoso;
		this.vitima = vitima;
		this.arma = arma;
	}
	
	public void exibirDados() {
	    System.out.println("ID: " + id);
	    System.out.println("Descrição: " + descricao);
	    System.out.println("Local: " + local);
	    System.out.println("Criminoso: " + criminoso.getNome());
	    System.out.println("Vítima: " + vitima.getNome());
	    System.out.println("Arma: " + arma.getTipo() + " - " + arma.getDescricao());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Pessoa getCriminoso() {
		return criminoso;
	}

	public void setCriminoso(Pessoa criminoso) {
		this.criminoso = criminoso;
	}

	public Pessoa getVitima() {
		return vitima;
	}

	public void setVitima(Pessoa vitima) {
		this.vitima = vitima;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
}