package curso_programacao.scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira seu nome:");
		String x = sc.next();
		int y = sc.nextInt();
		System.out.printf("Seu nome é:%s, tem %d anos.", x, y);
		sc.close();

	}

}
