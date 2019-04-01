package test.files;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.Scanner;
import io.tools.Getter;
import io.tools.Printer;

public class MyFile {
    File f;
    public MyFile(String filePath){
        f=new File(filePath);
    }
    public  LinkedList<String> getFilesInFolder(String end){
        File[] arr = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(end);
            }
        });
        LinkedList<String> fnames=new LinkedList<>();
        for (File x: arr){
            fnames.add(x.getName());
        }
        return fnames;
    }

    public  void copyTo(String path){
        File copy=new File(path);
        try {
            Files.copy(f.toPath(),copy.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public  void splitOnParts(String firstFileName, String secondFileName, int pr) throws IOException {
            FileInputStream fis=new FileInputStream(f);
            Getter getter=new Getter(fis);
            LinkedList<String> ls=getter.read();
            double size = ls.size();
            double part1 = size * pr / 100;
            double part2 = size - part1;
            FileOutputStream out1 = new FileOutputStream(firstFileName);
            FileOutputStream out2 = new FileOutputStream(secondFileName);
            Printer p1=new Printer(out1,"");
            Printer p2=new Printer(out2,"");
            for (int i=0; i<size; i++){
                if(i<part1){
                    p1.print(ls.get(i));
                }
                else{
                    p2.print(ls.get(i));
                }

            }
            out1.close();
            out2.close();
    }

    public void changeTo(String path) throws IOException {
        FileInputStream fis=new FileInputStream(f);
        Scanner sc=new Scanner(fis);
        FileWriter out=new FileWriter(path);
        int c; String str;
        while(sc.hasNextLine()){
            str= sc.nextLine();
            str=str.toUpperCase();
            str=str.replace(" ","  ");
            out.write(str+"\n");
        }
        out.close();
    }
}
