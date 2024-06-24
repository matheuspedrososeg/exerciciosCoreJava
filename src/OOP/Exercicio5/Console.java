package OOP.Exercicio5;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        List<Aluno> reprovados = new ArrayList<>();
        List<Aluno> aprovados = new ArrayList<>();
        List<Aluno> finais = new ArrayList<>();
        List<Double> medias = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        Scanner nexts = new Scanner(System.in);
        boolean verificador = true;

        System.out.println("Insira o nome do aluno:");
        String n = nexts.nextLine();


        while (verificador) {


            if (n.equalsIgnoreCase("fim")) {

                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println(alunos.get(i));
                }
                System.out.println("Quantidade de Aprovados: " + aprovados.size());
                System.out.println("Quantidade de Reprovados: " + reprovados.size());
                System.out.println("Quantidade de Finais: " + finais.size());

                break;
            }
            System.out.println("Insira o código do aluno.");
            int id = scanner.nextInt();

            System.out.println("Insira a primeira nota parcail:");
            int p = scanner.nextInt();
            if (p > 100 || p < 0) {
                System.out.println("Nota Inválida. Tente novamente.");
                break;
            }

            System.out.println("Insira a segunda nota parcial:");
            int s = scanner.nextInt();
            if (s > 100 || s < 0) {
                System.out.println("Nota Inválida. Tente novamente.");
                break;
            }

            Aluno aluno = new Aluno(n, p, s);
            double media = (p + s) / 2;
            medias.add(media);

            double soma = 0;
            for (int i = 0; i < medias.size(); i++) {
                soma += medias.get(i);
            }

            if (media < 50) {
                reprovados.add(aluno);
            } else if (media > 50 && media < 60) {
                finais.add(aluno);
            } else if (media > 60) {
                aprovados.add(aluno);
            }

            alunos.add(aluno);

            System.out.println("Quantidade de alunos: " + alunos.size());

            System.out.println("Média da turma: " + soma / alunos.size());

            System.out.println("Insira o nome do aluno:");
            n = nexts.nextLine();

        }

    }

}


