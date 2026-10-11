import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantos termos de Fibonacci deseja ver? ");
        int n = entrada.nextInt();

        if (n < 0) {
            System.out.println("Digite um número positivo.");
        } else {
            long primeiro = 0;
            long segundo = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(primeiro);
                if (i < n - 1) System.out.print(", ");
                long proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            System.out.println();
        }
        entrada.close();
    }
}
