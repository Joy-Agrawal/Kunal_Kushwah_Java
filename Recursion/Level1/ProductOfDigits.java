package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(product(n));
    }

    public static int product(int n){
        if(n==0){
            return 1;
        }
        return n%10 * product(n/10);
    }
}
