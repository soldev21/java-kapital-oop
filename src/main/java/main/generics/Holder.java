package main.generics;

public class Holder<T, E extends Number> {

    T t;
    E e;

    public Holder(T t,E e) {
        setT(t);
        setE(e);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    private static <T> T staticMethod(T t){
        return t;
    }

    public static void main(String[] args) {
        Holder<String,Integer> holder = new Holder("Kapital",15);
        String s = holder.getT();
        System.out.println(s);
        System.out.println(holder.getE());
    }
}
