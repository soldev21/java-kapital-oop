package main.io;

import java.io.*;

public class PushBackReaderPlayground {
    public static void main(String[] args) throws IOException {
        String s = "{\"name\":\"kapital\" }";
        String s1 = "'{\"name\":\"kapital\" }'";
        PushbackReader reader = new PushbackReader(new InputStreamReader(new ByteArrayInputStream(s.getBytes())));
        char first = (char) reader.read();
        reader.unread(first);
        if (first == '{'){
            jsonParser(reader);
        }else if (first == '\''){
            jsonParserBetweenSingleQuote(reader);
        }
    }

    private static void jsonParser(Reader reader) throws IOException {
        System.out.println("Parsing as json");
        System.out.println((char)reader.read());
    }

    private static void jsonParserBetweenSingleQuote(Reader reader) throws IOException {
        System.out.println("Parsing as json between single quote");
        System.out.println((char)reader.read());
    }
}
