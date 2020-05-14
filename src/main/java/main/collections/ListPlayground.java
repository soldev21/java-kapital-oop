package main.collections;

import main.collections.model.Model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPlayground {
    public static void main(String[] args) {
//        List arrayList = new ArrayList();
//        List<Integer> linkedList = new LinkedList();
//        List<String> linkedListS = new LinkedList();
//
//        linkedList.add(22);
//        linkedList.add(2);
//        linkedList.add(77);
//
//        System.out.println(linkedList);

        List<Model> list = new ArrayList<>();
        Model modelA = new Model("modelA");
        Model modelA2 = new Model("modelA2");
        System.out.println(modelA.equals(modelA2));
//        list.add(modelA);
//
//        if (list.contains(modelA2)){
//            System.out.println("Yes contains!");
//            modelA2.setCancelled(true);
//        }
//
//        System.out.println(list.get(0).isCancelled());
//        System.out.println(modelA2.isCancelled());
    }
}
