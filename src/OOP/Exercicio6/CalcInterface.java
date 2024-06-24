package OOP.Exercicio6;

public class CalcInterface {

    public double recebeOperando(int i) {

        return i;
    }

    public char RecebeOperacao(char c) {
        if (c != '+' || c != '-' || c != '*' || c != '/') {
            System.out.println("Não é um tipo válido de operação," +
                    " as operações disponíveis são: " + "+ - * /");

        } else if (c == 's') {
            System.exit(0);
        }

        return c;
    }
    public void mostraResultado(double res) {

    }
}
