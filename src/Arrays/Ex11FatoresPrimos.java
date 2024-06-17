package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex11FatoresPrimos {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        List<Integer> fatores = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {

            while (numero != 1) {
                if (numero % i != 0) {
                    i++;
                } else {
                    numero = numero / i;
                    fatores.add(i);
                    System.out.println(numero);
                }

            }
            for (int j = 0; j < fatores.size(); j++) {
                System.out.println(fatores.get(j));
            }
        }
    }
}

