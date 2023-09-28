package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class BSP1 {//binary search Problem 1

    //to find the ceiling of any number in a given sorted array
    // ceiling =  the smallest element greater or equal to target element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array Elements in Sorted manner");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is :");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(lSCeil(arr, target));
        System.out.println(binarySearchCeil(arr,target));
    }

    // Through LinearSearch
    static int lSCeil(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                int res = arr[i];
                return res;
            }
        }
        return -1;
    }

    static int binarySearchCeil(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = start + (end - start) / 2;
        while (start <= end) {
            //find the middle element
//            int mid =(start+end)/2;
            // might be start +end for large no's may exceed integer range
            mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > mid) {
                start = mid + 1;
            }
            return mid;
        }
//        start =end+1;
        int ans =arr[start];
        return ans;
    }
}
