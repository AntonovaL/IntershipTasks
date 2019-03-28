package main.strings;

import io.tools.Getter;
import test.strings.StringOperations;

public class MainStrings5 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        String s=getter.getString("Input the number in hexadecimal notation: ");
        int n= StringOperations.getDecimalFromHex(s);
        System.out.println("In decimal notation: "+n);
    }
}
