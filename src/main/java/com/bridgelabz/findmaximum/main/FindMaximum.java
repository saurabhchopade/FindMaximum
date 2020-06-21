package com.bridgelabz.findmaximum.main;
import java.lang.*;
public class FindMaximum  {
    /**
     * Check Max integer Number from Array
     * @param array
     * @param <Integer>
     * @return
     */
    public <Integer extends Comparable> Integer giveMaxInteger(Integer[] array) {
        Integer max =array[0] ;
        for (Integer arrayElement : array) {
            if (arrayElement.compareTo(max) > 0)
                max = arrayElement;
        }
        return max;
    }

    /**
     * finding max value from float
     * @param array
     * @param <Float>
     * @return
     */
    public <Float extends Comparable> Float giveMaxFloat(Float[] array) {
        Float max =array[0];
        for (Float arrayElement : array) {
            if (arrayElement.compareTo(max) > 0)
                max = arrayElement;
        }
        return max;
    }
}
