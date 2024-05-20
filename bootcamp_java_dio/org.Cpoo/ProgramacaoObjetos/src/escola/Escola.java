package escola;
public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Thiago");
        felipe.setIdade(24);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos

        Aluno henrique = new Aluno();
        henrique.setNome("Henrique");
        henrique.setIdade(25);

        System.out.println("O aluno " + henrique.getNome() + " tem " + henrique.getIdade() + " anos ");
    }
}