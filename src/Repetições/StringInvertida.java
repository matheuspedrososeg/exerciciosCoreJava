package Repetições;

import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        sb = new StringBuilder(scanner.nextLine());

        System.out.println(sb.reverse());


    }
}
