package KunalKushwahJava.BinarySearchProblems;

import java.util.Scanner;

public class FloorOfANumber {
        //    Floor -> greatest element in the array which is smaller than(if not found)
//    or equal (if found) to the target element
//    ques : given an array return the floor of the target element from the array
        public static void main(String[] args) {
            int arr[] = {2,4,5,8,9,10,15,16,48};
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the target element");
            int target = sc.nextInt();
            System.out.println(Floor(arr,target));
        }

        public static int Floor(int arr[], int target){
            //just similar to binary search
            int start = 0;
            int end = arr.length-1;
            //if the target element is smaller than all the elements
            if(target>arr[0]){
                return -1;
            }
            while(start<=end){
                int mid = start + (end - start)/2;
                if (target>arr[mid]){
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return end;
        }
    }
