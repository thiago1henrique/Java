package exercicios;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas notas você deseja inserir? ");
        int notasInserir = sc.nextInt();
        
        double[] notas = new double[notasInserir];
        
        for(int i = 0; i < notas.length; i++) {
        	System.out.printf("Insira a %d° nota: ", (i + 1));
        	notas[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        for(double j : notas) {
        	soma += j;
        }
        
        double total = soma / notas.length;
        
        System.out.print("VALORES = ");
        for(double j : notas) {
        	System.out.print(j + " ");
        }
        
        System.out.println("");
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.println("MEDIA = " + total);

        sc.close();
    }
}
