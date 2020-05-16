package main.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayStreamPlayground {
    public static void main(String[] args) throws IOException {
        byte bytes[] = {5,5,6,9,3,5,8,7};
        ByteArrayInputStream inputStream = new ByteArrayInputStream(bytes);
        readInputStream(inputStream,true);
        inputStream.reset();
        readInputStream(inputStream,false);
        inputStream.reset();
        readInputStream(inputStream,false);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(bytes);
        byte b[] = outputStream.toByteArray();
        System.out.println(b[0]+" "+b[1]);
    }

    private static void readInputStream(ByteArrayInputStream inputStream,boolean mark){
        System.out.println("available "+inputStream.available());
        int data;

        while ((data = inputStream.read())!=-1){
            if (mark && inputStream.available()==3) inputStream.mark(3);
            System.out.print(data+" ");
            System.out.println("available "+inputStream.available());
        }
    }
}
