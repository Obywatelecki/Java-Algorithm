package org.Obywatelecki;

public class SLL<T> {

    class Node<T> {

        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    public SLL() {
        this.head = null;
    }

    public int count() {
        int cnt = 0;
        Node ref = head;

        while (ref != null) {
            cnt++;
            ref = ref.next;
        }

        return cnt;
    }

    public void append() {

    }
}
