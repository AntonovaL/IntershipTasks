package io.tools;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

public class Printer {
    OutputStream os;
    String delemiter;
    public Printer(OutputStream os, String d){
        this.os=os;
        delemiter=d;
    }
    public void printTable(int[][] tab,int n){
        PrintStream ps=new PrintStream(os);
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                ps.print(tab[i][j]+delemiter);
            }
            ps.println();
        }
    }

    public void printNumber(int n){
        PrintStream ps=new PrintStream(os);
        ps.println(n);
    }

    public void printNumber(double n){
        PrintStream ps=new PrintStream(os);
        ps.println(n);
    }

    public void printArray(int[] array){
        PrintStream ps=new PrintStream(os);
        for (int x:array){
            ps.print(x+delemiter);
        }
        ps.print("\n");
    }

    public void printArray(char[] array,String comment){
        PrintStream ps=new PrintStream(os);
        if(comment!=null){
            ps.print(comment);
        }
        for (char x:array){
            ps.print(x+delemiter);
        }
        ps.print("\n");
    }

    public void printInReverceOrder(LinkedList<String> sl){
        PrintStream ps=new PrintStream(os);
        for(int i=sl.size()-1; i>=0; i--){
            ps.print(sl.get(i)+delemiter);
        }
    }

    public void print(LinkedList<String> sl){
        PrintStream ps=new PrintStream(os);
        for(int i=0; i<sl.size(); i++){
            ps.print(sl.get(i)+delemiter);
        }
    }

}
