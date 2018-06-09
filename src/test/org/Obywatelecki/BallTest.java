package test.org.Obywatelecki;

import org.Obywatelecki.Ball;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Ball Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>maj 26, 2018</pre>
 */
public class BallTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void getSortedFields() {
    }

    @Test
    public void toOneDim() {
    }

    @Test
    public void sortBoardData() {
        int[][] board2D = {{6, 2, 1}, {5, 1, 3}, {4, 2, 0}};

        Ball ball = new Ball(board2D);
        ball.sortBoardData();
        System.out.println(ball.getSortedFields());
    }

    @Test
    public void go() {
    }
}
