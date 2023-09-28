package KunalKushwahJava;

import java.util.Arrays;
import java.util.Scanner;

public class searchIn2DArray {
    static int[] search(int[][] arr,int target){
        if(arr.length==0 || arr[0].length ==0)  return new int[]{-1,-1};
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows and coloun");
        int row = sc.nextInt();
        int col =sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter the array elements");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("Entered Array is ");
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Enter the target element");
        int target =sc.nextInt();
        int[] ans =search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
