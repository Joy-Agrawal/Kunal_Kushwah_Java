package KunalKushwahJava;

import java.util.Scanner;
public class Selection {
//    static void swap(int arr1,int arr2){
//        int temp=arr1;
//        arr1=arr2;
//        arr2 =temp;
//    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the array Elements");;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("Entered Array is");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("performing selection sort...");
            for(int i=0;i<n-1;i++){
                int imin=i;
                for(int j=i;j<n;j++){
                    if(arr[imin]>arr[j]){
                        int temp=arr[imin];
                        arr[imin] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.println("Sorted array is :");
            for(int i=0;i<n;i++){
                System.out.print(arr[i] + " ");
            }
        }
    }
