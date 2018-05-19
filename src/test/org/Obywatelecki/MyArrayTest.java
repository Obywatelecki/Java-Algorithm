package test.org.Obywatelecki;

import org.Obywatelecki.MyArray;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * MyArray Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>maj 19, 2018</pre>
 */
public class MyArrayTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setResizeValue(int resizeValue)
     */
    @Test
    public void appendTest() throws Exception {

        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(2);
        myArray.append(3);
        myArray.append(100);
        myArray.append(5);
        myArray.append(10);

        Assert.assertEquals(2, (int) myArray.getData(0));
        Assert.assertEquals(3, (int) myArray.getData(1));
        Assert.assertEquals(10, (int) myArray.getData(4));
    }

    @Test
    public void insertTest() throws Exception {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(2);
        myArray.append(3);
        myArray.insert(1,5);
        myArray.append(4);

        Assert.assertEquals(2, (int) myArray.getData(0));
        Assert.assertEquals(5, (int) myArray.getData(1));
        Assert.assertEquals(4, (int) myArray.getData(3));
    }

    @Test
    public void deleteTest() throws Exception {
        MyArray<Integer> myArray = new MyArray<>();
        myArray.append(2);
        myArray.append(3);
        myArray.delete(1);

        Assert.assertNull(myArray.getData(2));
        Assert.assertNotNull(myArray.getData(0));

    }

    @Deprecated
    public void uberTest() throws Exception {
        MyArray<Integer> myArray = new MyArray<>();

        for (int i = 0; i < 1000000; ++i) {
            myArray.append(i);
            if (i%10000 == 0) {
                System.out.println(i);
            }
        }

    }
} 
