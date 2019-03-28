package main.arrays;
import test.arrays.ArraysOperations;
import io.tools.Getter;

public  class MainArrays1 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        char[] charArray=getter.getCharArray("Input digits: ");
        long sum= ArraysOperations.sumCharElements(charArray);
        System.out.println("Sum of your digits: "+sum);
    }
}
