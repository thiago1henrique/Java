public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 100; numero >= 0; numero++) {
            if(numero == 3) continue;

            System.out.println(numero);
        }
    }
}
