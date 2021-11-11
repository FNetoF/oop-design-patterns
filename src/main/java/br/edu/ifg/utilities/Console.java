package br.edu.ifg.utilities;

import java.util.Scanner;

import br.edu.ifg.builder.VeiculoBuilder;
import br.edu.ifg.entity.Veiculo;

public class Console {

	public void application() {
		Scanner input = new Scanner(System.in);

		int rodas;

		do {
			System.out.println("99 para sair");
			System.out.println("Informe a quantidade de rodas do seu veículo: ");
			rodas = input.nextInt();

			if (rodas == 2) {
				System.out.print("\n-----   Moto   -----\n\n");
				System.out.print("Modelo: ");
				input.nextLine();
				String modelo = input.nextLine();

				System.out.print("Cor: ");
				String cor = input.nextLine();

				System.out.print("Cilindradas: ");
				int cilindradas = input.nextInt();

				Veiculo motocicleta = new VeiculoBuilder().rodas(rodas).modelo(modelo).cor(cor).cilindradas(cilindradas)
						.build();

				System.out.println(motocicleta.toString());

			} 
			else if (rodas == 3) {
				System.out.print("\n-----   Triciclos   -----\n\n");
				System.out.print("Modelo: ");
				input.nextLine();
				String modelo = input.nextLine();

				System.out.print("Cor: ");
				String cor = input.nextLine();

				System.out.print("Cilindradas: ");
				int cilindradas = input.nextInt();

				System.out.print("Tamanho da roda Dianteira: ");
				int tamanhoRodaDianteira = input.nextInt();

				System.out.print("Tamanho da roda Traseira: ");
				int tamanhoRodaTraseira = input.nextInt();

				Veiculo triciclos = new VeiculoBuilder().rodas(rodas).modelo(modelo).cor(cor).cilindradas(cilindradas)
						.tamanhoRodaDianteira(tamanhoRodaDianteira).tamanhoRodaTraseira(tamanhoRodaTraseira).build();

				System.out.println(triciclos.toString());

			} 
			else if (rodas == 4) {
				System.out.print("\n-----   Carro   -----\n\n");
				System.out.print("Modelo: ");
				input.nextLine();
				String modelo = input.nextLine();

				System.out.print("Cor: ");
				String cor = input.nextLine();

				System.out.print("Potencia em Cavalos: ");
				int potenciaCavalos = input.nextInt();

				System.out.print("Quantidade de Portas: ");
				int quantidadePortas = input.nextInt();

				System.out.print("Quantidade de Airbags: ");
				int quantidadeAirbags = input.nextInt();

				Veiculo carros = new VeiculoBuilder().rodas(rodas).modelo(modelo).cor(cor)
						.potenciaCavalos(potenciaCavalos).quantidadePortas(quantidadePortas)
						.quantidadeAirbags(quantidadeAirbags).build();

				System.out.println(carros.toString());

			} 
			else if (rodas >= 6 && rodas <= 32) {
				System.out.print("\n-----   Caminhão   -----\n\n");
				System.out.print("Modelo: ");
				input.nextLine();
				String modelo = input.nextLine();

				System.out.print("Cor: ");
				String cor = input.nextLine();

				System.out.print("Potencia em Cavalos: ");
				int potenciaCavalos = input.nextInt();

				System.out.print("Comprimento: ");
				int comprimento = input.nextInt();

				System.out.print("peso Maximo Suportado (em toneladas): ");
				int pesoMaximoSuportado = input.nextInt();

				Veiculo caminhoes = new VeiculoBuilder().rodas(rodas).modelo(modelo).cor(cor)
						.potenciaCavalos(potenciaCavalos).comprimento(comprimento)
						.pesoMaximoSuportado(pesoMaximoSuportado).build();

				System.out.println(caminhoes.toString());
			} 
			else if (rodas == 99) {
				System.out.println("\nSistema Finalizado");
			}
			else {
				System.out.println("\nValor invalido!");
				System.out.println("Informe 2 para Moto, 3 para Triciclo, 4 para Carro e de 6 à 32 para Caminhão.\n");
			}
		} while (rodas != 99);
	}

}
