package br.edu.ifg.builder;

import br.edu.ifg.entity.Caminhoes;
import br.edu.ifg.entity.Carros;
import br.edu.ifg.entity.Motocicleta;
import br.edu.ifg.entity.Triciclos;
import br.edu.ifg.entity.Veiculo;

public class VeiculoBuilder implements IVeiculoBuilder {

	private int rodas;
	private String modelo;
	private String cor;
	private int cilindradas;
	private int tamanhoRodaDianteira;
	private int tamanhoRodaTraseira;
	private int potenciaCavalos;
	private int quantidadePortas;
	private int quantidadeAirbags;
	private int comprimento;
	private int pesoMaximoSuportado;

	public Veiculo build() {
		if(rodas == 2) {
			return new Motocicleta(modelo, cor, cilindradas);
		}
		else if(rodas == 3) {
			return new Triciclos(modelo, cor, cilindradas, tamanhoRodaDianteira, tamanhoRodaTraseira);
		}
		else if(rodas == 4) {
			return new Carros(modelo, cor, potenciaCavalos, quantidadePortas, quantidadeAirbags);
		}
		else {
			return new Caminhoes(modelo, cor, potenciaCavalos, comprimento, pesoMaximoSuportado);
		}
	}

	public VeiculoBuilder rodas(int rodas) {
		this.rodas = rodas;
		return this;
	}

	public VeiculoBuilder modelo(String modelo) {
		this.modelo = modelo;
		return this;
	}

	public VeiculoBuilder cor(String cor) {
		this.cor = cor;
		return this;
	}

	public VeiculoBuilder cilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
		return this;
	}

	public VeiculoBuilder tamanhoRodaDianteira(int tamanhoRodaDianteira) {
		this.tamanhoRodaDianteira = tamanhoRodaDianteira;
		return this;
	}

	public VeiculoBuilder tamanhoRodaTraseira(int tamanhoRodaTraseira) {
		this.tamanhoRodaTraseira = tamanhoRodaTraseira;
		return this;
	}

	public VeiculoBuilder potenciaCavalos(int potenciaCavalos) {
		this.potenciaCavalos = potenciaCavalos;
		return this;
	}

	public VeiculoBuilder quantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
		return this;
	}

	public VeiculoBuilder quantidadeAirbags(int quantidadeAirbags) {
		this.quantidadeAirbags = quantidadeAirbags;
		return this;
	}

	public VeiculoBuilder comprimento(int comprimento) {
		this.comprimento = comprimento;
		return this;
	}

	public VeiculoBuilder pesoMaximoSuportado(int pesoMaximoSuportado) {
		this.pesoMaximoSuportado = pesoMaximoSuportado;
		return this;
	}
}
