package OOP.Exercicio5;


import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner nexts = new Scanner(System.in);
        boolean verificador = true;

        System.out.println("Insira o nome do aluno:");
        String n = nexts.nextLine();


        while (verificador) {
            if (n.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Insira a primeira nota parcail:");
            int p = scanner.nextInt();
            System.out.println("Insira a segunda nota parcial:");
            int s = scanner.nextInt();

            Aluno aluno = new Aluno(n, p, s);
            aluno.add(aluno);
            aluno.informacoes();

            System.out.println("Insira o nome do aluno:");
            n = nexts.nextLine();

        }


    }

}
