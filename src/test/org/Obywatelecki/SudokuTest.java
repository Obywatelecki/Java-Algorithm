package test.org.Obywatelecki;

import org.Obywatelecki.Sudoku;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.stream.StreamSupport;

/**
 * Sudoku Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 9, 2018</pre>
 */
public class SudokuTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: check(int N, int val, int[] board)
     */
    @Test
    public void testCheck() throws Exception {

        Sudoku sudoku = new Sudoku();

        Integer[] board = {
                null, null, 1, null,
                4, null, null, null,
                null, null, null, 2,
                null, 3, null, null,
        };

        Assert.assertFalse(sudoku.check(10, 2, board));
        Assert.assertFalse(sudoku.check(0, 1, board));
        Assert.assertFalse(sudoku.check(0, 4, board));

    }


    @Test
    public void makeSudoku() {

        Sudoku sudoku = new Sudoku();

        Integer[] board = {
                null, null, 1, null,
                4, null, null, null,
                null, null, null, 2,
                null, 3, null, null,
        };
        Integer[] board2 = {
                null, null, null, null,
                null, null, null, null,
                null, null, null, null,
                null, null, null, null,
        };

        System.out.println(sudoku.printBoard(board));
        System.out.println(sudoku.makeSudoku(board));
        System.out.println(sudoku.getCnt());
    }

}
