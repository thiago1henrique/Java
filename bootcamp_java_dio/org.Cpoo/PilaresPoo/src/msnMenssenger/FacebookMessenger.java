package msnMenssenger;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem() {
        enviarMensagemComVerificacaoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
    }
}
