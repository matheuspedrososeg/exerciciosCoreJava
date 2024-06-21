package OOP.Exercicio3;

import java.time.LocalDate;

public class Pessoa {
    String name;
    public static void main(String[] args) {

        Universidade Princeton = new Universidade("Princeton");
        Universidade Cambridge = new Universidade("Cambridge");

        OOP.Exercicio1.Pessoa einstein = new OOP.Exercicio1.Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14), Princeton);
        OOP.Exercicio1.Pessoa newton = new OOP.Exercicio1.Pessoa("Isaac Newton", LocalDate.of(1463, 1, 4), Cambridge);


        System.out.println(einstein.getNome() + " trabalhou como professor de física em " + einstein.getUniversidade().getNome() + ".");
        System.out.println(newton.getNome() + " trabalhou como professor de física em " + newton.getUniversidade().getNome() + ".");
    }
}
