package Repetições;
import java.util.Scanner;
public class Ex1Primos {
    public static boolean checarPrimos(int numeroInserido) {

        boolean Primo = true;
        if (numeroInserido <= 1) {
            return false;
        } else {

            for (int i = 2; i <= Math.sqrt(numeroInserido); i++) {

                if (numeroInserido % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número.");

        int numero = scanner.nextInt();

        boolean numerosPrimos = checarPrimos(numero);

        if (numerosPrimos) {
            System.out.println("O número " + numero + " é primo.");

        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        scanner.close();
    }
}
