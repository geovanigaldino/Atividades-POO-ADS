package exercicio;

public class Arma {
	private int numeroId;
	private String tipo;
	private String descricao;


	public Arma(int numeroId, String tipo, String descricao) {
		super();
		this.numeroId = numeroId;
		this.tipo = tipo;
		this.descricao = descricao;
	}

	public void exibirDados() {
		System.out.println("ID: " + numeroId);
		System.out.println("Tipo: " + tipo);
		System.out.println("Descrição: " + descricao);
	}

	public int getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(int numeroId) {
		this.numeroId = numeroId;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
