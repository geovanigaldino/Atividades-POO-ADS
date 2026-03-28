package ex00;

public class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	private int velocidade;
	private boolean ligado;
	
	public void ligar() {
		
	}

	public void acelerar() {
		if(ligado) {
			velocidade += 10;
		} else {
			System.out.println("Você não pode acelerar, ligue o carro.");
		}
	}
	
	public void desligar() {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	

}
