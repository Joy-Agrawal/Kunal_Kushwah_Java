package KunalKushwahJava.Recursion.QuickSort;

import java.util.Arrays;

public class QuickSort {
//    In this :
//    first choose any array element as pivot ,
//    then after first pass all the elements less than the pivot will be on lhs of pivot
//    and all the elements greater than the pivot will be on the right hand side
    public static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
//                swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] =pivot;
        arr[high] =temp;
        return i;
    }
    public static void quickSort(int[] arr,int low , int high){
        if(low<high){
//            Partition index
            int pidx = partition(arr,low,high);
            quickSort(arr,low,pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr ={6,3,9,10,15,1,5,2,8};
        int n = arr.length;
        quickSort(arr,0,n-1);
        System.out.println("sorted array is :"+ Arrays.toString(arr));
    }
}