package main.arrays;

import test.arrays.ArraysOperations;
import io.tools.Getter;

public class MainArrays45 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        int[] numbers=getter.getIntArray("Input numbers: ");
        double average= ArraysOperations.average(numbers);
        System.out.println("Average of numbers : "+average);
        double streamsAverage= ArraysOperations.averageWithStreams(numbers);
        System.out.println("Average of numbers with streams: "+streamsAverage);
    }
}
