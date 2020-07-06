package nix.edu;

import nix.edu.algorithm.Sorting;

import java.util.Collections;
import java.util.List;

public class RuntimeCounter {

    public static long countAlgorithmRuntime(int[] array, Sorting algorithm) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long countCollectionSortRuntime(List<Integer> list){
        long startTime = System.nanoTime();
        Collections.sort(list);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
