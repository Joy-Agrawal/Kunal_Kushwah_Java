package KunalKushwahJava.Recursion.MergeSorting;

import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;//if the array is of single element then no need to sort
        }
        int mid = arr.length/2;
//Dividing the array in two halfs
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);

//        combinbing the two halves
        return merge(left,right);
    }

    static int[] merge(int left[],int right[]){//function to combine the two halves in sorted manner
        int merge[] = new int[left.length + right.length];
        int i =0,j=0,k=0;
//        i -> for iterating on left array
//        j -> for iterating on right array
//        k -> for iterating on merge array

        while( i < left.length && j < right.length){
            if(left[i] < right[j]){
                merge[k] = left[i];
                i++;
            }else{
                merge[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){//if any elements of left array are left
            merge[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){//if any elements of right array are left
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;//return the merged array
    }

    public static void main(String[] args) {
//        worst case complexity : O(nlogn)
//        Merge sort is completely different algorithm
//        it is based on divide and conquer approach
//        Merge sort algorithm:
//        divide the array in two equal halves
//        sort the two subarrays seperately using recursion
//        merge the two sorted subarrays to create an overall sorted array

    int arr[] = {8,4,2,6,5,17,89,30};
        System.out.println("Array before sorting = " + Arrays.toString(arr));
    int ans[] = mergeSort(arr);
        System.out.println("Array after sorting = " + Arrays.toString(ans));
    }
}