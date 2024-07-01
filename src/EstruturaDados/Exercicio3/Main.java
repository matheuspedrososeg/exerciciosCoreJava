package EstruturaDados.Exercicio3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Infixos infixos = new Infixos();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma expressão numérica.");
        String expression = scanner.nextLine();
        infixos.toPosFixo(expression);
    }
}
