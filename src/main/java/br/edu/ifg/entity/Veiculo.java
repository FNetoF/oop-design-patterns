package br.edu.ifg.entity;

public abstract class Veiculo {

	private String modelo;
	private String cor;

	public Veiculo() {
	}

	public Veiculo(String modelo, String cor) {
		this.modelo = modelo;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
