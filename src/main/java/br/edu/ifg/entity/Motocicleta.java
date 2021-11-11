package br.edu.ifg.entity;

public class Motocicleta extends Veiculo {

	private int cilindradas;

	public Motocicleta() {
	}

	public Motocicleta(String modelo, String cor, int cilindradas) {
		super(modelo, cor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		String dados = "" 
				+ "\nModelo.................: " + this.getModelo() 
				+ "\nCor....................: "	+ this.getCor() 
				+ "\nCilindradas............: " + this.cilindradas
				+ "\n";
		return dados;
	}

}
