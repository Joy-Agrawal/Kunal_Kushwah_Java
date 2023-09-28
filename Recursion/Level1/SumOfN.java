package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        sum(n);
    }

    public static int sum(int n){
        if(n<=1)
            return 1;
        else
            return n+sum(n-1);
    }
}
