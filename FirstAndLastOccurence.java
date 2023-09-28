package KunalKushwahJava;

public class FirstAndLastOccurence {
    static int firstOccurence(int[] arr, int key){
        int start = 0;
        int last = arr.length-1;
        int ans = -1;
        while(start<=last){
            int mid = start + (last - start)/2;
            if(arr[mid] == key){
                ans = mid;
                last = mid-1;
            }
            else if (arr[mid] > key){
                last = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    static int lastOcuurene(int[] arr,int key){
        int start = 0;
        int last = arr.length-1;
        int ans =-1;
        while(start<=last){
            int mid = start + (last - start)/2;
            if(arr[mid] == key){
                ans = mid;
                start = mid +1;
            }
            else if (arr[mid] > key){
                last = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,8,8,8,8,9,10};
        System.out.println(firstOccurence(arr,8) + " " + lastOcuurene(arr,8));
    }
}
