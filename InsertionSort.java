package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int arr[]) {
        int i = 0;
        int j = i + 1;
        for (i = 0; i <= arr.length - 2; i++) {//arr = {5,6,2,3,4};
            j = i + 1;
            if (arr[j] > arr[j - 1])
                continue;
            while (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
                if(j==0)    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is :" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("sorted array is " + Arrays.toString(arr));
    }
}