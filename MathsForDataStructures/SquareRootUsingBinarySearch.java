package KunalKushwahJava.MathsForDataStructures;

import java.util.Scanner;

public class SquareRootUsingBinarySearch {
    //Time Complexity: O(log(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,precision;
        System.out.println("Enter the value of n and precision");
        n = sc.nextInt();
        precision = sc.nextInt();
//        System.out.println(sqrt(n,precision));
        System.out.printf("%.3f",sqrt(n,precision));//here we are using formatted printing to print only upto 3 decimal places
    }
    public static double sqrt(int n, int precision){
        int start =0,end =n;
        double root = 0.0;

        while(start <= end){//if the number is perfect square then it will return the answer
            //else if the number is not prime then after some time start will be greater than end and we wiil exit the loop
//            with mid containing the integer value of the root and now we will calculate the decimal values
            int mid = start + (end-start)/2;
            if(mid*mid == n){
                return mid;
            } else if (mid*mid >n) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
//        now calculating the decimal value if it is not a perfect square
        double increment = 0.1;
        for(int i =0;i<precision;i++){
            while(root*root <=n){
                root += increment;
            }
            //since the while loop condition will break when the value of root becomes greater than actual so decrement
            root-= increment;
            //for each iteration of precision value divide the value of increment by 10
            increment /=10;
        }
        return root;
    }
}
