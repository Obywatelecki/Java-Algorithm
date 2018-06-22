package org.Obywatelecki;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball {

    public class Field implements Comparable {

        private int x;
        private int y;
        private int value;

        public Field(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Field{" +
                    "x=" + x +
                    ", y=" + y +
                    ", value=" + value +
                    "]\n";
        }

        @Override
        public int compareTo(Object o) {
            return this.value - ((Field) o).value;
        }
    }

    private int[][] board2D = new int[3][3];
    private int[][] result;
    private List<Field> sortedFields;

    public Ball() {
    }

    public Ball(int[][] data) {
        this.board2D = data;
        result = new int[board2D.length][board2D.length];
    }

    public List<Field> getSortedFields() {
        return sortedFields;
    }

    public int[] toOneDim(int[][] board2D) {
        int[] board1D = new int[board2D.length * board2D.length];
        for (int i = 0; i < board2D.length; i++) {
            for (int s = 0; s < board2D.length; s++) {
                board1D[(i * board2D.length) + s] = board2D[i][s];
            }
        }
        return board1D;
    }

    public void sortBoardData() {
        sortedFields = new ArrayList<>();
        for (int x = 0; x < board2D.length; x++) {
            for (int y = 0; y < board2D[0].length; y++) {
                Field field = new Field(x, y, board2D[x][y]);
                sortedFields.add(field);
            }
        }
        Collections.sort(sortedFields);
    }

    public void go() {
        for (Field item : sortedFields) {

        }
    }

}
