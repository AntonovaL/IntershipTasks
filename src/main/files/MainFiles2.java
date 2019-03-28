package main.files;
import java.io.File;
import java.util.LinkedList;
import test.files.MyFile;
import io.tools.Printer;
public class MainFiles2 {
    public static void main(String[] args) {
        MyFile f = new MyFile("C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\");
        LinkedList<String> ls=f.getFilesInFolder(".txt");
        Printer pr=new Printer(System.out,"\n");
        pr.print(ls);
    }
}
