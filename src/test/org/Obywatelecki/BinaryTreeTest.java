package test.org.Obywatelecki;

import org.Obywatelecki.BinaryTree;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * BinaryTree Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 21, 2018</pre>
 */
public class BinaryTreeTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: add(int data)
     */
    @Test
    public void testAdd() throws Exception {

        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(4);
        bt.add(2);

    }


    /**
     * Method: addHelper(Node current, int value)
     */

    @Test
    public void contains() {

        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(4);
        bt.add(2);

        Assert.assertTrue(bt.contains(3));
        Assert.assertTrue(bt.contains(4));
        Assert.assertFalse(bt.contains(10));

    }

    @Test
    public void delete() {

        BinaryTree bt = new BinaryTree();
        bt.add(3);
        bt.add(4);
        bt.add(2);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(11);

        bt.delete(3);
        bt.delete(11);
        bt.delete(4);

        Assert.assertFalse(bt.contains(3));
        Assert.assertFalse(bt.contains(11));
        Assert.assertFalse(bt.contains(4));
    }
}
