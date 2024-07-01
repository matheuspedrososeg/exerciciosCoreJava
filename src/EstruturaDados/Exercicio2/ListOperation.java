package EstruturaDados.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListOperation<T> {

    private ListNode<T> inicio;

    public void size() {
    }

    public void add(T n) {
        ListNode node = new ListNode(n);
        this.inicio = node;
    }

    public void add(T n, T ant) {
        ListNode node = new ListNode(n);
        ListNode node1 = new ListNode(ant);
        node1.next = node;

    }

    public ListNode remove() {
        return null;
    }

    public void print() {

    }
}


