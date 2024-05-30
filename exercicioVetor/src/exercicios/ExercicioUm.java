package exercicios;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        if (n <= 10 && n > 0) {
            int[] vect = new int[n];
            for (int i = 0; i < vect.length; i++) {
                System.out.printf("Digite o %d valor: ", (i + 1));
                vect[i] = sc.nextInt();
            }

            System.out.println("NUMEROS NEGATIVOS:");
            for (int j : vect) { //for-each
                if (j < 0) {
                    System.out.println(j);
                }
            }
        } else {
            System.out.println("Digite um valor válido.");
        }
        
        sc.close();
    }
}
