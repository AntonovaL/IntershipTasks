package io.tools;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Getter {
        //private InputStream is;
        private  Scanner sc;
        public Getter(InputStream is){
            sc=new Scanner(is);
        }
        public int getSize(String comment){
            int n=1;
            if (comment!=null){
                System.out.print(comment);
            }
            //try(Scanner sc=new Scanner(is)){
                n=sc.nextInt();
                if (n<1){
                    System.out.println("Size can't be less or equal null");
                }
            //}
            return n;
        }
        public char[] getCharArray(String comment){
            if (comment!=null){
                System.out.print(comment);
            }
            LinkedList<Character> lc=getCharList();
            char[] array=new char[lc.size()];
            for(int i=0; i<lc.size(); i++){
                array[i]=lc.get(i);
            }
            return array;
        }

        private LinkedList<Character> getCharList(){
            String[] chars;
            LinkedList<Character> result=new LinkedList<>();
            //try(Scanner sc=new Scanner(is)){
                chars=sc.nextLine().split(" ");
                for(String ch:chars){
                    result.add(ch.charAt(0));
                }
            //}
            return result;
        }

        public int[] getIntArray(String comment){
            if (comment!=null){
                System.out.print(comment);
            }
            LinkedList<Integer> li=getIntList();
            int[] array=new int[li.size()];
            for (int i=0;i<li.size();i++){
                array[i]=li.get(i);
            }
            return array;
        }

        private LinkedList<Integer> getIntList(){
            String[] chars;
            LinkedList<Integer> result=new LinkedList<>();
            //try(Scanner sc=new Scanner(is)){
                chars = sc.nextLine().split(" ");
                for(String ch:chars){
                    result.add(Integer.valueOf(ch));
                }
            //}
            return result;
        }

        public String getString(String comment){
            if (comment!=null){
                System.out.print(comment);
            }
            String res;
            //try(Scanner sc=new Scanner(is)) {
                res=sc.nextLine();
            //}
            return res;
        }

        public LinkedList<String> read(){
            LinkedList<String> sl=new LinkedList<>();
            //try(Scanner sc=new Scanner(is)){
                String s;
                while(sc.hasNextLine()){
                    s=sc.nextLine();
                    sl.add(s);
                }
            //}
            return sl;
        }

}
