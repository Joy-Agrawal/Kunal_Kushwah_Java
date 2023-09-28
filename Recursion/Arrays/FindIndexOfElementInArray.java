package KunalKushwahJava.Recursion.Arrays;

import java.util.Scanner;

public class FindIndexOfElementInArray {
//    linear search through recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {5,4,87,7,5,41,21,52,67,21,14,22};
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();
        System.out.println(findIndex(arr,target,0));
    }

    public static int findIndex(int arr[],int target,int index){
        if(index == arr.length -1){
            return -1;
        }
        else if (arr[index] == target){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
}
