package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class ReverseNumber3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }

    public static int reverse(int n){
        int digits = (int)(Math.log10(n)) + 1;//no of digits
        return helper(n,digits);
    }

    public static int helper(int n , int digits){
        if(n%10 == n){//single digit numbers
            return n;
        }
        int rem = n%10;
        return rem* (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
}
