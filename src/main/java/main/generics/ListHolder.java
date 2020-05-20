package main.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListHolder<T> {

    private List<T> list;

    public ListHolder() {
        setList(new ArrayList<>());
    }

    public ListHolder(List<T> list) {
        setList(list);
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void print(){
        for (T t:list){
            System.out.print(t+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListHolder<Integer> listHolder = new ListHolder<>(Arrays.asList("a","b","c");
        listHolder.print();
    }
}
