package main.generics;

import java.util.List;

public class GenericPlayground {


    public static <T extends Number> Number sum(T num1,T num2){
        return num1.doubleValue()+num2.doubleValue();
    }

    public static Number sum2(Number num1,Number num2){
        return num1.doubleValue()+num2.doubleValue();
    }

    public static Number sum1(double a,double b){
        return a+b;
    }


    public static void main(String[] args) {
        sum1(5,6.6f);
        Number res = sum(5,6);
        Number res1 = sum(5.5,6);
        Number res2 = sum(5.5,6.6);
        Number res3 = sum(5,8.9);
        Number res5 = sum(5L,8.9f);
        Number res6 = sum2(5L,8.9f);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res5);

        Number num1 = new Long(5L);
        Number num2 = new Double(8.9f);
    }
}
