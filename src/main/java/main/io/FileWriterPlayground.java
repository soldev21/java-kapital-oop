package main.io;

import java.io.*;
import java.util.Objects;

public class FileWriterPlayground {
    public static void main(String[] args) throws IOException {

        File file = new File("kapital.txt");


        try (FileWriter fileWriter = new MyFileWriter(file, true)) {
            fileWriter.write("Welcome to Kapital Bank1!\n");
            fileWriter.write("Welcome to Kapital Bank2!\n");
            fileWriter.flush();
            fileWriter.write("Welcome to Kapital Bank-1!\n");
            fileWriter.write("Welcome to Kapital Bank4!\n");
            fileWriter.flush();
            fileWriter.write("After last flush");
            throwE();
            fileWriter.write("Welcome to Kapital Bank5!\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n\n\n\n***************READING FILE WITH FileReader***************\n");
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char)c);
            }
        } catch (IOException e) {

        }

        System.out.println("\n\n\n\n***************READING FILE WITH BufferedReader***************\n");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String s;
            while (Objects.nonNull(s=reader.readLine())){
                System.out.println(s);
            }
        } catch (IOException e) {

        }

        System.out.println("\n\n\n\n***************RandomAccessFiles***************\n");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file,"rw");
        randomAccessFile.seek(2);
        long pos = randomAccessFile.getFilePointer();
        System.out.println("position: "+pos);
        randomAccessFile.write("SALAMM".getBytes());
        randomAccessFile.close();

        System.out.println("Application Ended successfully!");



    }

    public static void throwE() {
        throw new RuntimeException("Error");
    }

    public static void doPayment() {
        // write to file
        // ...
        // write to file
        // ...
        // write emeliyyat tamamlandi
        // flush
    }
}
