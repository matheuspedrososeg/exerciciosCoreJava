package HerancaPolimorfismo.Exercicio8;

public class Complexo {
    float real;
    float imag;

    public Complexo(float real) {
        this.real = real;
    }

    public Complexo(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }


    public float modulo() {
        float q1 = (float) Math.pow(real, 2);
        float q2 = (float) Math.pow(imag, 2);
        float z = (float) Math.sqrt(q1 + q2);

        return z;
    }
    public float Angulo() {

        return 0;
    }
}
