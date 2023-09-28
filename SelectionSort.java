package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    //It performs well on small lists/ arrays
    //Time complexity  =O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n= sc.nextInt();
        int [] arr =new int[n];
        System.out.println("Enter the elements of the array");
        for(int i= 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is :" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int arr[]){
        //in each pass the maximum element will be reached to the last position
        for(int i= 0;i<arr.length;i++){
            //find the maximum element in the array and swap with correct index
            int lastIndex = arr.length-1- i ;//since with each iteration the maximum element will be reached to last position and further search will be performed on the remaining elements
            int maxIndex = getMaxIndex(arr , 0, lastIndex); //to find the maximum element in the array
            swap(arr,maxIndex,lastIndex); //swapping the maximum element with the last index
        }
    }
    static int getMaxIndex(int[] arr,int start, int last){
        int max = start; //start is nothing but the starting index ,i.e 0
        for(int i= 0;i<= last;i++){
            if(arr[max] < arr[i]){
                max = i; //here max indicates the index of maximum element
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}