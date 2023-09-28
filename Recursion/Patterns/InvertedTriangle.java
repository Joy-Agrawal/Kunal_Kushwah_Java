package KunalKushwahJava.Recursion.Patterns;

import java.util.Scanner;

public class InvertedTriangle {
//    * * * *
//    * * *
//    * *
//    *
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int row = sc.nextInt();
        triangle(row);
        triangle2(row,0);
    }

    public static void triangle(int n){
        if(n == 0){
            return;
        }
        for(int i =1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        triangle(n-1);
    }

//    another way
    public static void triangle2(int row,int col){
        if(row == 0){
            return;
        }
        if(col == row){
            System.out.println();
            triangle2(row-1,0);
        }
        else if (col<row) {
            System.out.print("* ");
            triangle2(row, col + 1);
        }
    }
}
