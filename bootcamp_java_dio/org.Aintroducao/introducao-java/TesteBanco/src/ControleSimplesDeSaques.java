import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double saqueTotal = 0;

        while (true) {
            double valor = scanner.nextDouble();

            if (valor == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            if (saqueTotal + valor > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }

            saqueTotal += valor;
            limiteDiario -= valor;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
        }
    }
}
