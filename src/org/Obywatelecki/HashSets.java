package org.Obywatelecki;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashSets<T> {

    T data;
    ArrayList<LinkedList<T>> vertical;
    int N = 8;

    public HashSets() {
        vertical = new ArrayList<>(N);


        for (int i = 0; i < N; ++i) {
            LinkedList<T> horizontal = new LinkedList<>();
            vertical.add(i, horizontal);
        }
    }

    public void add(T data) {
        int idx = data.hashCode() & (N - 1);
        LinkedList<T> hlist = vertical.get(idx);
        if (!hlist.contains(data)) {
            hlist.add(data);
        }
    }

    public boolean find(T data) {
        int idx = data.hashCode() & (N - 1);
        LinkedList<T> hlist = vertical.get(idx);
        return hlist.contains(data);
    }

    public void howMany() {

        for (LinkedList<T> list : vertical) {
            System.out.println(list.size());
        }

    }

    @Override
    public String toString() {
        return vertical.toString();
    }

}
