package Repetições;

import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        Ex2Sorteio sorteio = new Ex2Sorteio();
        int aleatorio = sorteio.sorteio(1000);  // numero maximo que pode ser sorteado pelo Math.random

        System.out.println("Sorteando um número...");
        Thread.sleep(1500);

        System.out.println("Qual foi o número sorteado? (Máximo: 1000)");

        int resposta = scanner.nextInt();

        int tentativa = 0;
        while (resposta != aleatorio) {
            tentativa++;

            if (resposta > aleatorio ) {
                System.out.println("Você errou.\nO número que você inseriu é maior do que o sorteado.");
            } else if (resposta < aleatorio) {
                System.out.println("Você errou. \nO número que você inseriu é menor do que o sorteado.");
            }
            resposta = scanner.nextInt();
        }

        if (resposta == aleatorio) {
            System.out.println("Você acertou o número.");
            System.out.println("Você acertou o número em: " + (tentativa + 1) + " tentativas.");

        }



    } public int sorteio(int maximo) {
        return (int) (Math.random() * maximo);

        // metodo para transformar math.random em um numero inteiro, assim possibilitando o usuario de acertar o numero.
    }


}
