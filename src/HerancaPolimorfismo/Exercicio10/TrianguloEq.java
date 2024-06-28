package HerancaPolimorfismo.Exercicio10;

public class TrianguloEq extends PolReg {
    public TrianguloEq(int base, int altura) {
        super(base, altura);
    }
    @Override
    public double area() {
        return (lados * tamanhoLado) / 2;
    }
}
