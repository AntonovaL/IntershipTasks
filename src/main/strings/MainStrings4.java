package main.strings;

import test.strings.StringOperations;

public class MainStrings4 {
    public static void main(String[] args) {
        String a = "Internet";
        String b = "Tine Rent";
        boolean check= StringOperations.isAnagram(a,b);
        if (check){
            System.out.println(b+" is anagram of "+a);
        }
        else{
            System.out.println(b+" isn't anagram of "+a);
        }
    }
}
