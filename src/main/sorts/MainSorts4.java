package main.sorts;
import io.tools.Getter;
import io.tools.Printer;
import test.arrays.ArraysOperations;

public class MainSorts4 {
    public static void main(String[] args) {
        Getter getter = new Getter(System.in);
        int[] numbers = getter.getIntArray("Input numbers: ");
        ArraysOperations.sort(numbers);
        System.out.println("Sorted: ");
        Printer pr=new Printer(System.out, " ");
        pr.printArray(numbers);
    }
}
