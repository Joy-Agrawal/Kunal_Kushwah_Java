package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static int[] bubbleSort(int[] arr){
        boolean swap = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is:" + Arrays.toString(arr));
        int[] res =bubbleSort(arr);
        System.out.println("Sorted Array: "+ Arrays.toString(res));
    }
}