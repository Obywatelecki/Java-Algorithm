package org.Obywatelecki;

import org.junit.Assert;
import org.junit.Test;

public class RecursionBasic {

    public int calc(int a, int b) {
        if (a == b) {
            return b;
        }
        return calc(a + 1, b) + a;
    }

    public int calc2(int a, int b) {
        if (a == b) {
            return b;
        }
        return calc2(a, ((a + b) / 2)) + calc2(((a + b) / 2) + 1, b);
    }

    @Test
    public void test01() {
        Assert.assertEquals(18, calc(3, 6));
        Assert.assertEquals(25, calc(3, 7));
        Assert.assertEquals(18, calc2(3, 6));
        Assert.assertEquals(25, calc2(3, 7));
        Assert.assertEquals(3, calc2(3, 3));
        Assert.assertEquals(7, calc2(3, 4));
    }
}
