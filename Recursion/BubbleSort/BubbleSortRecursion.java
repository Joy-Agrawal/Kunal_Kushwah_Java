package KunalKushwahJava.Recursion.BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,5,1,2,3,6,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int arr[],int length,int index){
        if(length == 0){
            return;
        }
        if(index<length){
            if(arr[index] >arr[index+1]){
                //swap
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;
            }
            bubble(arr,length,index+1);
        }
        else{
            bubble(arr,length-1,0);
        }
    }
}
