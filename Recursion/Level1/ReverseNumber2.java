package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(reverse(n,0));
    }

    public static int reverse(int n, int sum){
        if(n == 0){
            return sum;
        }
        int digit = n%10;
        sum = sum*10 + digit;
        return reverse(n/10,sum);
    }
}
