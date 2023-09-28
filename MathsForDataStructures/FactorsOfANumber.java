package KunalKushwahJava.MathsForDataStructures;

import java.util.Scanner;

public class FactorsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        factors(n);
        System.out.println();
        factors2(n);
    }
    public static void factors(int n){
        //basic approach
        //time complexity : O(n)
        for(int i =1;i<=n;i++){
            if((n % i) == 0){
                System.out.print(i + ", ");
            }
        }
    }
    public static void factors2(int n){
        //faster approach
        //time complexity : O(sqrt(n))
        for(int i =1;i<=Math.sqrt(n);i++){
            if((n % i) == 0){
                if(n/i == i) {//tto remove the duplicates , ex: in case of 36 36/6 = 6 so if only else statement is executed
//                    then it will print 6 two times, i.e. i,n/i
                    System.out.print(i + ", ");
                } else{
                    System.out.print(i + ", " + n/i +", ");
                }
            }
        }
    }
}
