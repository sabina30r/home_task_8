package nix.edu.algorithm.impl;

import nix.edu.algorithm.Sorting;

public class MergeSorting implements Sorting {

    @Override
    public int[] sort(int[] array) {
        mergeSort(array);
        return array;
    }

    private void mergeSort(int[] array) {
        if (array.length == 1) {
            return;
        }
        int[] leftArr = new int[array.length / 2];
        System.arraycopy(array, 0, leftArr, 0, leftArr.length);

        int[] rightArr = new int[array.length - leftArr.length];
        System.arraycopy(array, leftArr.length, rightArr, 0, rightArr.length);
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, array);
    }

    private void merge(int[] left, int[] right, int[] array) {
        int[] tmpArray = new int[array.length];
        int leftPos = 0;
        int rightPos = 0;
        int tmpPos = 0;

        while (leftPos < left.length && rightPos < right.length) {
            if (left[leftPos] < right[rightPos]) {
                tmpArray[tmpPos] = left[leftPos];
                leftPos++;
            } else {
                tmpArray[tmpPos] = right[rightPos];
                rightPos++;
            }
            tmpPos++;
        }
        while (leftPos < left.length) {
            tmpArray[tmpPos] = left[leftPos];
            tmpPos++;
            leftPos++;
        }
        while (rightPos < right.length) {
            tmpArray[tmpPos] = right[rightPos];
            tmpPos++;
            rightPos++;
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = tmpArray[i];
        }
    }
}
