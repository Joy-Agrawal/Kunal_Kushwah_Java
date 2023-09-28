package KunalKushwahJava;

import java.util.Scanner;

public class FindMin {
    static int min(int[] arr){
        if(arr.length==0)   return -1;
        int min =arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min =arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter the no of elements in the array:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Finding minimum element");
        System.out.println(min(arr));
    }
}
