import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String matricula;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void cadastrarNota(double nota) {
        if (notas.size() < 4) {
            notas.add(nota);
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        if (notas.size() == 0) return 0;
        return soma / notas.size();
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return nome + " - matrícula: " + matricula + " - média: " + String.format("%.2f", calcularMedia());
    }
}
