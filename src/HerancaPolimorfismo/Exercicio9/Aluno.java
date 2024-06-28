package HerancaPolimorfismo.Exercicio9;

public class Aluno extends Pessoa {
    String curso;

    public Aluno(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    @Override
    public String mostraDados() {
        return "\n" + "Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Curso: " + curso;
    }

}
