package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        revNto1(n);
    }
    public static void revNto1(int n){
        if(n==0){
            return;
        }
        revNto1(n-1);
        System.out.print(n+ ", ");
    }
}
