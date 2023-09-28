package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }

    public static boolean palindrome(int n){
        return n == ReverseNumber3.reverse(n);
    }
}
