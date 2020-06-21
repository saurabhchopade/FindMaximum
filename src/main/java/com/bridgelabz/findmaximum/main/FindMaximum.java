package com.bridgelabz.findmaximum.main;
import java.lang.*;
public class FindMaximum <E>  {
    /**
     * ONE FUNCTION FOR ALL
     * @param array
     * @param <E>
     * @return
     */
    public < E extends Comparable> E giveMax(E[] array) {
        E max =array[0];
        for (E arrayElement : array) {
            if (arrayElement.compareTo(max) > 0)
                max = arrayElement;
        }
        return max;
    }
}
