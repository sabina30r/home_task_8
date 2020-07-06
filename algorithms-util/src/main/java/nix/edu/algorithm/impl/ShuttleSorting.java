package nix.edu.algorithm.impl;

import nix.edu.algorithm.Sorting;

public class ShuttleSorting implements Sorting {

    @Override
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int j = i-1;
                int tmp = array[i + 1];
                array[i + 1] = array[i];
                while (j >= 0 && array[j] > tmp) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = tmp;
            }
        }
        return array;
    }
}
