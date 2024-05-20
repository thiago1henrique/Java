package msnMenssenger;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    private boolean internet() {
        System.out.println("conectado!");
        return true;
    }

    protected void enviarMensagemComVerificacaoInternet() {
        if (internet()) {
            System.out.println("Mensagem enviada!");
        } else {
            System.out.println("Erro: sem conexão com a internet!");
        }
    }

    protected void receberMensagemComVerificacaoInternet() {
        if (internet()) {
            System.out.println("Mensagem recebida!");
        } else {
            System.out.println("Erro: sem conexão com a internet!");
        }
    }
}

