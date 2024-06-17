package Arrays;

import java.util.ArrayList;

public class Ex3ArrayList {
    ArrayList<Integer> arrayList;
    int current;
    int maxElements;


    public Ex3ArrayList(int tamanho) {
        this.arrayList = new ArrayList<>(tamanho);
    }

    public int calculateAverage() {
        int s = 0 ;
        for (int i = 0; i < arrayList.size();  i++) {
            s += arrayList.get(i);

        }
        return s / arrayList.size();
    }
    public boolean add(int n) {
        boolean sucesso = false;
        for (int i = 0; i < this.arrayList.size(); i++) {
            if (this.arrayList.get(i) == 0) {
                this.arrayList.add(n);

            }
        }
        return sucesso = true;
    }

}
