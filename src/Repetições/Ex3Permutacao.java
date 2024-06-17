package Repetições;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3Permutacao {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número.");
        int numero1 = scanner.nextInt();
        System.out.println("Agora insira um segundo número.");
        int numero2 = scanner.nextInt();

        boolean resultado = verificarPermutacao(numero1, numero2);

        System.out.println(resultado);




        } public static boolean verificarPermutacao(int numero1, int numero2 ) {

        String primeiro = String.valueOf(numero1);
        String segundo = String.valueOf(numero2);



        char[] array1 = primeiro.toCharArray();
        char[] array2 = segundo.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);


        return Arrays.equals(array1, array2);

    }



    }



