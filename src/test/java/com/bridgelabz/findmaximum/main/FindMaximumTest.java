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
//===================================INTEGER===================================================
    @Test
    public void passArrayOfInt_KeepFindingMax_ShouldReturnMaxNumber() {
        Integer[] array = {1, 5, 3};
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 5, 3};
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[0],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 40, 3};
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfInt_PutMaxNumberAtThirdPosition_ShouldReturnMaxNumber() {
        Integer[] array = {10, 40, 100};
        Integer value = (Integer) obj.giveMax(array);
        Assert.assertEquals(array[2],value);
    }
//===============================FLOAT============================================
    @Test
    public void passArrayOfFloat_KeepFindingMax_ShouldReturnMaxNumber() {
        Float[] array = {100F, 40F, 113F};
        Float value = (Float) obj.giveMax(array);
        Assert.assertEquals(array[2],value);
    }
    @Test
    public void passArrayOfFloat_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Float[] array = {100F, 40F, 14F};
        Float value = (Float) obj.giveMax(array);
        Assert.assertEquals(array[0],value);
    }
    @Test
    public void passArrayOfFloat_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Float[] array = {100F, 400F, 14F};
        Float value = (Float) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }

//=======================================STRING=====================================================
    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtFirstPosition_ShouldReturnMaxString() {
        String[] array = {"mathematics", "turbine", "camera"};
        String value = (String) obj.giveMax(array);
        Assert.assertEquals(array[1],value);
    }
    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtSecondPosition_ShouldReturnMaxString() {
        String[] array = {"a", "c", "b"};
        String value = (String) obj.giveMax(array);
        Assert.assertEquals(array[1], value);
        System.out.println();
    }
    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtThirdPosition_ShouldReturnMaxString() {
        String[] array = {"aim", "ball", "zampya"};
        String value = (String) obj.giveMax(array);
        Assert.assertEquals(array[2],value);
    }

}
