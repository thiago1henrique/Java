package estados;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome());
        }

        System.out.println("--------------");

        EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;
        System.out.println(eb.getSigla() + " - " + eb.getNome());
    }
}
