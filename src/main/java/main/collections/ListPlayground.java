package main.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPlayground {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List<Integer> linkedList = new LinkedList();
        List<String> linkedListS = new LinkedList();

        linkedList.add(22);
        linkedList.add(2);
        linkedList.add(77);

        System.out.println(linkedList);
    }
}
