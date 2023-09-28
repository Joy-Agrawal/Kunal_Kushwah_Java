package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return n%10 +sumDigits(n/10);
    }
}
