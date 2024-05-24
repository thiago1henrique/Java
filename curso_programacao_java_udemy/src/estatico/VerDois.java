package estatico;

import estatico.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class VerDois {
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circuferencia(radius);
        double v = calc.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }
}
