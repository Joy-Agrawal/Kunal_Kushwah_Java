package KunalKushwahJava.MathsForDataStructures;

import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
    }

    public static int gcd(int a , int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
        //this is based on euclidean algorithm
        //gcd(a,b) = gcd(remainder(b,a),a)
    }

    public static int lcm(int a , int b){
        return (a*b)/gcd(a,b);//incomplete
    }
}
