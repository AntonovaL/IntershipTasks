package main.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;
import io.tools.Getter;
import io.tools.Printer;

public class MainFiles1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Лиля\\IdeaProjects\\TestProject\\src\\text.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            LinkedList<String> stringList = new LinkedList<>();
            Getter getter=new Getter(fis);
            stringList=getter.read();
            Printer pr=new Printer(System.out,"\n");
            pr.printInReverceOrder(stringList);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
    }
}
