package estruturas_repetitivas;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		System.out.println("Higher: " + higher);
		
		sc.close();

	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		} else if ( b > c) {
			aux = b;
		} else {
			aux = c;
		}
		
		return aux;
	}


}
