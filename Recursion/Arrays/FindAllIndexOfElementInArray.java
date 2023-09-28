package KunalKushwahJava.Recursion.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllIndexOfElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  {5,4,87,7,5,41,21,52,67,21,14,22};
        System.out.println("Enter the target element to be searched");
        int target = sc.nextInt();
        findAllIndex(arr,target, 0);
        System.out.println(list1);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndex2(arr,target, 0,list));
//        or
        System.out.println(findAllIndex2(arr,target,0,new ArrayList<>()));
        System.out.println(findAllIndex3(arr,target,0));
    }

//    To find all the index of the target element , we will create an array list and store all the indices in that
    static ArrayList<Integer> list1 = new ArrayList<>();
    public static void findAllIndex(int arr[], int target, int index){
        if(index == arr.length -1){
            return ;
        }
        else if (arr[index] == target){
            list1.add(index);
        }
        findAllIndex(arr,target,index+1);
    }

    //or
    public static ArrayList findAllIndex2(int arr[],int target,int index,ArrayList<Integer> list){
        if(index == arr.length-1)
            return list;
        else if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex2(arr,target,index+1,list);
    }

//    wihtout taking arraylist in parmaters
    public static ArrayList findAllIndex3(int arr[],int target,int index){
        ArrayList<Integer> list  = new ArrayList<>();
        if(index == arr.length-1)
            return list;

        else if (arr[index] == target) {
            list.add(index);//this will add items for current function call only
        }
//        return findAllIndex2(arr,target,index+1,list);
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr,target,index+1,list);
        list.addAll(ansFromBelowCalls);//this will add the answer from below calls to current list

        return list;
    }
}
