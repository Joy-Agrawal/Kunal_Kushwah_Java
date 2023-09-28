package KunalKushwahJava;

import java.util.Scanner;

public class SumOfTwoMatrices {
    public static void main(String[] args) {
        //Given two matrices of same size, print their sum
        int row1,col1,row2,col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of  the matrix : ");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        int[][] a = new int[row1][col1];
        System.out.println("Enter the elements of matrix 1 : ");
        for(int i = 0 ;i< row1; i++){
            for(int j = 0;j<col1;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements entered successfully");
        for(int i= 0;i<col1;i++){

            for(int j=0;j<row1;j++) {
                System.out.print(a[j][i]+ " ");
            }
            System.out.println();
        }
//        int[][] b = new int[row1][col1];
//        System.out.println("Enter the elements of matrix 2 : ");
//        for(int i = 0 ;i< row1; i++){
//            for(int j = 0;j<col1;j++)
//                b[i][j] = sc.nextInt();
//        }
//        System.out.println("Elements entered successfully");
//        int [][] s = new int[row1][col1];
//        for(int i = 0 ;i< row1; i++){
//            for(int j = 0;j<col1;j++)
//                s[i][j] = a[i][j] + b[i][j];
//        }

//        for(int i = 0 ;i< row1; i++){
//            for(int j = 0;j<col1;j++)
//                System.out.print(s[i][j] + " ,");
//            System.out.println();
//        Program to print a matrix coloumn wise

    }
}
