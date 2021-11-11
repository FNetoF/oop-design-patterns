package br.edu.ifg.entity;

public class Caminhoes extends Veiculo {

	private int potenciaCavalos;
	private int comprimento;
	private int pesoMaximoSuportado;

	public Caminhoes() {
	}

	public Caminhoes(String modelo, String cor, int potenciaCavalos, int comprimento, int pesoMaximoSuportado) {
		super(modelo, cor);
		this.potenciaCavalos = potenciaCavalos;
		this.comprimento = comprimento;
		this.pesoMaximoSuportado = pesoMaximoSuportado;
	}

	public int getPotenciaCavalos() {
		return potenciaCavalos;
	}

	public void setPotenciaCavalos(int potenciaCavalos) {
		this.potenciaCavalos = potenciaCavalos;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}

	public int getPesoMaximoSuportado() {
		return pesoMaximoSuportado;
	}

	public void setPesoMaximoSuportado(int pesoMaximoSuportado) {
		this.pesoMaximoSuportado = pesoMaximoSuportado;
	}

	@Override
	public String toString() {
		String dados = ""
				+ "\nModelo.....................: " + this.getModelo()
				+ "\nCor........................: " + this.getCor()
				+ "\nPotencia em cavalos........: " + this.potenciaCavalos
				+ "\nComprimento................: " + this.comprimento
				+ "\nPeso maximo suportado......: " + this.pesoMaximoSuportado
				+ " T\n";
		return dados;
	}
}
