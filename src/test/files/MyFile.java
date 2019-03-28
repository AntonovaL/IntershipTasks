package test.files;

import java.io.*;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.Scanner;

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
            double size = f.length();
            double part1 = size * pr / 100;
            double part2 = size - part1;
            FileOutputStream out1 = new FileOutputStream(firstFileName);
            FileOutputStream out2 = new FileOutputStream(secondFileName);
            double read = 0;
            int b;
            while ((b = fis.read()) >= 0) {
                if(++read<=part1)
                    out1.write(b);
                else
                    out2.write(b);
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
