package Repetições;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExecString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        char[] arr1 = string1.toCharArray();
        char[] arr2 = string2.toCharArray();
        Set<Character> letras = new HashSet<>();
        String[] str = new String[string1.length()];
        String[] str2;

        int k = 0;
        int l = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    letras.add(arr1[i]);
                }
            }
        }
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) == ' ') {
                l++;
            }
        }
        for (int i = 0; i < l; i++) {
            str = string1.split(" ", 999);
            str2 = string2.split(" ", 999);

            if (Arrays.equals(str[i].toCharArray(), str2[i].toCharArray())) {
                k++;
            }

        }
        for (int i = 0; i < str.length; i++) {
            if (str[i] != null) {
                System.out.println(str[i]);

            }
        }


        System.out.println("A quantidade de letras em comum é de: " + letras.size() + "\nA quantidade de vezes que a segunda frase está contida na primeira é de: " + k);
        System.out.println(string1.contains(string2));


    }
}
