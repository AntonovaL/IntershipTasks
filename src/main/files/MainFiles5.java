package main.files;

import test.files.MyFile;

import java.io.IOException;

public class MainFiles5 {
    public static void main(String[] args){
        String path="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\textCopy.txt";
        String path2="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\textCopyv2.txt";
        MyFile f=new MyFile(path);
        try {
            f.changeTo(path2);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
