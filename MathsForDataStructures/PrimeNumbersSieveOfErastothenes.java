package KunalKushwahJava.MathsForDataStructures;

import java.util.Scanner;
//time Complexity : O(n*log(logn))

public class PrimeNumbersSieveOfErastothenes {

    //in this approach we will make a list of all the numbers upto which the prime numbers has to be find
    //now starting from i = 2 , we will mark all the factors of i as false
    //moving forward , if i is already false we will not check for it and move forward.Integer
    //this thing we will do until the square of the number, now all the remaining elements are the prime numbers

//    since here when we create an array then intitially all the elements are initialized with false
//so instead of intializing them all with true and then performing the above operation
//we will just mark all the non primes or factors as true , and will consider the leftover false elements as primes

    public static void sieve(int n,boolean primes[]){
        for(int i = 2;i*i <=n ;i++){
            if(!primes[i]){//or (primes[i] == False)
                for(int j=i*2;j<=n;j+=i){
                    primes[j] = true;
                }
            }
        }
        //printing all primes
        for(int i =2;i<n;i++){
            if(!primes[i]){
                System.out.print(i+", ");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n : ");
        n = sc.nextInt();
        boolean[] primes = new boolean[n+1];//n+1 is t include the last element also
        sieve(n,primes);
    }
}
