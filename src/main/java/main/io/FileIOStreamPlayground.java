package main.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIOStreamPlayground {
    public static void main(String[] args) throws IOException {
        File file = new File("download.jpeg");
//        FileOutputStream out = new FileOutputStream(file,true);

        FileInputStream inputStream = new FileInputStream(file);

        int c;
        while ((c=inputStream.read())!=-1){
            System.out.print(c+" ");
        }

    }
}
