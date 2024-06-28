package HerancaPolimorfismo.Exercicio10;

public class Quadrado extends PolReg {
    public Quadrado(int tamanhoLado) {
        super(tamanhoLado);
    }
    @Override
    public double area() {
        double calculo = Math.pow(tamanhoLado, 2);

        return calculo;
    }
}
