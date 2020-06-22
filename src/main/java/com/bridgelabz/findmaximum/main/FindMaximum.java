package com.bridgelabz.findmaximum.main;

public class FindMaximum<E extends Comparable> {
    /**
     * finding max using comparable and Optional it give max so no need to use sort
     *
     * @param num
     * @param <E>
     * @return
     */
    public <E extends Comparable> E giveMax(E... num) {
        E max = (E) num[0];
        for (int element = 0; element < num.length; element++) {
            if (num[element].compareTo(max) > 0) {
                max = num[element];
            }
        }
        return printMax(max);
    }

    /**
     * To Display in stdout
     *
     * @param max
     * @param <E>
     * @return
     */
    public <E> E printMax(E max) {
        System.out.println("MaxValue=" + max);
        return max;
    }
}
