package cadastro;

public class SistemaCadastro {
    public static void main(String[] args) {
        //criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Thiago", "70998594308");
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereco());
    }
}

