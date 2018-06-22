package org.Obywatelecki;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class Sort {

    public int[] sort(int[] arr) {

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length - 1; ++j) {
                if (arr[i] < arr[j]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }

    public int[] randomGen(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = random.nextInt(100);
        }

        return arr;
    }

    public boolean isSorted(int[] arr) {   /// nie dziala :(

        boolean sorted = false;

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                if (arr[i] < arr[j]) {
                    sorted = true;
                } else {
                    sorted = false;
                }
            }
        }
        return sorted;
    }

    @Test
    public void test01() {

        int[] arr = new int[7];

        System.out.println(Arrays.toString(randomGen(arr)));
        System.out.println(isSorted(arr));
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(isSorted(arr));
    }

}
