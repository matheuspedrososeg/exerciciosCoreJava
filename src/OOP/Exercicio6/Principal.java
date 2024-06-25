package OOP.Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CalcInterface calcInterface = new CalcInterface();
        CalcDados calcDados = new CalcDados();
        CalcControle calcControle = new CalcControle();

        calcControle.executar();


    }
}
