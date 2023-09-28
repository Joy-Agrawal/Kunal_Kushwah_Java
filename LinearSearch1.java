package KunalKushwahJava;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        //It is geerally used for unsorted array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int flag=-1;
        int n = sc.nextInt();
        int[] arr=new int[n];
        //Inputting Array elements from user
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        //printing the array
        System.out.println("Entered array:");
        for(int element:arr){
            System.out.println(element);
        }
        System.out.println("Enter the Key to be Searched");
        int key = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=i;
                break;
            }
        }
        if(flag==-1) System.out.println("Element not present");
        else System.out.println("Element found at index "+flag);
    }
}
