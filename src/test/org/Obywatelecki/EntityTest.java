package test.org.Obywatelecki;

import org.Obywatelecki.Entity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * Entity Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>cze 2, 2018</pre>
 */
public class EntityTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: hashCode()
     */
    @Test
    public void testHashCode() throws Exception {

        Entity entity1 = new Entity(27, "Tomek", "male");
        Entity entity2 = new Entity(27, "tomek", "male");

        Assert.assertNotEquals(entity1.hashCode(),entity2.hashCode());

    }


} 
