package exercicios;

import java.util.Scanner;

public class exerciciosQuinto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int valores = sc.nextInt();
		
		double[] vetor = new double[valores];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.printf("Insira o %d° valor: ", (i + 1));
			vetor[i] = sc.nextDouble();
			System.out.println(" ");
			
			
		}
		
		double maior = 0;
		int posicao = 0;
		
		for(double j : vetor) {
			if(j > maior) {
				maior = j;
				posicao++;
			}
		}
		
		System.out.println("O maior valor é " + maior);
		System.out.println("Posicao do maior valor = " + posicao);
		
		sc.close();

	}

}
