package main.algorithms;

public class Stars {
    public static void main(String[] args) {
        printStars(10);
    }

//    private static void printStars(int n){
//        if (n==0) return;
//        printStars(n-1);
//        for (int i=1;i<=n;i++){
//            System.out.print("* ");
//        }
//        System.out.println();
//    }

    private static void printStars(int n) {
        printStars_(n, n);
    }

    private static void printStars_(int n, int k) {
        if (n == 0) return;
        if (k == 0) {
            printStars_(n - 1, n - 1);
        } else {
            printStars_(n, k - 1);
            System.out.print("*");
            if (k != n)
                System.out.print(" ");
            else
                System.out.println();
        }

    }
}
