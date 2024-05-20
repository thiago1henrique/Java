import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double saldo ;
       double valorSolicitado;

        System.out.println("Insira quando você tem de saldo");
        saldo = scanner.nextDouble();

        System.out.println("Insira quanto deseja retirar");
        valorSolicitado = scanner.nextDouble();

       if(valorSolicitado < saldo)
           System.out.println("Valor retirado: " + valorSolicitado + " saldo em conta " + saldo);
       else
           System.out.println("Saldo insuficiente.");
    }

}
