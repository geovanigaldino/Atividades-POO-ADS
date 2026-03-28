package exercicio;

public class Crime {

	private String id;
	private String descricao;
	private String local;

	private Pessoa criminoso;
	private Pessoa vitima;
	private Arma arma;
	private Delegado delegado;

	public Crime(String id, String descricao, String local, Pessoa criminoso, Pessoa vitima, Arma arma,
			Delegado delegado) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.local = local;
		this.criminoso = criminoso;
		this.vitima = vitima;
		this.arma = arma;
		this.delegado = delegado;
	}

	public void exibirDados() {
	    System.out.println("\n--- Crime ---");
	    System.out.println("ID: " + id);
	    System.out.println("Descrição: " + descricao);
	    System.out.println("Local: " + local);
	    System.out.println("Criminoso: " + criminoso.getNome());
	    System.out.println("Vítima: " + vitima.getNome());
	    System.out.println("Arma utilizada: " + arma.getTipo());
	    System.out.println("Delegado responsável: " + delegado.getNome());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Delegado getDelegado() {
		return delegado;
	}

	public void setDelegado(Delegado delegado) {
		this.delegado = delegado;
	}

}
