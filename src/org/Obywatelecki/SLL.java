package org.Obywatelecki;

public class SLL<T> {

    public class Node<T> {

        T data;
        Node next;

        public T getData() {
            return data;
        }

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

    public void append(T newData) {
        Node ref = head;
        Node<T> newNode = new Node<>(newData);

        if (ref == null) {
            head = newNode;
        } else {
            while (ref.next != null) {
                ref = ref.next;
            }
            ref.next = newNode;
        }

    }

    public Node findData(T data) {
        Node ref = head;
        while (ref != null) {
            if (ref.data.equals(data)) {
                return ref;
            }
            ref = ref.next;
        }
        return null;
    }

    public Node findIndex(int i) {
        Node ref = head;
        int cnt = 0;
        while (ref != null) {
            if (cnt == i) {
                return ref;
            }
            cnt++;
            ref = ref.next;
        }
        return null;
    }

    public int getIndex(Node data) {
        Node ref = head;
        int cnt = 0;
        while (ref != null) {
            if (ref.data.equals(data)) {
                return cnt;
            }
            cnt++;
            ref = ref.next;
        }
        return cnt;
    }

    public void insert(Node item, T newData) {
        Node<T> newNode = new Node<>(newData);

        if (item == null) {
            newNode.next = head;
            head = newNode;
            return;
        }

        newNode.next = item.next;
        item.next = newNode;

    }

    public void delete(Node item) {
        if (head == null) {
            return;
        }

        if (item == null) {
            head = head.next;
            return;
        }

        if (item.next == null) {
            return;
        }

        item.next = item.next.next;
    }

    public void print() {
        Node ref = head;
        StringBuilder sb = new StringBuilder();

        while (ref != null) {
            if (ref.next != null) {
                sb.append(ref.getData()).append(", ");
            } else {
                sb.append(ref.getData());
            }

            ref = ref.next;
        }

        System.out.println(sb.toString());

    }

    public void moveDataToEnd(T data) {
        Node ref = head;
        Node myData = (findData(data));
        myData.next = null;

//        while (ref.next != null) {
//            ref = ref.next;
//        }
//        ref.next = myData;


//        lista 6-elementowa, znalezzc elemement i przeniesc go na koniec
//               cut(c) ma byc: ABCDEF --> ABDEFC
    }
}

