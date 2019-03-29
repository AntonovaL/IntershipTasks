package main.strings;
import io.tools.Getter;
import test.strings.StringOperations;

public class MainStrings1 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        String s=getter.getString("Input words: ");
        int index=getter.getSize("Index: ");
        char res= StringOperations.getChar(s,index);
        System.out.println("Char at "+ index+" position is "+res);
    }
}
