package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Estou on!");
        String[] candidatos = {"THIAGO", "HENRIQUE", "JULIA", "MARIA", "MONICA"};

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
//        imprimirSelecionados();
//        selecaoCandidatos();
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando) tentativasRealizadas++;
            else System.out.println("CONTATO REALIZADO COM SUCESO!");

        } while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu) System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " REALIZADA") ;
        else System.out.println("NÃO CONSEGUIMOS CONTATO DE " + candidato);
    }

    static boolean atender() {
        return new Random().nextInt(3) ==1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"THIAGO", "HENRIQUE", "JULIA", "MARIA", "MONICA"};
        System.out.println("Imprimindo selecionados de uma candidatura informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice + 1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = {"THIAGO", "HENRIQUE", "JULIA", "MARIA", "MONICA", "PAULA", "LUCAS", "GABI", "ASTOLFO"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String canditato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + canditato + " solicitou este valor de salario: " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + canditato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) System.out.println("LIGAR PARA O CANDIDATO");
        else if(salarioBase == salarioPretendido) System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
}
