package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        int[][] cidades = new int[5][5];

        cidades[0][0] = 0;
        cidades[0][1] = 15;
        cidades[0][2] = 30;
        cidades[0][3] = 5;
        cidades[0][4] = 12;

        cidades[1][0] = 15;
        cidades[1][1] = 0;
        cidades[1][2] = 10;
        cidades[1][3] = 17;
        cidades[1][4] = 28;

        cidades[2][0] = 30;
        cidades[2][1] = 10;
        cidades[2][2] = 0;
        cidades[2][3] = 3;
        cidades[2][4] = 11;

        cidades[3][0] = 5;
        cidades[3][1] = 17;
        cidades[3][2] = 3;
        cidades[3][3] = 0;
        cidades[3][4] = 80;

        cidades[4][0] = 12;
        cidades[4][1] = 28;
        cidades[4][2] = 11;
        cidades[4][3] = 80;
        cidades[4][4] = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas cidades você percorreu?");
        int qt = scanner.nextInt();
        ArrayList<Integer> info = new ArrayList<>(qt);

        int input;
        int distancia = 0;

        for (int i = 0; i < qt; i++) {
            System.out.println("Insira a cidade.");
            input = scanner.nextInt();
            int r = input - 1;
            info.add(r);
            if (i > 0) {
                int distancias = cidades[info.get(i)][info.get(i - 1)];
                distancia += distancias;
            }
        }
        System.out.println("A distância total é de: " + distancia + "km.");


    }
}
