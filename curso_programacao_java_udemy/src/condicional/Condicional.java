package condicional;

import java.util.Scanner;

public class Condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Que horas são? ");
		int hora = sc.nextInt();
		sc.close();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora > 12 && hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}
	}
}
