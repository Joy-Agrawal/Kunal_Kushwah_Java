package KunalKushwahJava;

import java.util.Scanner;

public class LinearSearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<arr.length;i++)
            arr[i]= sc.nextInt();
        System.out.println("Enter The key to be searched");
        int key= sc.nextInt();
        int res=linearSearch(arr,key);
        if(res==-1) System.out.println("ELement not found");
        else System.out.println("Element found at index"+res);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;
        }
        return -1;//if no target is found

    }
}
