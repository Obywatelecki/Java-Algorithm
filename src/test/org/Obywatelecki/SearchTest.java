package test.org.Obywatelecki;

import org.Obywatelecki.Search;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * Search Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 2, 2018</pre>
 */
public class SearchTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: fill()
     */
    @Test
    public void testFill() throws Exception {

        Search search = new Search();
        search.fill();
        System.out.println(search.toString());

    }

    /**
     * Method: find(int x)
     */
    @Test
    public void testFind() throws Exception {

        Search search = new Search();
        search.fill(1);
        search.fill(3);
        search.fill(9);
        search.fill(12);
        System.out.println(search.toString());

        Assert.assertEquals(0, search.find(1));
        Assert.assertEquals(3, search.find(12));
        Assert.assertEquals(-1, search.find(10));
        Assert.assertEquals(-1, search.find(-11));
        Assert.assertEquals(-1, search.find(100));
    }


    @Test
    public void testStupidFind() {

        //doesn't work so far :(

        Search search = new Search();
        search.fill(1);
        search.fill(3);
        search.fill(9);
        search.fill(12);
        System.out.println(search.toString());

        Assert.assertEquals(0, search.stupidFind(1));
        Assert.assertEquals(3, search.stupidFind(12));
        Assert.assertEquals(-1, search.stupidFind(10));
        Assert.assertEquals(-1, search.stupidFind(-11));
        Assert.assertEquals(-1, search.stupidFind(100));
    }
}
