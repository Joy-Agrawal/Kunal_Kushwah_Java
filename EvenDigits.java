package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class EvenDigits {
    //Leetcode question: 1295
    //
    static boolean even(int n){
        int count =0;
        while(n!=0){
            n/=10;
            count++;
        }
        if(count%2==0)  return true;
        return false;
    }
    static int findNumbers(int[] arr){
        int count=0;
        for(int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int n= sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] =sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("No of elements with even digits:" + findNumbers(arr));
    }
}
