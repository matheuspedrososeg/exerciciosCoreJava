package OOP.Exercicio1;

import OOP.Exercicio3.Universidade;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    String nome;
    int idade;
    LocalDate nascimento;

    Universidade universidade;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public Pessoa(String nome, LocalDate nascimento, Universidade universidade) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.universidade = universidade;
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

    public void ajustaDataDeNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }


}
