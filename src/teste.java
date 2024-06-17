import java.util.Arrays;
import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas cidades tem em seu mapa?");
        int qtCidades = scanner.nextInt();

        int calculo = ((int) Math.pow(qtCidades , 2) - qtCidades) / 2;
        int[][] ps = new int[calculo / 2][calculo / 2];

        for (int i = 0; i < calculo; i++) {
            for (int j = 0; j < calculo; j++) {
                if (i == j) {
                    ps [i][j] = 0;
                }
            }
            int resposta = scanner.nextInt();
            if (i < qtCidades - 1) {
                ps[0][i] = resposta;
                System.out.println(Arrays.deepToString(ps));
            } else {
                ps[1][i] = resposta;
                System.out.println(Arrays.deepToString(ps));
            }
        }
    }
}
