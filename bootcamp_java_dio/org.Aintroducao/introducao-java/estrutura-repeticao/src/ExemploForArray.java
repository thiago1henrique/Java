public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Thiago", "Henrique", "Lucas", "Silva"};

        //for(int aluno = 0; aluno < alunos.length; aluno++) {
        //   System.out.println(alunos[aluno]);
        //}
        for(String aluno : alunos) System.out.println(aluno);
    }
}
