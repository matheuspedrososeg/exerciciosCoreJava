package Repetições;

import java.util.Arrays;
import java.util.Scanner;

public class StringAbreviada {
    public static void main(String[] args) {
        String[] str = new String[99];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert your full name.");
        String name = scanner.nextLine();

        for (int i = 0; i < name.length(); i++) {
            str = name.split(" " , 99);

        }
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 2)
            System.out.print(str[i].charAt(0)+ ". ");
        }
    }

}
