package main.io;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import main.collections.model.Model;

import javax.jws.WebParam;
import java.io.*;
import java.util.Scanner;

public class ScannerPlayground {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type some integer: ");
////        int a = scanner.nextInt();
////        System.out.println("Inserted int "+a);
//        String s = scanner.nextLine();
//        System.out.println("Inserted line "+s);

//        PrintStream  outputStream = new PrintStream(new FileOutputStream(new File("kapital.txt"),true));
//        System.setOut(outputStream);
//
//        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
//
//        String s = "";
//        while (!(s = inputStream.readLine()).equals("exit")){
//            System.out.println(s);
//        }
//
//
//        System.out.println("END");


        Model model = new Model("Kapital",200);
//
        System.out.println(toStringStatic(model));
        Model model1 = doSomeStuff(model);
        System.out.println(toStringStatic(model1));

    }

    private static Model doSomeStuff(Model model){
         Model model1 = new Model(model.getName().concat("_New"),model.getRanking()+5);
         model1.setCancelled(true);
         return model1;
    }

    private static String toStringStatic(Object o) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(o);
    }
}
