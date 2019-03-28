package main.strings;
import io.tools.Getter;
import test.strings.StringOperations;

public class MainStrings2 {
    public static void main(String[] args){
        Getter getter=new Getter(System.in);
        char[] seq={'e','l','l'};
        String s=getter.getString("String: ");
        boolean check= StringOperations.isContain(s,seq);
        if (check){
            System.out.println("This string contain specified sequence of char ");
        }
        else{
            System.out.println("This string doesn't contain specified sequence of char ");
        }
    }
}
