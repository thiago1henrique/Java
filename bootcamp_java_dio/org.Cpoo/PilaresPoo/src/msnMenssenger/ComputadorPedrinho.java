package msnMenssenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();
        System.out.println("MSN");
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();
        System.out.println("Facebook");
        fb.enviarMensagem();
        fb.receberMensagem();

        System.out.println("Telegram");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();


    }
}
