package OOP.Exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> departamentos = new ArrayList<>(50);

        Departamento departamentop = new Departamento("Educação Física");
        departamentos.add(String.valueOf(departamentop));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o nome do gênio:");
        String nomePessoa = scanner.nextLine();
        System.out.println("Insira a universidade em que o gênio trabalha/estuda.");
        String universidade = scanner.nextLine();
        Universidade universidade1 = new Universidade(universidade);
        System.out.println("Insira o departamento:");
        String departamento = scanner.nextLine();
        Departamento departamento1 = new Departamento(departamento);
        departamentos.add(String.valueOf(departamento1));

        Pessoa pessoa = new Pessoa(nomePessoa, universidade1, departamento1);

        System.out.println("Nome: " + pessoa.getName() + "\nUniversidade: " + pessoa.getUniversidade() + "\nDepartamento: " + pessoa.getDepartamento());

        pessoa.setDepartamento(departamentop);

        System.out.println(pessoa.getDepartamento());

        System.out.println(pessoa.getDepartamentoUniversidade());

        System.out.println("\nLista de Departamentos: \n");

        for (int i = 0; i < departamentos.size(); i++) {
            System.out.println("Departamento: " + departamentos.get(i));
        }


    }
}
