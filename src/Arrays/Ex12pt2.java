package Arrays;

import java.util.Scanner;

public class Ex12pt2 {
    public static void main(String[] args) {

        int[][] cidades = new int[5][5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            if (cidades[0][i] == 0) {
                if (i == 0) {
                    cidades[0][i] = 0;

                } else {
                    System.out.println("Insira a distância entre a cidade 1" + " e a cidade " + (i + 1) + ".");
                    int resposta = scanner.nextInt();
                    cidades[0][i] = resposta;
                    cidades[i][0] = cidades[0][i];
                }
            }

        }
        for (int i = 0; i < 5; i++) {
            if (cidades[1][i] == 0) {
                if (i == 1) {
                    cidades[1][i] = 0;
                } else {
                    System.out.println("Insira a distância entre a cidade 2" + " e a cidade " + (i + 1) + ".");
                    int resposta1 = scanner.nextInt();
                    cidades[1][i] = resposta1;
                    cidades[i][1] = cidades[1][i];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (cidades[2][i] == 0) {
                if (i == 2) {
                    cidades[2][i] = 0;
                } else {
                    System.out.println("Insira a distância entre a cidade 3" + " e a cidade " + (i + 1) + ".");
                    int resposta2 = scanner.nextInt();
                    cidades[2][i] = resposta2;
                    cidades[i][2] = cidades[2][i];
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            if (cidades[3][i] == 0) {
                if (i == 3) {
                    cidades[3][i] = 0;

                } else {
                    System.out.println("Insira a distância entre a cidade 4" + " e a cidade " + (i + 1) + ".");
                    int resposta3 = scanner.nextInt();
                    cidades[3][i] = resposta3;
                    cidades[i][3] = cidades[3][i];
                }
            }
        }

        for (int i = 0; i < cidades.length; i++) {
            System.out.println();
            for (int j = 0; j < cidades[i].length; j++) {
                System.out.print(cidades[i][j] + " ");
            }
        }
    }
}

