package KunalKushwahJava;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumber {
    //Leetcode problem no : 448
    //use of cyclic sort
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else i++;
        }
        List<Integer> ans = new ArrayList<>();
        for(i =0 ; i<nums.length;i++){
            if(nums[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
    static void swap(int arr[],int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
}
