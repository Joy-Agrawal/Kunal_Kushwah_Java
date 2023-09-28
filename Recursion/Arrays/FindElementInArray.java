package KunalKushwahJava.Recursion.Arrays;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {5,4,87,7,5,41,21,52,67,21,14,22};
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();
        System.out.println(findElement(arr,target,0));
    }

    private static boolean findElement(int[] arr, int target,int index) {
        if(index == arr.length -1){
            return false;
        }
//        else if (arr[index] == target){
//            return true;
//        }
//        return findElement(arr,target,index+1);
//        or
        return arr[index] == target || findElement(arr,target,index+1);
    }
}
