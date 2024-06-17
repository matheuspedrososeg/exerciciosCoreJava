package Arrays;

import Arrays.Ex3Array;

import java.util.Scanner;

public class Ex3ArrayControle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do armazenamento de números que você deseja?");
        int answer = scanner.nextInt();

        Ex3Array array = new Ex3Array(answer);

        System.out.println("Quantos números deseja inserir?");
        int quantidade = scanner.nextInt();
        if (quantidade > answer) {
            System.out.println("Você não pode inserir mais números do que o tamanho do armazenamento.");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Preencha o " + (i + 1) + "° número.");
            int numero = scanner.nextInt();
            array.add(numero);
        }

        System.out.println(array.calculateAverage());

    }

}

