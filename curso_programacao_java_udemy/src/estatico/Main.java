package estatico;

import estatico.util.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();
        double total = CurrencyConverter.converter(price, dollars);
        System.out.printf("Amount to be paid in reais = %.2f", total);
    }
}
