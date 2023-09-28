package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        reverse(n);
        System.out.println(sum);
    }
    static int sum =0;
    public static void reverse(int n){
        if(n==0){
            return ;
        }
        int digit = n%10;
//        n /= 10;
        sum = sum*10 + digit;
        reverse(n/10);
    }
}
