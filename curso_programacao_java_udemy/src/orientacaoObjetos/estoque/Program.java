package orientacaoObjetos.estoque;

import orientacaoObjetos.estoque.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product tv = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        tv.nome = sc.nextLine();
        System.out.print("Price: ");
        tv.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        tv.quantity = sc.nextInt();

        System.out.println("Product data: " + tv);
        System.out.println();
        System.out.print("Enter the number to be added in stock: ");
        int stock = sc.nextInt();
        tv.addProducts(stock);
        System.out.println("Updated data: " + tv);
        System.out.println();
        System.out.print("Enter the number to be remove in stock: ");
        int remove = sc.nextInt();
        tv.removeProducts(remove);
        System.out.println("Removed data: " + tv);

        sc.close();

    }
}
