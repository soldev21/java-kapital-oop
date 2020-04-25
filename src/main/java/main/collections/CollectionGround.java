package main.collections;

import main.model.Reptile;

import java.util.*;

public class CollectionGround {
    public static void main(String[] args) {


        List list = new ArrayList();
        Reptile reptile = new Reptile("foo");
//        list.add(5); //0
//        list.add(new String("Hello")); //1
        list.add("World"); //2
//        list.add(5.5f); //3
        list.add(reptile); //4

        list.remove(0);
        list.add(0,"Hello");

        System.out.println(list);

//        List<String> listOfStrings = new ArrayList<>();
//        listOfStrings.add("Salam");
//
//        List<Integer> listOfIntegers = new ArrayList<>();
//        listOfIntegers.add(6);
//
//        Integer a = (Integer) list.get(0);
//        Integer b = listOfIntegers.get(0);
//
//
//        System.out.println(list.size());
//        list.remove(0);
//        System.out.println(list.size());
//        list.remove(2);
//        System.out.println(list.size());
//
//        System.out.println(list.isEmpty());
//
//
//        System.out.println(list.contains(new Reptile("foo")));

//        System.out.println("LIST: "+list.toString());
//        Set<Object> set = new HashSet<>();
//        set.add(new Reptile("foo"));
//        System.out.println("SET: "+set);
//        list.addAll(set);
//        System.out.println("LIST: "+list.toString());
//        set.addAll(list);
//        System.out.println("SET: "+set);

//        Reptile reptile1 = new Reptile("foo");
//        Reptile reptile2 = new Reptile("foo");
//        System.out.println(reptile1.hashCode());
//        System.out.println(reptile2.hashCode());
//        Set<Reptile> reptiles = new HashSet<>();
//        reptiles.add(reptile1);
//        reptiles.add(reptile2);
//        System.out.println(reptiles);



    }


}
