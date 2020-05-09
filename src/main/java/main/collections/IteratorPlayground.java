package main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorPlayground {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if (i==2){
                iterator.remove();
            }else {
                System.out.println(i);
            }
        }

        list.forEach(i-> System.out.println(i));

        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            Integer i = listIterator.previous();
            if (i==2){
                listIterator.set(9);
            }else {
                System.out.println(i);
            }
        }

        list.forEach(i-> System.out.println(i));



        for (Integer i:list){
            if (i==2){
                list.remove(i);
            }else {
                System.out.println(i*i);
            }
        }
    }
}
