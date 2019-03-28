package main.strings;

import io.tools.Getter;
import io.tools.Printer;
import test.strings.StringOperations;

public class MainString3 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        String name=getter.getString("Your name: ");
        char[] initials= StringOperations.getInitials(name);
        Printer printer=new Printer(System.out,". ");
        printer.printArray(initials,"Your initials: ");
    }
}
