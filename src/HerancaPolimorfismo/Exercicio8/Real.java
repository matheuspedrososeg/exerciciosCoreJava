package HerancaPolimorfismo.Exercicio8;

public class Real extends Complexo {

    public Real(float real) {
        super(real);
    }

    public int Sinal() {
        if (real < 0) {
            return -1;
        }
        return 1;
    }
}
