package KunalKushwahJava.BinarySearchProblems;

import java.util.Scanner;

public class CeilingOfANumber {
//    ceiling -> smallest element in the array which is greater than(if not found)
//    or equal (if found) to the target element
//    ques : given an array return the ceiling of the target element from the array
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,9,10,15,16,48};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(ceiling(arr,target));
    }

    public static int ceiling(int arr[],int target){
        //just similar to binary search
        int start = 0;
        int end = arr.length-1;
        //if the target element is greater than all the elements
        if(target>arr[arr.length-1]){
            return -1;
        }
        while(start<=end){
            int mid = start + (end - start)/2;
            if (target>arr[mid]){
                start = mid+1;}
            else if(target<arr[mid]){
                end = mid-1;}
            else{
                return mid;}
        }

        return start;// here the start value will be greater then the end, i.e the while loop condition breaks
    }
}