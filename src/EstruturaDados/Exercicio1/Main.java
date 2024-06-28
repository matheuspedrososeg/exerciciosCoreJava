package EstruturaDados.Exercicio1;

import EstruturaDados.Exercicio1.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Empregado> empregados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Scanner nexts = new Scanner(System.in);

        System.out.println("Quantos dados de empregados deseja inserir?");
        int qt = scanner.nextInt();

        for (int i = 0; i < qt; i++) {
            System.out.println("Insira o nome do empregado");
            String name = nexts.nextLine();
            System.out.println("Insira o cpf.");
            int cpf = scanner.nextInt();
            System.out.println("Salário:");
            double salario = scanner.nextDouble();

            Empregado empregado = new Empregado(name, cpf, salario);
            empregados.add((new Empregado(empregado.getNome(), empregado.getCpf(), empregado.getSalario())));
        }
        System.out.println("Digite 1 caso queira deletar um CPF.");
        int choice = scanner.nextInt();
        if (choice == 1) {

            System.out.println("Insira um cpf a ser deletado.");
            int deleteCpf = scanner.nextInt();
            for (Empregado target : empregados) {
                if (deleteCpf == target.getCpf()) {
                    empregados.remove(target);
                    System.out.println("CPF Removido com sucesso!");
                }
            }

            for (int i = 0; i < empregados.size(); i++) {
                System.out.println(empregados.get(i).cpf);
            }
        }
        scanner.close();
    }
}
