import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um número de 1 a 60: ");
            int numero = entrada.nextInt();

            while (numero < 1 || numero > 60) {
                System.out.print("Número inválido. Digite outro: ");
                numero = entrada.nextInt();
            }

            boolean repetido = true;
            while (repetido) {
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                        System.out.print("Esse número já foi escolhido. Digite outro: ");
                        numero = entrada.nextInt();
                        while (numero < 1 || numero > 60) {
                            System.out.print("Número inválido. Digite outro: ");
                            numero = entrada.nextInt();
                        }
                        break;
                    }
                }
            }
            numeros[i] = numero;
        }

        Arrays.sort(numeros);
        System.out.println("Números escolhidos: " + Arrays.toString(numeros));
        entrada.close();
    }
}
