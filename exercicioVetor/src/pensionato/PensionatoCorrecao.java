package pensionato;

import java.util.Scanner;

import pensionato.alunos.Aluno;

public class PensionatoCorrecao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno[] vect = new Aluno[10];
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Rent #%d%n", (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Aluno(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms");
		for(int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		
		sc.close();

	}

}
