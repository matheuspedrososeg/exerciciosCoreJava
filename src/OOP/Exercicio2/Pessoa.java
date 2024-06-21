package OOP.Exercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Pessoa {
    String nome;
    int idade;
    LocalDate nascimento;


    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public void CalculaIdade(LocalDate dataAtual) {
        this.idade = (int) ChronoUnit.YEARS.between(this.nascimento, dataAtual);
    }

    public int informaIdade(int idade) {
        return idade;
    }

    public String informaNome(String nome) {
        return nome;
    }

    public Pessoa(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}