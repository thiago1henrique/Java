package autodromo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        //jeep.ligar();
        jeep.setChassi("1234");
        System.out.println(jeep.getChassi());

        Moto z400 = new Moto();
        z400.setChassi("6789");
        //z400.ligar();
        System.out.println(z400.getChassi());

        Veiculo coringa = z400;
        coringa.ligar();

    }
}
