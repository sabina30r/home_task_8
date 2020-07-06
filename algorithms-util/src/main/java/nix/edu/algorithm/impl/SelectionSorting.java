package nix.edu.algorithm.impl;

import nix.edu.algorithm.Sorting;

public class SelectionSorting implements Sorting {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
                if (array[j] < array[index])
                    index = j;

            int minNumber = array[index];
            array[index] = array[i];
            array[i] = minNumber;
        }
        return array;
    }
}
