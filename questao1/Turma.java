import java.util.ArrayList;

public class Turma {
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (Aluno aluno : alunos) {
            if (aluno.estaAprovado()) {
                System.out.println(aluno);
            }
        }
    }

    public void listarReprovados() {
        System.out.println("Alunos reprovados:");
        for (Aluno aluno : alunos) {
            if (!aluno.estaAprovado()) {
                System.out.println(aluno);
            }
        }
    }
}
