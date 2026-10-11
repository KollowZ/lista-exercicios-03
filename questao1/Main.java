public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Ana", "2026001");
        aluno1.cadastrarNota(8);
        aluno1.cadastrarNota(7.5);
        aluno1.cadastrarNota(9);
        aluno1.cadastrarNota(8.5);

        Aluno aluno2 = new Aluno("Bruno", "2026002");
        aluno2.cadastrarNota(5);
        aluno2.cadastrarNota(6);
        aluno2.cadastrarNota(4.5);
        aluno2.cadastrarNota(6);

        Turma turma = new Turma();
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        turma.listarAprovados();
        turma.listarReprovados();
    }
}
