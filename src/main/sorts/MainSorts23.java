package main.sorts;

import io.tools.Getter;
import test.arrays.ArraysOperations;

public class MainSorts23 {
    public static void main(String[] args) {
        Getter getter = new Getter(System.in);
        int[] numbers = getter.getIntArray("Input numbers: ");
        int max = ArraysOperations.max(numbers);
        int streamsMax= ArraysOperations.maxWithStreams(numbers);
        System.out.println("Max: " + max);
        System.out.println("Max with streams: "+ streamsMax);
    }
}
