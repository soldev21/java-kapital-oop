//package main;
//
//public class SpiralStars {
//    public static void main(String[] args) {
//        int n = 6;
//        String arr[][] = new String[n][n];
//
//        int counter = 0;
//        int it = 0, ib = n - 1, jl = 0, jr = n - 1;
//        int stepCounts = n / 2 + n % 2;
//        for (int k = 1; k <= stepCounts; k++) {
//            counter = HorizontalRight(arr, it++, jl, jr, counter);
//            counter = VerticalBottom(arr, jr--, it, ib, counter);
//            counter = HorizontalLeft(arr, ib--, jr, jl, counter);
//            counter = VerticalTop(arr, jl++, ib, it, counter);
//        }
//        print(arr);
//    }
//
//
//    private static int HorizontalRight(String a[][], int i, int j, int j1, String str) {
//        for (int k = j; k <= j1; k++) {
//            a[i][k] = ++counter;
//        }
//        return counter;
//    }
//
//    private static int HorizontalLeft(String a[][], int i, int j, int j1, String str) {
//        for (int k = j; k >= j1; k--) {
//            a[i][k] = ++counter;
//        }
//        return counter;
//    }
//
//    private static int VerticalBottom(String a[][], int j, int i, int i1, String str) {
//        for (int k = i; k <= i1; k++) {
//            a[k][j] = ++counter;
//        }
//        return counter;
//    }
//
//    private static int VerticalTop(String a[][], int j, int i, int i1, String str) {
//        for (int k = i; k >= i1; k--) {
//            a[k][j] = ++counter;
//        }
//        return counter;
//    }
//
//    private static void print(Object a[][]) {
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                System.out.printf("%2d ", a[i][j]);
//            }
//            System.out.println();
//        }
//    }
//}
