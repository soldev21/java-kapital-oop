package main.collections;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Stack;

public class QueuePlayground {
    public static void main(String[] args) {
        Integer i;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(6);
        queue.add(3);
        queue.add(8);


        while (!queue.isEmpty()){
            i = queue.poll();
            System.out.println(i);
        }

        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(4);
        stack.add(-1);
        stack.add(7);

        while (!stack.isEmpty()){
            i = stack.pop();
            System.out.println(i);
        }

    }
}
