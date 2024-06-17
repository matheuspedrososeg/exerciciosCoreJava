package Repetições;

import java.util.Scanner;

public class reflexos {
    private long inicio;
    private double percorrido;
    private boolean rodando;
    private int min;
    private int max;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        reflexos reflexos = new reflexos();


        int aleatorio = reflexos.alcance(1,10);
        System.out.println("Número gerado: " + aleatorio);
        reflexos.iniciar();
        int numero = scanner.nextInt();

        if (numero == aleatorio) {
            reflexos.terminar();
            System.out.println("Você reagiu em: " + reflexos.getPercorrido() / 1000 + " segundos.");
        } else {
            System.out.println("Você errou o número.");
            System.exit(0);
        }



    }

    public void iniciar() {
        inicio = System.currentTimeMillis();
        rodando = true;
    }

    public void terminar() {
        percorrido = percorrido +  System.currentTimeMillis() - inicio;

    } public double getPercorrido() {
        if (rodando) {
            return percorrido + System.currentTimeMillis() - inicio;
        } else {
            return percorrido;
        }

        } public int alcance(int min, int max) {
        return (int) ((Math.random() * (max - min) + min));
    }
}


