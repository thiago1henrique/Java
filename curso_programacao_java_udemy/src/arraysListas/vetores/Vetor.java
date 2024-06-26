package arraysListas.vetores;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++ ) {
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        System.out.printf("AVARAGE HEIGHT: %.2f%n", + soma / n);

        sc.close();
    }

}
