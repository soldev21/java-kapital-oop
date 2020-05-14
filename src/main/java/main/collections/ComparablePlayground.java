package main.collections;

import main.collections.model.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparablePlayground {
    public static void main(String[] args) {
        List<Model> list = new ArrayList<>();
        List<Model> list1 = new ArrayList<>();

        list1.add(new Model("a", 5));
        list1.add(new Model("a", -3));
        list1.add(new Model("a", -3));
        list.add(new Model("a", 0));
        list.add(new Model("a", 6));
        list.add(new Model("a", -5));

        list.addAll(list1);
        print(list);
//        Collections.sort(list);
        Collections.sort(list,new ModelComparator());

        print(list);
        Collections.sort(list,new ModelComparator2());
        print(list);

    }


    private static void print(Collection<Model> c) {
        c.forEach(i -> System.out.print(i.getRanking() + " "));
        System.out.println();
    }
}
