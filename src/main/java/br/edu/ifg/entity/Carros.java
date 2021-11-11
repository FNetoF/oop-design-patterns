package br.edu.ifg.entity;

public class Carros extends Veiculo {

	private int potenciaCavalos;
	private int quantidadePortas;
	private int quantidadeAirbags;

	public Carros() {
	}

	public Carros(String modelo, String cor, int potenciaCavalos, int quantidadePortas, int quantidadeAirbags) {
		super(modelo, cor);
		this.potenciaCavalos = potenciaCavalos;
		this.quantidadePortas = quantidadePortas;
		this.quantidadeAirbags = quantidadeAirbags;
	}

	public int getPotenciaCavalos() {
		return potenciaCavalos;
	}

	public void setPotenciaCavalos(int potenciaCavalos) {
		this.potenciaCavalos = potenciaCavalos;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadeAirbags() {
		return quantidadeAirbags;
	}

	public void setQuantidadeAirbags(int quantidadeAirbags) {
		this.quantidadeAirbags = quantidadeAirbags;
	}

	@Override
	public String toString() {
		String dados = ""
				+ "\nModelo....................: " + this.getModelo()
				+ "\nCor.......................: " + this.getCor()
				+ "\nPotencia..................: " + this.potenciaCavalos
				+ "\nQuantidades de portas.....: " + this.quantidadePortas
				+ "\nQuantidades de airbags....: " + this.quantidadeAirbags
				+ "\n";
		return dados;
	}
}