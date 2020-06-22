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

    //    //===================================INTEGER===================================================
    @Test
    public void passArrayOfInt_KeepFindingMax_ShouldReturnMaxNumber() {
        Assert.assertEquals(5, obj.giveMax(1, 5, 3));
    }

    @Test
    public void passArrayOfInt_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Assert.assertEquals(10, obj.giveMax(10, 5, 3));
    }

    @Test
    public void passArrayOfInt_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Assert.assertEquals(40, obj.giveMax(10, 40, 3));
    }

    @Test
    public void passArrayOfInt_PutMaxNumberAtThirdPosition_ShouldReturnMaxNumber() {
        Assert.assertEquals(100, obj.giveMax(10, 40, 100));
    }

    ////===============================FLOAT============================================
    @Test
    public void passArrayOfFloat_KeepFindingMax_ShouldReturnMaxNumber() {
        Assert.assertEquals(113F, obj.giveMax(100F, 40F, 113F));
    }

    @Test
    public void passArrayOfFloat_PutMaxNumberAtFirstPosition_ShouldReturnMaxNumber() {
        Assert.assertEquals(100F, obj.giveMax(100F, 40F, 14F));
    }

    @Test
    public void passArrayOfFloat_PutMaxNumberAtSecondPosition_ShouldReturnMaxNumber() {
        Assert.assertEquals(400F, obj.giveMax(100F, 400F, 14F));

    }

    ////=======================================STRING=====================================================
    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtFirstPosition_ShouldReturnMaxString() {
        Assert.assertEquals("turbine", obj.giveMax("mathematics", "turbine", "camera"));
    }

    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtSecondPosition_ShouldReturnMaxString() {
        Assert.assertEquals("c", obj.giveMax("a", "c", "b"));
    }

    @Test
    public void passArrayOfString_PutMaxStringlexicographicallyAtThirdPosition_ShouldReturnMaxString() {
        Assert.assertEquals("zampya", obj.giveMax("aim", "ball", "zampya"));
    }

    //=============================More Than Tree Element================================
    @Test
    public void passArrayOfInt_MoreNumber_ShouldReturnMaxNumber() {
        Assert.assertEquals(3, obj.giveMax(1, 2, 3, 0, 1, 1));
    }
}
