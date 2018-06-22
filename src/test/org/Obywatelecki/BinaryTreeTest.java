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
    public void testContains() {

        BinaryTree bt = new BinaryTree();
        bt.add(10);
        bt.add(7);
        bt.add(13);
        bt.add(5);
        bt.add(2);
        bt.add(14);
        bt.add(11);

        Assert.assertTrue(bt.contains(10));
        Assert.assertTrue(bt.contains(5));
        Assert.assertTrue(bt.contains(2));

    }

    @Test
    public void testDelete() {

        BinaryTree bt = new BinaryTree();
        bt.add(10);
        bt.add(7);
        bt.add(13);
        bt.add(5);
        bt.add(2);
        bt.add(14);
        bt.add(11);

        bt.delete(10);
        bt.delete(11);
        bt.delete(5);

        Assert.assertFalse(bt.contains(10));
        Assert.assertFalse(bt.contains(11));
        Assert.assertFalse(bt.contains(5));
    }

    @Test
    public void printer() {

        BinaryTree bt = new BinaryTree();
        bt.add(10);
        bt.add(7);
        bt.add(13);
        bt.add(5);
        bt.add(2);
        bt.add(14);
        bt.add(11);

        bt.print();
    }
}
