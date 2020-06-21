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
        Integer value = (Integer) obj.giveMaxInteger(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 5, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMaxInteger(array);
        Assert.assertEquals(array[0],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 40, 3};
        new FindMaximum();
        Integer value = (Integer) obj.giveMaxInteger(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtThirdPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 40, 100};
        new FindMaximum();
        Integer value = (Integer) obj.giveMaxInteger(array);
        Assert.assertEquals(array[2],value);
    }

    @Test
    public void passArrayOfFloat_KeepFindingMax_ShouldReturnMaxNumber() {
        Float[] array = {100F, 40F, 113F};
        new FindMaximum();
        Float value = (Float) obj.giveMaxFloat(array);
        Assert.assertEquals(array[2],value);
    }

    @Test
    public void passArrayOfFloat_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Float[] array = {100F, 40F, 14F};
        new FindMaximum();
        Float value = (Float) obj.giveMaxFloat(array);
        Assert.assertEquals(array[0],value);
    }

    @Test
    public void passArrayOfFloat_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Float[] array = {100F, 400F, 14F};
        new FindMaximum();
        Float value = (Float) obj.giveMaxFloat(array);
        Assert.assertEquals(array[1],value);
    }


    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtFirstPosition_ShouldReturnMaxString() {
        String[] array = {"mathematics", "turbine", "camera"};
        new FindMaximum();
        String value = (String) obj.giveMaxFloat(array);
        Assert.assertEquals(array[1],value);
    }

    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtSecondPosition_ShouldReturnMaxString() {
        String[] array = {"a", "c", "b"};
        new FindMaximum();
        String value = (String) obj.giveMaxFloat(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtThirdPosition_ShouldReturnMaxString() {
        String[] array = {"aim", "ball", "zampya"};
        new FindMaximum();
        String value = (String) obj.giveMaxFloat(array);
        Assert.assertEquals(array[2],value);
    }
}
