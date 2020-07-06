package nix.edu;

import nix.edu.algorithm.impl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        int numberOfTests = 10;
        for (int testNumber = 1; testNumber <= numberOfTests; testNumber++) {
            int[] ints = new int[100000];
            int index = 0;
            for (int i = 0; i < ints.length; i++) {
                index = (int) Math.floor(Math.random() * 100000);
                ints[i] = index;
            }

            List<Integer> listOfInts = new ArrayList<Integer>(ints.length);
            for (int k : ints) {
                listOfInts.add(k);
            }
            try {
                logger.info("Test number " + testNumber);
                logger.info("Bubble Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new BubbleSorting()));
                logger.info("Selection Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new SelectionSorting()));
                logger.info("Insertion Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new InsertionSorting()));
                logger.info("Shuttle Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new ShuttleSorting()));
                logger.info("Shell Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new ShellSorting()));
                logger.info("Merge Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new MergeSorting()));
                logger.info("Quick Sorting time in ns: " + RuntimeCounter.countAlgorithmRuntime(ints, new QuickSorting()));
                logger.info("Collection.sort() time in ns: " + RuntimeCounter.countCollectionSortRuntime(listOfInts) + "\n");
            } catch (Exception e) {
                logger.error("Unknown error", e);
            }

        }
    }

}
