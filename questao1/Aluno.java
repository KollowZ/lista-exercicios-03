import java.util.*;
public class Aluno {
 private final String nome, matricula; private final List<Double> notas=new ArrayList<>();
 public Aluno(String nome,String matricula){if(nome==null||nome.isBlank()||matricula==null||matricula.isBlank())throw new IllegalArgumentException("Nome e matrícula obrigatórios.");this.nome=nome;this.matricula=matricula;}
 public void cadastrarNota(double n){if(notas.size()>=4)throw new IllegalStateException("Máximo de 4 notas.");if(n<0||n>10)throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");notas.add(n);}
 public double calcularMedia(){if(notas.isEmpty())throw new IllegalStateException("Cadastre notas primeiro.");double s=0;for(double n:notas)s+=n;return s/notas.size();}
 public boolean estaAprovado(){return calcularMedia()>=7.0;} public String getNome(){return nome;} public String getMatricula(){return matricula;}
 @Override public String toString(){return nome+" (matrícula "+matricula+"), média: "+String.format("%.2f",calcularMedia());}
}
