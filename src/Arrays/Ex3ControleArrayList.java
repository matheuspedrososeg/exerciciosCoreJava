package Arrays;

import Arrays.Ex3ArrayList;

import java.util.Scanner;

public class Ex3ControleArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho do seu armazenamento?");
        int tamanho = scanner.nextInt();

        Ex3ArrayList arrayList = new Ex3ArrayList(tamanho);

        System.out.println("Quantos números deseja inserir?");
        int nums = scanner.nextInt();

        for (int i = 0; i < nums; i++) {
            System.out.println("Digite o " + (i + 1) + "° número.");
            int numero = scanner.nextInt();
            arrayList.add(numero);
        }
        System.out.println(arrayList.calculateAverage());


    }
}
