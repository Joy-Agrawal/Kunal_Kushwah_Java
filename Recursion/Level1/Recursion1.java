package KunalKushwahJava.Recursion.Level1;

import java.util.Scanner;

public class Recursion1 {
//    Problem 1 : print nos from N to 1
    static void nto1(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }

//    Problem 2 : print nos from 1 to n
    static void oneToN(int n){
        if(n<1){
            return;
        }
        oneToN(n-1);
        System.out.println(n);
    }

//    Problem 3 : print nos from 1 to N and then N to 1
    static void printBoth(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }

//    Problem 4 : Factorial of a number
    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n * factorial(n-1);
    }

    //    Problem 5 : Sum of n Natural numbers
    static int sumNatural(int n){
        if(n<=1){
            return 1;
        }
        return n + sumNatural(n-1);
    }

//    Problem 6 : Sum of digits of a number
    static int sumDigits(int n){
        if(n/10 == 0){
            return n;
        }
        return (n % 10) + productDigits(n/10);
    }

    //    Problem 7 : Product of digits of a number
    static int productDigits(int n){
        if(n/10 == 0){
            return n;
        }
        return (n % 10) * productDigits(n/10);
    }

    //    Problem 8 : Reverse a number
    static int reverseNumber(int n){
        if(n/10 == 0){
            return n;
        }
        int t = n;
        int i=1;
        while(t!=0){
            t/=10;
            i*=10;
        }
        return  (n % 10)*i + reverseNumber(n/10) ;
    }
//Some questions are left video no: 27 kunal kushwaha 
//    Problem: Given a integer num, return the no of steps required to reduce it to zero.
//    In one step , if the current number is even , you have to divide it by 2 , otherwise ,you have to subtract 1 from it .

    static int noOfSteps(int n){
        int i = 0 ;

        while(n != 0) {
            if ((n & 1) == 0) {
                n /= 2;
            }
            else {
                n -= 1;
            }
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
//        System.out.println("Problem 1 : print nos from N to 1");
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        nto1(n);
//
//        System.out.println("Problem 2 : print nos from 1 to N");
//        System.out.println("Enter the value of n");
//        n =  sc.nextInt();
//        oneToN(n);
//
//        System.out.println("Problem 3 : print nos from 1 to N and then N to 1");
//        System.out.println("Enter the value of n");
//        n =  sc.nextInt();
//        printBoth(n);
//
//        System.out.println("Problem 4 : Calculate Factorial of any number using recursion ");
//        System.out.println("Enter the value of n");
//        n =  sc.nextInt();
//        factorial(n);
//
//        System.out.println("Problem 5 : Calculate the sum of n natural numbers");
//        System.out.println("Enter the value of n");
//        n =  sc.nextInt();
//        sumNatural(n);
//
//        System.out.println("Problem 6 : Calculate the sum of the digits of a number ");
//        System.out.println("Enter the value of n");
//        n =  sc.nextInt();
//        sumDigits(n);

//        System.out.println("Problem 7 : Calculate the product of the digits of a number ");
//        System.out.println("Enter the value of n");
//        int n =  sc.nextInt();
//        System.out.println(productDigits(n));

        System.out.println("Problem 8 : Reverse of a number ");
        System.out.println("Enter the value of n");
        int n =  sc.nextInt();
        System.out.println(reverseNumber(n));

//        System.out.println("Problem  : no of steps ");
//        System.out.println("Enter the value of n");
//        int n =  sc.nextInt();
//        System.out.println(noOfSteps(n));
    }
}
