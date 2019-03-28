package main.arrays;
import test.arrays.ArraysOperations;
import io.tools.Getter;

public  class MainArrays2 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        int[] numbers=getter.getIntArray("Input numbers: ");
        int index= ArraysOperations.smallestDist(numbers);
        System.out.println("Smallest distanse is between numbers "+index+" and "+(index+1));
    }
}