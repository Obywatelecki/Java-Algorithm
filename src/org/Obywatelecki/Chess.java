package org.Obywatelecki;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chess {

    public List<int[]> movesOfTower(int[] position) {

        List<int[]> list = new ArrayList<>();
        final int[][] moves = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int dist = 8;

        for (int item[] : moves) {
            int[] currentPosition = position.clone();
            for (int i = 0; i < dist; ++i) {
                currentPosition[0] += item[0];
                currentPosition[1] += item[1];
                if (currentPosition[0] >= dist || currentPosition[1] >= dist) {
                    break;
                }
                if (currentPosition[0] < 0 || currentPosition[1] < 0) {
                    break;
                }
                list.add(currentPosition.clone());
            }
        }
        return list;
    }

    public void print(List<int[]> list) {
        for (int[] arr : list) {
            System.out.println(Arrays.toString(arr));
        }
    }

    @Test
    public void test01() {
        int[] position = {2, 4};
        print(movesOfTower(position));


    }
}
