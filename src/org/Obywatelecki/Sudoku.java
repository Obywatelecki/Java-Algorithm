package org.Obywatelecki;

import java.util.Arrays;

public class Sudoku {

    int cnt = 0;

    public int getCnt() {
        return cnt;
    }

    static int[] sq = {
            0, 0, 0, 1, 1, 1, 2, 2, 2,
            0, 0, 0, 1, 1, 1, 2, 2, 2,
            0, 0, 0, 1, 1, 1, 2, 2, 2,
            3, 3, 3, 4, 4, 4, 5, 5, 5,
            3, 3, 3, 4, 4, 4, 5, 5, 5,
            3, 3, 3, 4, 4, 4, 5, 5, 5,
            6, 6, 6, 7, 7, 7, 8, 8, 8,
            6, 6, 6, 7, 7, 7, 8, 8, 8,
            6, 6, 6, 7, 7, 7, 8, 8, 8,
    };

    static int[] lines = {
            0, 0, 0, 0, 0, 0, 0, 0, 0,
            1, 1, 1, 1, 1, 1, 1, 1, 1,
            2, 2, 2, 2, 2, 2, 2, 2, 2,
            3, 3, 3, 3, 3, 3, 3, 3, 3,
            4, 4, 4, 4, 4, 4, 4, 4, 4,
            5, 5, 5, 5, 5, 5, 5, 5, 5,
            6, 6, 6, 6, 6, 6, 6, 6, 6,
            7, 7, 7, 7, 7, 7, 7, 7, 7,
            8, 8, 8, 8, 8, 8, 8, 8, 8,
    };

    static int[] cols = {
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,
            0, 1, 2, 3, 4, 5, 6, 7, 8,

    };

    public boolean minCheck(int N, int val, int[] tab, Integer[] board) {
        Integer element = tab[N];

        for (int i = 0; i <= 15; ++i) {
            if (tab[i] != element) {
                continue;
            }
            if (board[i] == null) {
                continue;
            }
            if (board[i].equals(val)) {
                return false;
            }
        }

        return true;
    }

//    public boolean check2(int N, int val, Integer[] board) {
//        if (
//                minCheck(N, val, sq, board) &&
//                minCheck(N, val, lines, board) &&
//                minCheck(N, val, cols, board)
//                )
//        }
//
//        return true;
//    }

    public boolean check(int N, int val, Integer[] board) {
        Integer mySq = sq[N];
        for (int i = 0; i <= 80; ++i) {
            if (sq[i] != mySq) {
                continue;
            }
            if (board[i] == null) {
                continue;
            }
            if (board[i].equals(val)) {
                return false;
            }
        }

        Integer myLine = lines[N];
        for (int i = 0; i <= 80; ++i) {
            if (lines[i] != myLine) {
                continue;
            }
            if (board[i] == null) {
                continue;
            }
            if (board[i].equals(val)) {
                return false;
            }
        }

        Integer myCol = cols[N];
        for (int i = 0; i <= 80; ++i) {
            if (cols[i] != myCol) {
                continue;
            }
            if (board[i] == null) {
                continue;
            }
            if (board[i].equals(val)) {
                return false;
            }
        }

        return true;

    }

    public boolean makeSudoku(Integer[] orgBoard) {
        Integer[] board = orgBoard.clone();

        int idx = 0;

        for (idx = 0; idx <= 80; ++idx) {
            if (board[idx] == null) {
                break;
            }
        }

        if (idx == 80) {
            System.out.println(printBoard(board));
            return false;
        }

        for (int val = 1; val <= 9; ++val) {
            if (check(idx, val, board)) {
                ++cnt;
                board[idx] = val;
                makeSudoku(board);
            }
        }

        return true;

    }

    public String printBoard(Integer[] board) {
        return Arrays.toString(board);
    }


}

