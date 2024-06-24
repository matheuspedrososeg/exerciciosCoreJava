package OOP.Exercicio5;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Aluno {
    int firstGrade;
    int secondGrade;
    String name;

    ArrayList<Aluno> alunos = new ArrayList<>();

    public Aluno(String name, int firstGrade, int secondGrade) {
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
        this.name = name;
    }


    public ArrayList<Aluno> add(Aluno aluno) {
        try {
            this.alunos.add(aluno);
        } catch (InputMismatchException e) {
            e.getMessage();
        }
        return alunos;
    }

    public void informacoes() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i));
        }
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

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return alunos.toString();
    }

}