package KunalKushwahJava.Recursion.Arrays;

public class IsArraySorted {
    public static void main(String[] args) {
        int arr1[] = {1,5,2,6,7,8,9,14};
        int arr2[] = {1,2,6,7,8,9,14};
        System.out.println(isSorted(arr1,0));
        System.out.println(isSorted(arr2,0));
    }

    public static boolean isSorted(int arr[],int index){
        if(index == arr.length-1){//it means that we have reached to the end ,hence array is sorted
            return true;
        }

        //if(arr[index > arr[index] then we will not check further,i.e isosrted function will not be called
//        because of short hand property of && operation,
//        since the && of false with anything will give false, hence it will not evaluate further
        return (arr[index] <= arr[index+1])  && isSorted(arr,index+1);
    }
}
