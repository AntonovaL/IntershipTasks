package main.arrays;

import test.arrays.MultTable;
import io.tools.Getter;
import io.tools.Printer;

public class MainArrays3 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        int size=getter.getSize("Input multiplication table size: ");
        MultTable table=new MultTable(size);
        Printer print=new Printer(System.out, "\t");
        print.printTable(table.getTable(),size);
    }
}
