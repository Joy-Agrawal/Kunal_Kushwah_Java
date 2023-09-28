package KunalKushwahJava.Recursion;

import java.util.Scanner;

public class IntroductionToRecursion {
    static void printSeries(int n) {
        int i =0;
        if(i>n){
            return;
        }
        System.out.println(i);
        printSeries(i+1);
    }//function for printing no.s from 1 to n

    static int nthFibonacci(int n){
        if(n==1){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else
            return nthFibonacci(n-1) + nthFibonacci(n-2);
    }
    public static void main(String[] args) {
//        printSeries(10);
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        n = nthFibonacci(n);
        System.out.println("ans: " + n);
//        int ans = (int) Math.round(Math.pow((Math.sqrt(5)+1)/2,n));

    }
}
