package HerancaPolimorfismo.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Albert Einstein" , 145);
        Aluno aluno = new Aluno("Matheus Pedroso" , 16, "Inglês");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Deseja procurar os dados de uma Pessoa. ou de um aluno?");
        System.out.println("Pessoa = 1");
        System.out.println("Aluno = 2");
        int escolha = scanner.nextInt();
        while (escolha > 2 || escolha < 0) {
            System.out.println("Pessoa = 1");
            System.out.println("Aluno = 2");
            escolha = scanner.nextInt();
        }    if (escolha == 1) {
            System.out.println(pessoa.mostraDados());
        } else if (escolha == 2) {
            System.out.println(aluno.mostraDados());
        }
    }
}
