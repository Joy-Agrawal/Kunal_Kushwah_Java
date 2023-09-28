package KunalKushwahJava.MathsForDataStructures;
import java.util.Scanner;

public class PrimeNumbers {
    //    Q1. Check whether a given no is prime?
    //        -> A no is said to be prime if it has factors not more than two
    //        -> i.e 1 and the no itself.

    //here we will check only upto the square root of that number
    static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int i = 2;
        //basic approach
    //        while(i<n){
    //            if(n%i == 0){
    //                return false;
    //            }
    //            i++;
    //        }
        //if we notice by finding the factors of any number
        // the prime factors are available only till the square root of that number
    //   so instead of checking for all the numbers as factor , we will only check upto square root of that number
        while( i*i <= n){
            if( n%i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

    //    Q2. Find all the prime numbers less than n?
    static void allPrimeLessThanN(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+", ");
            }
        }
    }
    public static void main(String[] args){
        System.out.println(Integer.MAX_VALUE);
        System.out.println("1 . check whether Prime or not");
        System.out.println("Enter the no to be checked");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));

        System.out.println("2. Find all the prime numbers less than n?");
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        allPrimeLessThanN(n);

    }
}
