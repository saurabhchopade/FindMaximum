package com.bridgelabz.findmaximum.main;

public class FindMaximum<E> {

    /**
     * For Standard Output
     *
     * @param max
     * @param <E>
     */
    public <E> void printMax(E max) {
        System.out.println("MaxValue=" + max);
    }

    /**
     * For Finding Max
     *
     * @param array
     * @param <E>
     * @return
     */
    public <E extends Comparable> E giveMax(E[] array) {
        E max = array[0];
        for (E arrayElement : array) {

            if (arrayElement.compareTo(max) > 0)
                max = arrayElement;
        }
        printMax(max);
        return max;
    }
}
