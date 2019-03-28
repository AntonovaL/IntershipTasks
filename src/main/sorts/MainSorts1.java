package main.sorts;
import io.tools.Getter;
import io.tools.Printer;
import sun.awt.windows.ThemeReader;
import test.sorts.ThreeNumber;

public class MainSorts1 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        int[] numbers=getter.getIntArray("Input a,b,c: ");
        ThreeNumber num=new ThreeNumber(numbers[0],numbers[1],numbers[2]);
        num.Sort();
        Printer pr=new Printer(System.out," ");
        System.out.println("Sorted:");
        pr.printArray(num.getNumbers());
    }
}
