package exercicios.util;

import java.util.Scanner;

public class ExercicioDoisFinal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serao inseridas? ");
		int pergunta = sc.nextInt();
		Pessoa[] dados = new Pessoa[pergunta];
		
		for(int i = 0; i < dados.length; i++) {
			System.out.printf("Dados da %d° pessoa %n", (i + 1));
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			dados[i] = new Pessoa(nome, idade, altura);
		}
		
		double somarAltura = 0.0;
		for(Pessoa pessoa : dados) {
			somarAltura += pessoa.getAltura();
		}
		
		System.out.printf("Altura media: %.2f%n", somarAltura / dados.length);
		
		int cont = 0;
		for(Pessoa pessoa : dados) {
			if(pessoa.getIdade() < 16) {
				cont++;
			}
		}
		
		double percent = cont * 100.0 / dados.length;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		
		for(Pessoa pessoa : dados) {
			if(pessoa.getIdade() < 16) System.out.println(pessoa.getNome());
		}
		
		sc.close();
		

	}

}
