import java.util.*;
public class Turma { private final List<Aluno> alunos=new ArrayList<>();
 public void adicionarAluno(Aluno a){if(a==null)throw new IllegalArgumentException("Aluno nulo.");alunos.add(a);}
 public void listarAprovados(){System.out.println("Aprovados:");for(Aluno a:alunos)if(a.estaAprovado())System.out.println(a);}
 public void listarReprovados(){System.out.println("Reprovados:");for(Aluno a:alunos)if(!a.estaAprovado())System.out.println(a);}
}
