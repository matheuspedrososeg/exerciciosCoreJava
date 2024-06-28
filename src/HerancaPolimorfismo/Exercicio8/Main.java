package HerancaPolimorfismo.Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("insira um número real");
        int reall = scanner.nextInt();
        System.out.println("Insira um número imaginário.");
        int imagi = scanner.nextInt();

        Complexo complexo = new Complexo(reall, imagi);
        Real real = new Real(reall);

        System.out.println("O módulo do número complexo é: " + complexo.modulo());
        System.out.println("Ângulo: " + complexo.Angulo());
        System.out.println("Real: (pos ou neg) " + real.Sinal());

        // System.out.println("angulo: " + complexo.Angulo());

    }
}
