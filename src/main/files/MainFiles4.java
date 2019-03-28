package main.files;

import test.files.MyFile;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainFiles4 {
    public static void main(String[] args){
        String path="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\text.txt";
        String pathPartOne="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\one.txt";
        String pathPartTwo="C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\two.txt";
        MyFile f=new MyFile(path);
        try {
            f.splitOnParts(pathPartOne, pathPartTwo, 70);
        }
        catch (IOException e){
            System.out.println("One of files does not exist");
        }
    }
}
