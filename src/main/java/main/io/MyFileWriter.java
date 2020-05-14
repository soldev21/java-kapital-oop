package main.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter extends FileWriter {

    private int flushCounter = 1;

    public MyFileWriter(File file, boolean b) throws IOException {
        super(file, b);
    }

    @Override
    public void close() throws IOException{
        System.out.println("Start closing MyFileWriter");
        super.close();
        System.out.println("End closing MyFileWriter");
    }

    @Override
    public void flush() throws IOException{
        System.out.println(String.format("Start flushing (%d) MyFileWriter",flushCounter));
        super.flush();
        System.out.println(String.format("End flushing (%d) MyFileWriter",flushCounter));
        flushCounter++;
    }
}
