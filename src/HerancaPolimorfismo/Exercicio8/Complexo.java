package HerancaPolimorfismo.Exercicio8;

public class Complexo {
    float real;
    float imag;
    double ang;

    public Complexo(float real) {
        this.real = real;
    }

    public Complexo(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }

    float z;

    public float modulo() {
        float q1 = (float) Math.pow(real, 2);
        float q2 = (float) Math.pow(imag, 2);
        z = (float) Math.sqrt(q1 + q2);

        return z;
    }

    public float Cosseno() {
        z = modulo();
        float cos = real / z;
        float degrees = (float) Math.toDegrees(cos);
        return degrees;
    }

    public float Seno() {
        z = modulo();
        float sin = imag / z;
        float degrees = (float) Math.toDegrees(sin);
        return degrees;
    }

    public float Angulo() {
        float radiano = (float) Math.atan2(imag, real);
        float grau = (float) Math.toDegrees(radiano);
        return grau;
    }

}
