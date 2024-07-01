package EstruturaDados.Exercicio3;

import java.util.Stack;

public class Infixos {
    Stack<Character> letras = new Stack<>();
    Stack<Character> numeros = new Stack<>();
    Stack<Character> simbolos = new Stack<>();
    Stack<Character> espaco = new Stack<>();

    public void toPosFixo(String infixa) {


        String lowerCase = infixa.toLowerCase();
        char[] chars = lowerCase.toCharArray();
        for (int i = 0; i < infixa.length(); i++) {
            if (chars[i] > 96 && chars[i] < 123) {
                letras.add(chars[i]);
            } else if (chars[i] == ' ') {
                espaco.add(chars[i]);
            } else if (chars[i] > 20 && chars[i] < 48) {
                simbolos.add(chars[i]);
            } else if (chars[i] > 47 && chars[i] < 58) {
                numeros.add(chars[i]);
            }
        }


        for (int j = 0; j < letras.size(); j++) {
            if (!letras.empty()) {
                System.out.print(letras.get(j));
            }
        }
        for (int i = 0; i < numeros.size(); i++) {
            if (!numeros.empty()) {
                System.out.print(numeros.get(i));
            }
        }
        for (int j = 0; j < simbolos.size(); j++) {
            if (!simbolos.empty()) {
                System.out.print(simbolos.get(j));
            }
        }

    }
}
