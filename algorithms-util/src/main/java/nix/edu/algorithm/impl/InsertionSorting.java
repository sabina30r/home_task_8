package nix.edu.algorithm.impl;

import nix.edu.algorithm.Sorting;

public class InsertionSorting implements Sorting {

    @Override
    public int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int numberToInsert = array[i];
            int compareIndex = i;
            while (compareIndex > 0 && array[compareIndex - 1] > numberToInsert) {
                array[compareIndex] = array[compareIndex - 1];
                compareIndex--;
            }
            array[compareIndex] = numberToInsert;
        }
        return array;
    }

}

