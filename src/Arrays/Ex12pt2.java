package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12pt2 {
    public static void main(String[] args) {

        int[][] cidades = new int[4][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            int resposta = scanner.nextInt();

            if (i < 4) {
                cidades[0][i] = resposta;

            } else if (i >= 4 && i < 7) {
                cidades[1][i - 4] = resposta;
            } else if (i >= 7 && i < 9) {
                cidades[2][i - 7] = resposta;
            } else if (i >= 9 && i < 10) {
                cidades[3][i - 9] = resposta;
            }



            System.out.println(Arrays.deepToString(cidades));
        }


        System.out.println("Insira duas cidades para dizer qual a distancia entre elas.");
        int cid1 = scanner.nextInt();
        int cid2 = scanner.nextInt();

        System.out.println(cidades[cid1 - 1][cid2 - 1]);
    }
}
