package org.Obywatelecki;

import java.util.Arrays;

public class Sudoku {

    int cnt = 0;

    public int getCnt() {
        return cnt;
    }

    static int[] sq = {
            0, 0, 1, 1,
            0, 0, 1, 1,
            2, 2, 3, 3,
            2, 2, 3, 3,
    };

    static int[] lines = {
            0, 0, 0, 0,
            1, 1, 1, 1,
            2, 2, 2, 2,
            3, 3, 3, 3,
    };

    static int[] cols = {
            0, 1, 2, 3,
            0, 1, 2, 3,
            0, 1, 2, 3,
            0, 1, 2, 3,
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
        for (int i = 0; i <= 15; ++i) {
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
        for (int i = 0; i <= 15; ++i) {
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
        for (int i = 0; i <= 15; ++i) {
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

        for (idx = 0; idx < 16; ++idx) {
            if (board[idx] == null) {
                break;
            }
        }

        if (idx == 16) {
            System.out.println(printBoard(board));
            return false;
        }

        for (int val = 1; val <= 4; ++val) {
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

