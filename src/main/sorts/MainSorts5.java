package main.sorts;

import io.tools.Getter;
import test.arrays.ArraysOperations;

public class MainSorts5 {
    public static void main(String[] args) {
        Getter getter = new Getter(System.in);
        //int[] array1 = {3,4,5,6,7,8};
        //int[] array2 = {1,2,3};
        int[] array1=getter.getIntArray("Array1: ");
        int[] array2=getter.getIntArray("Array2: ");
        System.out.println("result array1 and array2: "+ ArraysOperations.bigger(array1,array2));
        System.out.println("result array1 and array1: "+ ArraysOperations.bigger(array1,array1));
        System.out.println("result array2 and array1: "+ ArraysOperations.bigger(array2,array1));

    }
}
