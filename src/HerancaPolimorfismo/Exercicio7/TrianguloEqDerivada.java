package HerancaPolimorfismo.Exercicio7;
public class TrianguloEqDerivada extends PolReg {

    public TrianguloEqDerivada(int base, int altura) {
        super(base, altura);

    }
    @Override
    public double area() {
        return (lados * tamanhoLado) / 2;
    }
}
