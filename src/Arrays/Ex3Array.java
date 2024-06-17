package Arrays;

import java.lang.reflect.Array;

public class Ex3Array {
    int[] ints;
    int current;
    int maxElements;


    public Ex3Array(int tamanho) {
        this.ints = new int[tamanho];
    }

    public static void main(String[] args) {

    }
    public boolean add(int n) {
        boolean sucesso = false;
        for (int i = 0; i < this.ints.length; i++) {
            if (ints[i] == 0) {
                ints[i] = n;
            }
        }
        return true;
    }

    public int calculateAverage() {
        int media = this.ints.length;
        int s = 0;
        for (int i = 0; i < this.ints.length; i++) {
            s += this.ints[i];

        }
        return s / media;
    }

}



