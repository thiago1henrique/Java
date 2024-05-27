package contaBancariaExercicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria pessoa;
        double valorDeposito = 0;

        System.out.print("Enter account number: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Enter account holder: ");
        String nome = sc.next();
        System.out.print("Is there a initial deposit (y/n)? ");
        String resposta = sc.next();
        if(resposta.equals("y")) {
        	System.out.print("Enter initia deposit value:");
        	valorDeposito = sc.nextDouble();
            pessoa = new ContaBancaria(numeroDaConta, nome, valorDeposito);
        } else {
        	pessoa = new ContaBancaria(numeroDaConta, nome);
        }
        
        System.out.println("");
        
        System.out.println("Account data:");
        System.out.printf("Account %d, holder: %s, balance: %.2f", pessoa.getNumeroConta(), pessoa.getNome(), pessoa.getValorDeposito());
        
        System.out.println("");
        
        System.out.print("Entrer a deposit value:");
        pessoa.deposito(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.printf("Account %d, holder: %s, balance: %.2f", pessoa.getNumeroConta(), pessoa.getNome(), pessoa.getValorDeposito());
        
        System.out.println(" ");
        
        System.out.print("Entrer a withdraw value: ");
        pessoa.saque(sc.nextDouble());
        System.out.println("Updated account data:");
        System.out.printf("Account %d, holder: %s, balance: %.2f", pessoa.getNumeroConta(), pessoa.getNome(), pessoa.getValorDeposito());
        
        sc.close();
    }
}
