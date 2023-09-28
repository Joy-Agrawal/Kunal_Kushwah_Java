package KunalKushwahJava;

import java.util.Scanner;

public class MissingNumber {
    //Leetcode problem no : 268
    //use of cyclic sort
     public static int missingnumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            if (nums[i] < nums.length  && nums[i] != nums[correctIndex] ) {
                swap(nums, i, correctIndex);
            } //nums[] = {2,3,1,0};
            else {
                i++;
            }
        }
        //search for missing numnber
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index)
                return index;
        }
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums ={3,0,1};
        System.out.println(missingnumber(nums));
    }
}