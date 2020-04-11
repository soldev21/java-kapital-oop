package main;

public class Spiral {
    public static void main(String[] args) {
        int n = 5;
        int arr[][] = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = i * n + j + 1;
//            }
//        }
        int counter = 0;
        counter = HorizontalRight(arr,0,0,4,counter);
        counter = VerticalBottom(arr,4,1,4,counter);
        counter = HorizontalLeft(arr,4,3,0,counter);
        counter = VerticalTop(arr,0,3,1,counter);

        counter = HorizontalRight(arr,1,1,3,counter);
        counter = VerticalBottom(arr,3,2,3,counter);
        counter = HorizontalLeft(arr,3,2,1,counter);
        counter = VerticalTop(arr,1,2,2,counter);

        counter = HorizontalRight(arr,2,2,2,counter);

        print(arr);
    }


    private static int HorizontalRight(int a[][],int i,int j,int j1,int counter){
        for (int k=j;k<=j1;k++){
            a[i][k] = ++counter;
        }
        return counter;
    }

    private static int HorizontalLeft(int a[][],int i,int j,int j1,int counter){
        for (int k=j;k>=j1;k--){
            a[i][k] = ++counter;
        }
        return counter;
    }

    private static int VerticalBottom(int a[][],int j,int i,int i1,int counter){
        for (int k=i;k<=i1;k++){
            a[k][j] = ++counter;
        }
        return counter;
    }

    private static int VerticalTop(int a[][],int j,int i,int i1,int counter){
        for (int k=i;k>=i1;k--){
            a[k][j] = ++counter;
        }
        return counter;
    }

    private static void print(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%2d ", a[i][j]);
            }
            System.out.println();
        }
    }
}
