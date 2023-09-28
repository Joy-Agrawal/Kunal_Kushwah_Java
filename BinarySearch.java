package KunalKushwahJava;

import java.util.Scanner;
public class BinarySearch {
    static int binarySearch(int[] arr,int target){
        int start =0,end= arr.length - 1;
        while(start<=end){
            //find the middle element
//            int mid =(start+end)/2;
            // might be start +end for large no's may exceed integer range
            int mid = start +(end-start)/2;
            if(target<arr[mid])
                end =mid-1;
            else if (target>mid) {
                start =mid+1;
            }
            return mid;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array");
        int n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the Array elements in sorted order!");
        for (int i = 0; i < n; i++) {
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();
        int ans = binarySearch(arr,target);
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index:" + ans);
        }
    }
}
