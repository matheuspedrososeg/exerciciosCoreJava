package EstruturaDados.Exercicio2;

import java.awt.*;

public class ListNode<T> {

    T nome;
    ListNode next;

    ListNode current;


    public ListNode(T nome) {
        this.nome = nome;
    }

    public ListNode(T nome, ListNode next) {
        this.nome = nome;
        this.next = next;
    }

    public T getNome() {
        return nome;
    }

    public void setNome(T nome) {
        this.nome = nome;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getCurrent() {
        return current;
    }

    public void setCurrent(ListNode current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "nome=" + nome +
                ", next=" + next +
                ", current=" + current +
                '}';
    }
}
