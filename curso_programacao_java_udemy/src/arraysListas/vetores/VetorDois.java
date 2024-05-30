package arraysListas.vetores;

import arraysListas.vetores.entities.ProductVetorDois;

import java.util.Locale;
import java.util.Scanner;

public class VetorDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        ProductVetorDois[] vect = new ProductVetorDois[n];

        for( int i = 0; i < vect.length; i++ ) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new ProductVetorDois(name, price);
        }

        double soma = 0.0;
        for( int i = 0; i < vect.length; i++ ) {
            soma += vect[i].getPrice();
        }

        double avg = soma / vect.length;
        System.out.printf("%.2f%n", avg);

        sc.close();
    }
}
