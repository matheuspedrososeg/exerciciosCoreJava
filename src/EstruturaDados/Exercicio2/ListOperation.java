package EstruturaDados.Exercicio2;


public class ListOperation<T> {

    private ListNode<T> inicio;


    public void add(T n) {
        ListNode node = new ListNode(n);
        this.inicio = node;
    }

    public void add(T n, T ant) {
        ListNode node = new ListNode(n);
        ListNode node1 = new ListNode(ant);
        node1.next = node;

    }


    public ListNode<T> getInicio() {
        return inicio;
    }

    public void setInicio(ListNode<T> inicio) {
        this.inicio = inicio;
    }
}


