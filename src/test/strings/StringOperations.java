package test.strings;
import java.util.Arrays;
public class StringOperations{
    public static char getChar(String s, int index){
        char ch=' ';
        try{
           ch=s.charAt(index);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
        return ch;
    }
    public static boolean isContain(String s,char[] chars){
        boolean answ=false;
        for(int i=0; i<s.length()-chars.length; i++){
            for (int j=0; j<chars.length; j++) {
                if (s.charAt(i+j)==chars[j]){
                    answ=true;
                }
                else {
                    answ = false;
                }
            }
            if (answ) return answ;
        }
        return answ;
    }

    public static boolean isAnagram(String str1, String str2) {
        boolean answ=false; String s1, s2;
        s1=str1.toLowerCase(); s2=str2.toLowerCase();
        s1=s1.replaceAll("\\s", "");s2=s2.replaceAll("\\s", "");
        char[] charArray1=s1.toCharArray(); char[] charArray2=s2.toCharArray();
        Arrays.sort(charArray1); Arrays.sort(charArray2);
        answ=Arrays.equals(charArray1, charArray2);
        return answ;
    }

    public static char[] getInitials(String s){
        char[] initials=new char[3];
        String[] sArray=new String[3];
        sArray=s.split(" ");
        initials[0]=sArray[0].charAt(0);
        initials[1]=sArray[1].charAt(0);
        initials[2]=sArray[2].charAt(0);
        return initials;
    }

    public static int getDecimalFromHex(String s){
        return Integer.parseInt(s, 16);
    }
}
