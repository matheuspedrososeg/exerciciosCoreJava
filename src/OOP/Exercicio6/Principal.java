package OOP.Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalcInterface calcInterface = new CalcInterface();
        CalcDados calcDados = new CalcDados();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número.");
        int n = scanner.nextInt();
        calcInterface.recebeOperando(n);
        calcDados.setOperando(1, n);
        System.out.println(calcDados.getOperando(1));

        System.out.println("Insira um segundo número.");
        int n2 = scanner.nextInt();
        calcInterface.recebeOperando(n2);
        calcDados.setOperando(2, n2);
        System.out.println(calcDados.getOperando(2));

        System.out.println("Escolha sua operação.");
        char operacao = scanner.next().charAt(0);
        calcInterface.RecebeOperacao(operacao);
        calcDados.setOperacao(operacao);
        System.out.println(calcDados.getOperacao());



    }
}
