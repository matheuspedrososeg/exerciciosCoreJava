package OOP.Exercicio4;

public class Departamento {

    String departamento;


    public Departamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return departamento;
    }

}
