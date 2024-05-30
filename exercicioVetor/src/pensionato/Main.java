package pensionato;

import java.util.Scanner;

import pensionato.alunos.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int rooms = sc.nextInt();
		
		int[] roomsVect = new int[rooms];
		Aluno[] alunos = new Aluno[rooms];
		
		for(int i = 0; i < roomsVect.length; i++) {
			System.out.printf("Rent #%d%n", (i+1));
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Email: ");
			String email = sc.next();
			
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			roomsVect[i] = room;
			alunos[i] = new Aluno(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for(int i = 0; i < roomsVect.length; i++) {
			System.out.printf("%d: ", (i + 1));
			System.out.println(alunos[i]);
		}
		
		sc.close();

	}

}
