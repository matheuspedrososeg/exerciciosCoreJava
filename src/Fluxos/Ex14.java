package Fluxos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Ex14 registrar = new Ex14();

        Scanner scanner = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        String nome = null;
        int materia = 0;
        int bimestre = 0;
        int bimestre2 = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "° aluno.");
            nome = scn.nextLine();
            System.out.println("Insira uma matéria: ");
            materia = scanner.nextInt();
            System.out.println("Insira a nota do primeiro bimestre.");
            bimestre = scanner.nextInt();
            System.out.println("Agora do segundo bimestre.");
            bimestre2 = scanner.nextInt();
            int tamanhoNome = nome.length();

            registrar.registro(nome, materia, bimestre, bimestre2, i);




        }
    } public String registro(String nome, int materia, int bimestre, int bimestre2, int id) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("aluno.txt" + id));
            bw.write("Nome: " + nome + "\n");
            bw.write("Matéria: " + materia + "\n");
            bw.write("Nota 1° bimestre: " + String.valueOf(bimestre) + "\n");
            bw.write("Nota 2° bimestre: " + String.valueOf(bimestre2) + "\n");
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nome + materia + bimestre + bimestre2;
    }
}
