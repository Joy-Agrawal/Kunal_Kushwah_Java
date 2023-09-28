package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    //Important
    //when given numbers from range 1 to n ,i.e 1,2,3,4,5,6,...n: use cyclic sort
    //sort in only one pass , i.e ,only in one for loop
    static void swap(int[] arr,int first ,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void cycleSort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else {
                i++;
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
//        int[] arr = {3,2,1,4,6,8,7,5};
        System.out.println("Entered Array is :" + Arrays.toString(arr));
        cycleSort(arr);
        System.out.println("Sorted array is :" + Arrays.toString(arr));
    }
}
