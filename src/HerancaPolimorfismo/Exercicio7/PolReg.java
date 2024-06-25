package HerancaPolimorfismo.Exercicio7;

public class PolReg {

    int lados;
    int tamanhoLado;

    public int perimetro(int lados, int tamanhoLado) {
       int i = lados * tamanhoLado;
        return i;
    }
    public int anguloInt() {
        int somaAngulos = 0;
        somaAngulos = (lados - 2) * 180;

        return somaAngulos;
    }
    public double area() {
        return 0;
    }

    public PolReg(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    public PolReg(int lados, int tamanhoLado) {
        this.lados = lados;
        this.tamanhoLado = tamanhoLado;
    }



    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getTamanhoLado() {
        return tamanhoLado;
    }

    public void setTamanhoLado(int tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
}
