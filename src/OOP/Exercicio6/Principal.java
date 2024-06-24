package OOP.Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalcInterface calcInterface = new CalcInterface();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número.");
        int n = scanner.nextInt();
        calcInterface.recebeOperando(n);
        System.out.println("Insira um segundo número.");
        int n2 = scanner.nextInt();
        System.out.println("Escolha seu operando.");
        char operando = scanner.next().charAt(0);



    }
}
