package org.Obywatelecki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Search {

    List<Integer> arr;
    int N = 15;

    public Search() {
        arr = new ArrayList<>(N);
    }

    public void fill(int val) {
        arr.add(val);
    }

    public void fill() {
        for (int i = 0; i < N; ++i) {
            Random random = new Random();
            arr.add(random.nextInt(10));
        }

        Collections.sort(arr);
    }

    @Override
    public String toString() {
        return arr.toString();
    }

    public int find(int x) {

        int begin = 0;
        int end = arr.size() - 1;
        int idx;

        while (begin <= end) {
            int mid = (begin + end) / 2;

            if (arr.get(mid) < x) {
                begin = mid + 1;
            } else if (arr.get(mid) > x) {
                end = mid - 1;
            } else if (arr.get(mid).equals(x)) {
                idx = mid;
                return idx;
            }
        }
        return -1;
    }

    public int stupidFind(int x) {

        Random random = new Random();
        int cnt = 0;

        while (true) {

            System.out.println(cnt);

            if (x > arr.get(arr.size()-1)) {
                return -1;
            }

            if (x < arr.get(0)) {
                return -1;
            }

            int idx = random.nextInt(arr.size()-1);
            if (arr.get(idx).equals(x)) {
                return idx;
            }
            ++cnt;
        }

    }
}
