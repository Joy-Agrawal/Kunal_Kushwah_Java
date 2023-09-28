package KunalKushwahJava;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = {10,20,30,40,60,50,75};
        System.out.println("Enter the target element");
        int target =sc.nextInt();
        System.out.println(search(arr,1,4,target));
    }
    static int search(int[] arr,int start,int end,int target){
        if(arr.length==0)   return -1;

        for(int i=start;i<=end;i++){
            if(arr[i]==target)  return i;
        }
        return -1;
    }
}
