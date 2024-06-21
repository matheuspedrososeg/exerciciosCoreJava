package Fluxos;

import java.io.*;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Ex14 registrar = new Ex14();
        Ex14 ler = new Ex14();

        Scanner scanner = new Scanner(System.in);
        Scanner scn = new Scanner(System.in);

        String nome = null;
        int bimestre = 0;
        int bimestre2 = 0;
        String materia = null;

        for (int i = 0; i < 3; i++) {
            System.out.println("Insira o nome do " + (i + 1) + "° aluno.");
            nome = scn.nextLine();
            System.out.println("Insira uma matéria: ");
            materia = scanner.nextLine();
            System.out.println("Insira a nota do primeiro bimestre.");
            bimestre = scanner.nextInt();
            System.out.println("Agora do segundo bimestre.");
            bimestre2 = scanner.nextInt();
            int tamanhoNome = nome.length();


            registrar.registro(nome, tamanhoNome, bimestre, bimestre2, i);
            ler.leitura(i);

        }

    }

    public String registro(String nome, int tamanho, int bimestre, int bimestre2, int id) {
        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter("aluno.txt"));
            bw.write(tamanho + nome);
            bw.write(String.valueOf(bimestre));
            bw.write(String.valueOf(bimestre2));
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nome + bimestre + bimestre2;
    }

    public void leitura(int id) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("aluno.txt"));
            String r;
            int letras;
            System.out.println(r = br.readLine());

            letras = r.charAt(0);

            System.out.println(letras);
            System.out.println("Nome: " + r.charAt(0));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}