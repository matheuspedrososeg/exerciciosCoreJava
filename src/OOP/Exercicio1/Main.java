package OOP.Exercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa einstein = new Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14));
        Pessoa newton = new Pessoa("Isaac Newton", LocalDate.of(1643, 1, 4));

        einstein.CalculaIdade(LocalDate.now());
        System.out.println(einstein.informaNome(einstein.nome) + " tem " + einstein.informaIdade(einstein.idade) + " anos, em " + LocalDate.now().getYear());

        newton.CalculaIdade(LocalDate.now());
        System.out.println(newton.informaNome(newton.nome) + " tem " + newton.informaIdade(newton.idade) + " anos, em " + LocalDate.now().getYear());



    }
}
