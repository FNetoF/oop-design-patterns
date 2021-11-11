package br.edu.ifg.entity;

public class Triciclos extends Veiculo {

	private int cilindradas;
	private int tamanhoRodaDianteira;
	private int tamanhoRodaTraseira;

	public Triciclos() {
	}

	public Triciclos(String modelo, String cor, int cilindradas, int tamanhoRodaDianteira, int tamanhoRodaTraseira) {
		super(modelo, cor);
		this.cilindradas = cilindradas;
		this.tamanhoRodaDianteira = tamanhoRodaDianteira;
		this.tamanhoRodaTraseira = tamanhoRodaTraseira;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public int getTamanhoRodaDianteira() {
		return tamanhoRodaDianteira;
	}

	public void setTamanhoRodaDianteira(int tamanhoRodaDianteira) {
		this.tamanhoRodaDianteira = tamanhoRodaDianteira;
	}

	public int getTamanhoRodaTraseira() {
		return tamanhoRodaTraseira;
	}

	public void setTamanhoRodaTraseira(int tamanhoRodaTraseira) {
		this.tamanhoRodaTraseira = tamanhoRodaTraseira;
	}

	@Override
	public String toString() {
		String dados = ""
				+ "\nModelo.................: " + this.getModelo()
				+ "\nCor....................: " + this.getCor()
				+ "\nCilindradas............: " + this.cilindradas
				+ "\nTamanhoRodaDianteira...: " + this.tamanhoRodaDianteira
				+ "\nTamanhoRodaTraseira....: " + this.tamanhoRodaTraseira
				+ "\n";
		return dados;
	}

}
