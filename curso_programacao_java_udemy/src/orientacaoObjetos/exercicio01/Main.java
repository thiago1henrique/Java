package orientacaoObjetos.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());
        System.out.println("PERIMETER = " + rectangle.perimetro());
        System.out.println("DIAGONAL = " + rectangle.diagonal());
    }
}
