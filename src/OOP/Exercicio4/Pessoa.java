package OOP.Exercicio4;

public class Pessoa {

    String name;
    Universidade universidade;
    Departamento departamento;

    public Pessoa(String name, Universidade universidade) {
        this.name = name;
        this.universidade = universidade;
    }

    public Pessoa(String name, Universidade universidade, Departamento departamento) {
        this.name = name;
        this.universidade = universidade;
        this.departamento = departamento;
    }

    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public String getDepartamentoUniversidade() {
        return "Departamento: " + departamento + " \nUniversidade: " + universidade;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}
