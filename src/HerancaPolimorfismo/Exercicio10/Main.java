package HerancaPolimorfismo.Exercicio10;

import HerancaPolimorfismo.Exercicio7.PolReg;
import HerancaPolimorfismo.Exercicio7.Quadrado;
import HerancaPolimorfismo.Exercicio7.TrianguloEqDerivada;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws InterruptedException {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Qual forma deseja calcular?");
            Thread.sleep(1200);
            System.out.println("Digite 1 para Polígono.");
            Thread.sleep(500);
            System.out.println("Digite 2 para triângulo equilátero.");
            Thread.sleep(500);
            System.out.println("Digite 3 para quadrado.");
            int escolha = scanner.nextInt();
            while (escolha > 3 || escolha < 0) {
                System.out.println("Digite uma escolha válida.");
                escolha = scanner.nextInt();
            }
            if (escolha == 1) {
                System.out.println("Quantos lados tem o seu polígono?");
                int sides = scanner.nextInt();
                System.out.println("Qual o tamanho dos lados?");
                int size = scanner.nextInt();

                PolReg poligono = new PolReg(sides, size);

                System.out.println("Perímetro: " + poligono.perimetro(sides, size));
                System.out.println("Soma ângulos internos: " + poligono.anguloInt());

            } else if (escolha == 2) {
                System.out.println("Quantos cm tem a base?");
                int base = scanner.nextInt();
                System.out.println("Quantos cm tem a altura?");
                int altura = scanner.nextInt();

                TrianguloEqDerivada triangulo = new TrianguloEqDerivada(base, altura);
                System.out.println("Área: " + triangulo.area());
            } else if (escolha == 3) {
                System.out.println("Quantos centímetros tem os lados de seu quadrado?");
                int cm = scanner.nextInt();
                Quadrado quadrado = new Quadrado(cm);
                System.out.println("Perímetro: " + quadrado.perimetro(4, cm));
                System.out.println("Área: " + quadrado.area());

            }
        }
    }

