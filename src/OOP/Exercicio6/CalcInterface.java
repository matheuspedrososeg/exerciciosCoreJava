package OOP.Exercicio6;

public class CalcInterface {


    public int recebeOperando(int i) {
        return i;
    }

    public char RecebeOperacao(char c) {

        if (c == 's') {
            System.exit(0);
        }
        if (c != '+' && c != '-' && c != '*' && c != '/') {
            System.out.println("Não é um tipo válido de operação," +
                    " as operações disponíveis são: " + "+ - * /");
            System.exit(0);
        }

        return c;
    }

    public void mostraResultado(double res) {

        System.out.println(res);
    }
    public double getResultado(double resultado) {
        return resultado;
    }


}
