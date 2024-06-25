package OOP.Exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcControle {

    CalcInterface ci = new CalcInterface();
    CalcDados cd = new CalcDados();


    public void executar() {
        char operacion = ' ';

        Scanner scanner = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        while (operacion != 's') {
            for (int i = 1; i < 3; i++) {
                System.out.println("Insira um número.");
                int value = scanner.nextInt();
                int banana = ci.recebeOperando(value);
                cd.setOperando(i, ci.recebeOperando(value));
                lista.add(value);
            }

            System.out.println("Insira uma operação.");
            operacion = scanner.next().charAt(0);
            ci.RecebeOperacao(operacion);
            cd.setOperacao(operacion);

            double res = opera(lista.get(0), lista.get(1), cd.getOperacao());
            ci.mostraResultado(res);

        }
    }

    private double opera(double opn1, double opn2, char op) {
        double resultado = 0;
        if (op == '+') {
            resultado = opn1 + opn2;
        } else if (op == '-') {
            resultado = opn1 - opn2;
        } else if (op == '*') {
            resultado = opn1 * opn2;
        } else if (op == '/') {
            resultado = opn1 / opn2;
        }
        return resultado;
    }
}
