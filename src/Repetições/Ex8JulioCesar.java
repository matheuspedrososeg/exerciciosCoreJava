package Repetições;

import java.util.Scanner;

public class Ex8JulioCesar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] alfabeto = {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};


        System.out.println("Insira sua frase para criptografar: ");
        String frase = scanner.nextLine();
        String banana;
        System.out.println("Insira o valor J de casas.");
        int casas = scanner.nextInt();
        int j = casas;

        if (j > 27) {
            System.out.println("nao tente quebrar meu codigo");
            System.exit(0);
        }
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < frase.length(); k++) {
            char caractere = frase.charAt(k);
            int criptografado = j + (int) caractere;
            char volta = (char) criptografado;

            if (caractere == (int) 32) {
                caractere = (int) 97;
                sb.append(caractere);

            } else if (caractere == (int) 122 || caractere == (int) 90 ) {
                caractere = (int) 99;
                sb.append(caractere);
            } else {
                sb.append(volta);
            }

        }
        System.out.println(sb);
    }
}

