package exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int valor = sc.nextInt();
		
		int[] vect = new int[valor];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.printf("Digite o %d° valor ", (i + 1));
			vect[i] = sc.nextInt();
		}
		
		int somaPares = 0;
		System.out.println("Valores pares:");
		for(int i : vect) {
			if(i%2 == 0) {
				System.out.print(i + " ");
				somaPares++;
			}
		}
		
		System.out.println(" ");
		System.out.println("Quantidade de pares = " + somaPares);
		
		sc.close();
	}

}
