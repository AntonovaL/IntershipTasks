package main.files;

import test.files.MyFile;

import java.nio.file.Files;

public class MainFiles3 {
    public static void main(String[] args){
        String path1="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\text1.txt";
        String path2="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\text2.txt";
        MyFile f=new MyFile(path1);
        f.copyTo(path2);
    }
}
