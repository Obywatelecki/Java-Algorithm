package test.org.Obywatelecki; 

import org.Obywatelecki.HashSets;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Random;

/** 
* HashSets Tester. 
* 
* @author <Authors name> 
* @since <pre>cze 2, 2018</pre> 
* @version 1.0 
*/ 
public class HashSetsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(T data) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    HashSets<Integer> hashSets = new HashSets<>();
    hashSets.add(2);
    hashSets.add(500);
    System.out.println(hashSets.toString());
}


    @Test
    public void find() {
        HashSets<Integer> hashSets = new HashSets<>();
        hashSets.add(2);
        hashSets.add(500);

        Assert.assertTrue(hashSets.find(2));
        Assert.assertFalse(hashSets.find(100));
    }

    @Test
    public void howMany() {

        HashSets<Integer> hashSets = new HashSets<>();
        Random random = new Random();

        for (int i = 0; i < 1024; ++i) {
            System.out.println("Adding: " + i);
            hashSets.add(random.nextInt(1000));
        }

        System.out.println(hashSets.toString());
        hashSets.howMany();
    }
}
