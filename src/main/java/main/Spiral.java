package main;

public class Spiral {
    public static void main(String[] args) {
        int n = 4;
        int arr[][] = new int[n][n];

        int counter = 0;
        int it = 0, ib = n - 1, jl = 0, jr = n - 1;
        int stepCounts = n / 2 + n % 2;
        for (int k = 1; k <= stepCounts; k++) {
            counter = HorizontalRight(arr, it++, jl, jr, counter);
            counter = VerticalBottom(arr, jr--, it, ib, counter);
            counter = HorizontalLeft(arr, ib--, jr, jl, counter);
            counter = VerticalTop(arr, jl++, ib, it, counter);
        }
        print(arr);
    }


    private static int HorizontalRight(int a[][], int i, int j, int j1, int counter) {
        for (int k = j; k <= j1; k++) {
            a[i][k] = ++counter;
        }
        return counter;
    }

    private static int HorizontalLeft(int a[][], int i, int j, int j1, int counter) {
        for (int k = j; k >= j1; k--) {
            a[i][k] = ++counter;
        }
        return counter;
    }

    private static int VerticalBottom(int a[][], int j, int i, int i1, int counter) {
        for (int k = i; k <= i1; k++) {
            a[k][j] = ++counter;
        }
        return counter;
    }

    private static int VerticalTop(int a[][], int j, int i, int i1, int counter) {
        for (int k = i; k >= i1; k--) {
            a[k][j] = ++counter;
        }
        return counter;
    }

    private static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
