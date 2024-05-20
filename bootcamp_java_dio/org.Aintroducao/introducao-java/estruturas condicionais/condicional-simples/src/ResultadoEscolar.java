import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;

        System.out.print("Insira sua nota: ");
        nota = scanner.nextDouble();

        System.out.println(nota > 6 ? "Aprovado" : nota >= 5 && nota < 7 ? "RECUPERAÇÃO" : "reporvado");
    }
}
