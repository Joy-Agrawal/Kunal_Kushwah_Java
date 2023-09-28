package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        nto1(n);
    }

    public static void nto1(int n){
        if(n==0){//since we do not have to print 0
            return;
        }
        System.out.print(n+", ");
        nto1(n-1);
    }
}
