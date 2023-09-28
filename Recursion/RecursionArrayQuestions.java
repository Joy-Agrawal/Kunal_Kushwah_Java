package KunalKushwahJava.Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionArrayQuestions {
    //In this ,we will deal with recursion questions involving arrays

//    Question 1 : Find whether the array is sorted or not?
//    Solution:
    static boolean isSorted(int arr[],int index){
//        Base Condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index] <=arr[index+1] && isSorted(arr,index+1);
    }

//    Question 2 : Linear Search with recursion
//    Solution:

    static boolean linearSearch(int arr[],int target,int index){
        if(index == arr.length-1){
            return false;
        }
        return arr[index] == target || linearSearch(arr,target,index+1);
    }
//    or to find the index by linear search through recursion
    static int findIndex(int arr[],int target,int index){
        if(index == arr.length ){
            return -1;
        }
        if(arr[index] == target ){
            return index;
        }
        else {
            return findIndex(arr,target,index+1);
        }
    }
//    to find the last occurence of the element
    static int findLastIndex(int arr[],int target,int index){
//        NOTE: while calling the function pass the last index of the array in the place of index
        if(index < 0){
            return -1;
        }
        if(arr[index]  == target){
            return index;
        }
        else{
            return findIndex(arr,target,index-1);
        }
    }
//    To find all the index of the target element , we will create an array list and store all the indices in that
    static ArrayList <Integer> list = new ArrayList<>();
    static void findAllIndex(int arr[],int target,int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    static ArrayList findAllIndexlist(int arr[],int target,int index){
        ArrayList <Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        list.addAll(findAllIndexlist(arr,target,index+1));
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,21,21,32};
        System.out.println(isSorted(arr,0));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        System.out.println(linearSearch(arr,target,0));
        System.out.println("the target element found at index: "+ findIndex(arr,target,0));
        System.out.println("the Last index of the target element: "+ findLastIndex(arr,target,arr.length-1));
        findAllIndex(arr,target,0);
        System.out.println("All the index of the target element: "+findAllIndexlist(arr,target,0));
    }
}
