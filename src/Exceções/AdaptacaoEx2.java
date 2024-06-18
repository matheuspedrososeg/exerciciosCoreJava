package Exceções;

import Repetições.Ex2Sorteio;

import java.util.Scanner;

public class AdaptacaoEx2 {
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
            try {

                if (resposta > aleatorio) {

                    throw new maiorQueException("Você errou.\nO número que você inseriu é maior do que o sorteado.");

                } else if (resposta < aleatorio) {
                    throw new menorQueException("Você errou.\nO número que você inseriu é menor do que o sorteado.");
                }

                resposta = scanner.nextInt();
            } catch (menorQueException e) {
                System.out.println(e.getMessage());

                resposta = scanner.nextInt();
            } catch (maiorQueException e) {
                System.out.println(e.getMessage());
                resposta = scanner.nextInt();
            }
        }


        if (resposta == aleatorio) {
            System.out.println("Você acertou o número.");
            System.out.println("Você acertou o número em: " + (tentativa + 1) + " tentativas.");

        }


    }

    public int sorteio(int maximo) {
        return (int) (Math.random() * maximo);

        // metodo para transformar math.random em um numero inteiro, assim possibilitando o usuario de acertar o numero.
    }
}

