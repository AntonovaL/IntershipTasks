package main.strings;

import test.strings.StringOperations;
import io.tools.Getter;
public class MainStrings4 {
    public static void main(String[] args) {
        //String a = "Internet";
        //String b = "Tine Rent";
        Getter getter=new Getter(System.in);
        String a=getter.getString("Input a world: ");
        String b=getter.getString("Supposed anagram: ");
        boolean check= StringOperations.isAnagram(a,b);
        if (check){
            System.out.println(b+"  anagram of "+a);
        }
        else{
            System.out.println(b+" not anagram of "+a);
        }
    }
}
