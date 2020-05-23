package main.generics;


import java.util.Arrays;

public class Stats<T extends Number> {

    T[] nums;

    public Stats(T[] nums){
        this.nums = nums;
    }

    double average(){
        double sum = 0.0;
        for (T t:nums) sum+=t.doubleValue();
        return sum/nums.length;
    }

    boolean sameAverage(Stats<? super Number> ob){
        return average() == ob.average();
    }


    public static void main(String[] args) {
        Stats<Integer> integerStats = new Stats<>(new Integer[]{1,2,3});
        Stats<Double> doubleStats = new Stats<>(new Double[]{1.0,2.0,3.0});
//        boolean b = integerStats.sameAverage(doubleStats);
//        System.out.println(b);
    }
}
