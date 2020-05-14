package main.collections;

import java.util.Objects;

public class MyLinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private int counter = 0;

    public void add(E value){
        Node<E> newNode = createNewNode(value);
        if (Objects.isNull(head)){
            head = newNode;
            tail = head;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        counter++;
    }

    public E get(int index){
        return getNode(index).value;
    }

    private Node<E> getNode(int index){
        checkIndex(index);
        Node<E> node = head;
        int indexE = 0;
        while (node.next!=null && indexE<index){
            indexE++;
            node = node.next;
        }
        return node;
    }

    public void remove(int index){
        checkIndex(index);
        if (index==0){
            Node<E> node = head.next;
            head.next = null;
            head = node;
        }else {
            Node<E> node = getNode(index-1);
            Node<E> next = node.next;
            node.next = next.next;
            next.next = null;
        }
        counter--;
    }

    public void clear(){
        head = null;
        tail = null;
        counter=0;
    }

    private void checkIndex(int index){
        if (index>=counter || index<0) throw new IndexOutOfBoundsException("Index 0-dan boyuk element sayindan kicik olmalidir. "+index);
    }

    public int size(){
        return counter;
    }

    private Node<E> createNewNode(E value){
        Node<E> node = new Node<>();
        node.value = value;
        return node;
    }

    private static class Node<E> {
        private E value;
        private Node<E> next;
        private Node<E> prev;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        Node<E> node = head;
        if (Objects.nonNull(node)) {
            while (node.next != null) {
                builder.append(node.value);
                builder.append(",");
                node = node.next;
            }
            builder.append(node.value);
        }
        builder.append("]");
        return builder.toString();
    }


    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(256);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        myLinkedList.remove(1);
        myLinkedList.remove(1);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());


        myLinkedList.clear();
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        myLinkedList.add(15);
        myLinkedList.add(16);
        myLinkedList.add(17);
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());

//        System.out.println(myLinkedList.get(-1));
//        System.out.println(myLinkedList.size());
    }
}
