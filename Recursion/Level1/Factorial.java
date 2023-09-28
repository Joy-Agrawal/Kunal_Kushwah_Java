package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }

    public static int fact(int n){
        if(n <=1){
            return 1;
        }
        else
            return n*fact(n-1);
    }
}
