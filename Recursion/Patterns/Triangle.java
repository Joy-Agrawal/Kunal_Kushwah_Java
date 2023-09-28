package KunalKushwahJava.Recursion.Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows :");
        int row = sc.nextInt();
        triangle2(row,0);
    }

    public static void triangle(int row){
        if(row == 0){
            return;
        }
        triangle(row-1);
        System.out.println();
        for(int i = 0;i<row;i++){
            System.out.print("* ");
        }
    }
//    or
    public static void triangle2(int row,int col){
        if(row == 0){
            return;
        }
        if(col<row){
            triangle2(row,col+1);
            System.out.print("* ");
        }
        else {
            triangle2(row - 1, 0);
            System.out.println();
        }
    }
}
