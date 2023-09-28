package KunalKushwahJava.Recursion.Arrays;

import java.util.Scanner;

public class RotatedBinarySearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {5,6,7,8,9,1,2,3};//rotated array
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();
        System.out.println(rbs(arr,target, 0,arr.length-1));
    }

    public static int rbs(int arr[],int target,int s,int e){//s-> start index and e->end index
        if(s>e){
            return -1;
        }
        int m = s+ (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target<=arr[m]){
                rbs(arr,target,s,m-1);
            }
            else {
                return rbs(arr,target,m+1,e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return rbs(arr,target,m+1,e);
        }
        return rbs(arr,target,s,m-1);
    }
}
