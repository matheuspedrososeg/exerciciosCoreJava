package OOP.Exercicio6;

public class CalcDados {

    double num;
    double num1;
    char operacao;

    public void setOperando(int i, double valor) {
        this.num = valor;
    }

    public double getOperando(int i) {
        return this.num;
    }

    public void setOperacao(char op) {
        this.operacao = op;
    }

    public char getOperacao() {
        return operacao;
    }
}
