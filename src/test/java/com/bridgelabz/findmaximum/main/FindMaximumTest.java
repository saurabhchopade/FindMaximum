package com.bridgelabz.findmaximum.main;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FindMaximumTest {
    FindMaximum obj;

    @Before
    public void init() {
        obj = new FindMaximum();
    }

    @Test
    public void passArrayOfInt_KeepFindingMaxatLast_ShouldReturnMaxNumber() {
        Integer[] array = {1, 5, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
}
