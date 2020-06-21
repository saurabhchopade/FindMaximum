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
    public void passArrayOfInt_KeepFindingMax_ShouldReturnMaxNumber() {
        Integer[] array = {1, 5, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 5, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[0],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 40, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
}
