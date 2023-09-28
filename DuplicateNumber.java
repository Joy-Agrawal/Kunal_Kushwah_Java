package KunalKushwahJava;

public class DuplicateNumber {
    //Leetcode Problem: 287
    // use of cyclic sort
//    given an arrayof integers  nums containing n+1 integers where each integeris in the range [1,n] inclusive
//    there is only one repeated number in nums ,return the repeated number

    public static  int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex] ){ //[2,1,4,3,3,3] [1,2,4,3,3,3] [1,2,3,4,3,3]         && arr[i] == i+1
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        return 1;
    }
    public static void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void main(String[] args) {

    }
}
