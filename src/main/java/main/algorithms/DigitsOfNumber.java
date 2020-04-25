package main.algorithms;

import main.interfaces.InterfaceA;

public class DigitsOfNumber {

    private static final int MAX_NUMBER_OF_DIGITS = 15;

    public static void main(String[] args) {
        Integer a = 1234567890;
        int digits[] = new int[MAX_NUMBER_OF_DIGITS];
        int i = 0;
        while (a > 0) {
            digits[i++] = a % 10;
            a /= 10;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.printf("%d ", digits[j]);
        }
    }
}
