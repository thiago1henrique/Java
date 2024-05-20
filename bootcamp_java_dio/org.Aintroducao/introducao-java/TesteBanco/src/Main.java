import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        while (true) {

            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    double valor = scanner.nextDouble();
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double valor2 = scanner.nextDouble();
                    if(valor2 > saldo) {
                        System.out.println("Saldo insuficiente.");
                        System.out.println("Programa encerrado.");
                        return;
                    } else {
                        System.out.println("Saldo atual: " + (saldo -= valor2));
                    }
                    break;
                case 3:
                    System.out.println(saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
