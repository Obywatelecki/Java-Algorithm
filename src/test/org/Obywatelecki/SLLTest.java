package test.org.Obywatelecki;

import org.Obywatelecki.SLL;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * SLL Tester.
 *
 * @author <Obywatelecki>
 * @version 1.0
 * @since <pre>maj 12, 2018</pre>
 */
public class SLLTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void counterNoValues() {
        SLL<Integer> sll = new SLL<>();
        Assert.assertEquals(0, sll.count());
    }

    @Test
    public void appendOneValue() {

        SLL<Integer> sll = new SLL<>();
        Assert.assertEquals(0, sll.count());
        sll.append(11);
    }

    @Test
    public void appendTwoValues() {
        SLL<Integer> sll = new SLL<>();
        Assert.assertEquals(0, sll.count());
        sll.append(11);
        Assert.assertEquals(1, sll.count());
        sll.append(12);
        Assert.assertEquals(2, sll.count());

    }

    @Test
    public void findOneValue() {
        SLL<Integer> sll = new SLL<>();
        sll.append(11);
        Assert.assertNull(sll.findData(1));
        Assert.assertNotNull(sll.findData(11));

    }

    @Test
    public void findTwoValues() {
        SLL<Integer> sll = new SLL<>();
        sll.append(11);
        Assert.assertNull(sll.findData(1));
        Assert.assertNotNull(sll.findData(11));
        sll.append(15);
        Assert.assertNotNull(sll.findData(15));
    }

    @Test
    public void findIndex() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.append("test");
        Assert.assertEquals("tomek", sll.findIndex(0).getData());
        Assert.assertEquals("ada", sll.findIndex(1).getData());
        Assert.assertNotEquals("dupa", sll.findIndex(2).getData());
    }

    @Test
    public void insterter() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.insert(null, "test");
        Assert.assertEquals("test", sll.findIndex(0).getData());
    }

    @Test
    public void deleter_zero() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.append("test");
        sll.delete(null);
        Assert.assertNotEquals("tomek",sll.findIndex(0).getData());
    }

    @Test
    public void deleter_inner() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.append("test");
        sll.delete(sll.findIndex(0));
        Assert.assertNotEquals("ada",sll.findIndex(1).getData());
    }

    @Test
    public void deleter_last() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.append("test");
        sll.delete(sll.findIndex(1));
        Assert.assertNotEquals("test",sll.findIndex(1).getData());
    }

    @Test
    public void replacer() {
        SLL<String> sll = new SLL<>();
        sll.append("tomek");
        sll.append("ada");
        sll.append("test");
    }

} 
