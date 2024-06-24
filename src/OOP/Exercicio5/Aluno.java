package OOP.Exercicio5;

public class Aluno {
    int firstGrade;
    int secondGrade;
    String name;


    public Aluno(String name, int firstGrade, int secondGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.name = name;
    }

    public int getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(int firstGrade) {
        this.firstGrade = firstGrade;
    }

    public int getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(int secondGrade) {
        this.secondGrade = secondGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;


    }

    @Override
    public String toString() {
        return this.name;
    }
}