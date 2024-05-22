package estruturas_repetitivas;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira quantos valores deseja inserir:");
		int n = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Insira o " + (i + 1) + "° valor");
			int x = sc.nextInt();
			soma += x;
		}
		System.out.printf("A soma dos valores é %d", soma);
		
		sc.close();

	}
	
}
