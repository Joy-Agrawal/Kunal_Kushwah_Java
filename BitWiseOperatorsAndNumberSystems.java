//import java.util.Arrays;
//import java.util.ConcurrentModificationException;
//import java.util.Scanner;
//
//
////NOTE: Very important tricks and questions
//public class BitWiseOperatorsAndNumberSystems {
//    //All the data are stored in computer in bit form
//    // And : Truth table
////                    A   |   B
////                    0   |   0       0
////                    0   |   1       0
////                    1   |   0       0
////                    1   |   1       1
////    -> if you perform and operation of any no with 1 it remains the same
////            or we can say if we perform the and operation of any no with 1 then the digits remain the same
//    // Or : Truth table
////                    A   |   B
////                    0   |   0       0
////                    0   |   1       1
////                    1   |   0       1
////                    1   |   1       1
//    // X-OR (if and only if): Truth table
////                    A   |   B
////                    0   |   0       0
////                    0   |   1       1
////                    1   |   0       1
////                    1   |   1       0
////    X-OR of any no with 1 returns the complement of that number
////    for ex: 0 X-OR 1 = 1
////            1 X-OR 1 = 0
//    //    X-OR of any no with 0 returns the same number
////    for ex: 0 X-OR 0 = 0
////            1 X-OR 0 = 1
//    //    X-OR of any no with the no itself returns Zero(0)
////    for ex: 50000 X-OR 50000 = 0
////            45786 X-OR 45786 = 0
//
//
//
////    Number System:
////
////    1 Decimal : 0,1,2,3,4,5,6,7,8,9     Base : 10
////    2 Binary : 0,1                      Base : 2
////    3 Octal : 0,1,2,3,4,5,6,7           Base : 8
////    4 Hexadecimal : 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F         Base: 16
////
////    Conversations :
//////    -> Decimal to any base b : keep dividing by base, take remainders and write in opposite
//////       For Ex:
//////        2|17
//////        2|8     1
//////        2|4     0
//////        2|2     0
//////        2|2     0
//////        2|1     1
//////    Hence (17) = 10001
////
////
////    -> Any Base to Decimal:  Multiply and add the power of base with digits
////
////    Continuing with operators:
////    1. left Shift operator(<<):
////        * since all no.'s are converted in binary forn before performing any operation
////        * it shifts all digits in binary form towards left and add 0 at the last place.
////
////        *   a << b = a * 2 power b.
////        *** instead of multiplying by 2 in any code just letshift it by 1 , since bitwise operations are faster hence it will increase the efficiency
////
//
////    2. Right shift (>>):
////        * it shifts all digits in binary form towards right
////
////        * a >> b = a / 2 power b .
////        *** instead of dividing any number by 2 just right shift it by 1.
////
//
////    Questions :
////    1. Given a number n check whether it is even or odd ?
////        -> if the last digit in binary form is 1 then the no is odd
////        -> if the last digit in binary form is 0 then the no is even
////
////        -> for checking the number to be even or odd
////            we just simply perform and operation of that number with 1
////            for Ex: 6 = 110
////            now 6 & 1 =>   1 1 0
////                         & 0 0 1
////                                0       Hece even
//
//    static boolean isOdd(int n){
//        if((n&1) == 1 ){
//            return true;
//        }
//        else return false;
//    }
//
////    2. In an array each no is repeated twice , except only one no which is present only one time , find that number
////        -> since X-OR of a number with itself gives Zero(0)
////        -> and X-OR of any number with 0 gives the number itself.
////        -> Since all the binary operations are Associative , i.e 5 * 4 = 4 * 5
////
////        -> we just X-OR all the elements of the array and the result will be the number present only.
////
//
//
//    static int findUnique(int[] arr){
//        int unique = 0;
//        for(int n :arr){
//            unique = n ^ unique;
//        }
//        return unique;
//    }
//
////    3. Find i th bit of a no. ?
////        -> To find the ith bit of any no we just perform AND operation of that bit by one and rest bits with zero.
////            for ex : 1 0 1 1 1 0 1
////
////            5th bit : 1 0 1 1 1 0 1
////                      0 0 1 0 0 0 0
////                                        ans : 1
////
////        -> Now the problem is how to construct such number which contains rest of the i-1 bits as zero(also called mask number) and ith bit as zero.
////        -> This thing can be done by left shifting 1 by i-1.
////        -> i.e 1 << i-1
//
//
//    static int ithBit(int n,int i){
//        return n & (1 << (i-1));
//    }
//
////    4. Set the ith bit of the given number?
////        -> Setting a bit means turn it to 1 ,
////        -> i.e if the bit is 0 make it 1 and if it is 1 then remain as it as.
////        -> since performing OR of any bit with 1 gives 1 , hence we will perform the or operation of the ith bit with 1
////        -> we will calculate the mask number as done above  by left shifting 1 by i-1 times
////        ->then we will perform the OR operation with mask number.
//
//    static int setithBit(int n,int i){
//        return n | (1<<(i-1));
//    }
////    5. Reset the ith bit of the given number.
////        -> Resetting a bit means turn it to 0.
////        -> i.e if the bit is 0 make it 1 and if it is 1 then remain as it as.
////        -> since performing & with zero returns/gives zero .
////        -> hence we first calculate the complement of mask number and then perform the AND operation with the given number
//
////    static int reset_ithBit(int n,int i){
////        return n & !(1<<(i-1));
////    }
//
////    6. Find the right most set bit of a given number
////            ->
//
//
//    static int rightMostSetBit(int n){
//        for(int i=1;i<=(int)(Math.log(n))/Math.log(2) + 1;i++){
//            if((n & (1 << (i-1))) == 1){
//                return i;
//            }
//        }
//        return 0;
//    }
//
////    7.
//
//
//
//
//
//
//
//
//
////    8. Find nth magic number
////            -> nth magic number is obtained by first converting the number to binary number
////            -> Then for multiply each in sequence with 5 raise to power i , where i starts from 1 and incremented by one for each bit.
////            -> for ex: 5 => (1 0 1)
////            hence magic number =  1 * 5^3 + 0 * 5^2 + 1 * 5^1 == 125+0+5 => 130
////            -> for ex: 4 => (1 0 0)
////            hence magic number =  1 * 5^3 + 0 * 5^2 + 0 * 5^1 == 125+0+0 => 125
//
//    static int nthMagicNumber(int n){
//        int ans =0,base =5;
//        while(n>0){
//            int last = n & 1;
//            n = n >> 1;
//
//            ans = ans + base * last;
//            base *= 5;
//        }
//        return ans;
//    }
//
////    9. Find no of digits in base b?
////        ->Since log a base b = x
////            => a = b ^ x;
////        -> hence the no of digits in base is given as:
////            ceil(logb n)
//    static int noOfDigitsInAnyBase(int n,int base){
//            int ans = (int)Math.ceil((Math.log(n))/Math.log(base));
//            return ans;
//    }
//
//
////    10. Find the sum of nth row of pascal's triangle
////        -> pascals triangle
////            1
////            1 1
////            1 2 1
////            1 3 3 1
////            1 4 6 4 1
////            1 5 10 10 5 1
////
////        -> sum of each row is : 2^n -1 , for one based indexing of row
////        -> sum of nth row = 2^(n-1)
////            or we can say : 1 << (n-1)
//    static int sumOfNthRowOfPascalsTriangle(int rowno){
//        return 1 << (rowno-1);
//    }
//
////    11. you are given a number find out whether it is power of 2 or not
////        -> if a no is a power of two it will be represented With 1 As msb or the right most bit and rest all bits are zero
////        -> i.e  Ex: 10000000
////                    100000
////        -> now if we subtarct 1 from a no which is a power of two then there will be one bit less and all the digits become 1
////        -> i.e : 1 0 0 0 0
////                -0 0 0 0 1
////                 0 1 1 1 1
////        -> now if we perform and operation of this no with the original number we will get 0
////        -> hence we can conclde that the AND operation between n and n-1 will be zero if n is power of 2
////
//    static boolean isPowerOfTwo(int n){
//        int ans = n & (n-1);
//        (ans == 1)? return false: return true;
//    }
//
////    12. calculate a^b?
//
//    static void power(int a,int b){
//        int power = b;
//        int base = a;
//        int ans =1;
//        while(power>0){
//            if((power &1) == 1){
//                ans *= base;
//            }
//            base *= base;
//            power = power >> 1;
//        }
//        System.out.println(ans);
//    }
//    public static void main(String[] args) {
//        System.out.println("Problem  1 : Check whether the no is even or odd");
//        System.out.println("Solution 1 : ");
//        System.out.println("Enter the number");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean ans = isOdd(n);
//        if(ans == true){
//            System.out.println("Odd");
//        }
//        else
//            System.out.println("Even");
//        System.out.println("Problem  2 : In an array each no is repeated twice , except only one no which is present only one time , find that number");
//        System.out.println("Solution 2 : ");
////        System.out.println("Enter the number");
//        int arr[] ={3,2,5,6,7,8,9,8,7,6,2,3,5};
//        System.out.println(Arrays.toString(arr));
//        int ans2 = findUnique(arr);
//        System.out.println("unique Element: " + ans2) ;
//
//        System.out.println("Problem  3 :  Find i th bit of a no. ?");
//        System.out.println("Solution 3 : ");
//        System.out.println("Enter the number");
//        n = sc.nextInt();
//        System.out.println("Enter the value of i ");
//        int i = sc.nextInt();
//        System.out.println(ithBit(n,i));
//
//        System.out.println("Problem  4 :  set the i th bit of a no. ?");
//        System.out.println("Solution 4 : ");
//        System.out.println("Enter the number");
//        n = sc.nextInt();
//        System.out.println("Enter the value of i ");
//        i = sc.nextInt();
//        System.out.println(setithBit(n,i));
//
//        System.out.println("Problem  5 :  Reset i th bit of a no. ?");
//        System.out.println("Solution 5 : ");
//        System.out.println("Enter the number");
//        n = sc.nextInt();
//        System.out.println("Enter the value of i ");
//        i = sc.nextInt();
////        System.out.println(reset_ithBit(n,i));
//
//        System.out.println("Problem  6 :  Find the right most set bit of a given number");
//        System.out.println("Solution 6 : ");
//        System.out.println("Enter the number");
//        n = sc.nextInt();
////        System.out.println("Enter the value of i ");
////        i = sc.nextInt();
////        System.out.println(reset_ithBit(n,i));
//
//        System.out.println("Problem 8 : Find nth magic number");
//        System.out.println("Enter the value of n");
//        n = sc.nextInt();
//        System.out.println("nth magic number : " + nthMagicNumber(n));
//
//        System.out.println("Find the no of digits in any base b");
//        System.out.println("Enter the Number ");
//        n = sc.nextInt();
//        System.out.println("Enter the base for that Number");
//        int base = sc.nextInt();
//        System.out.println("No of Digits: "+ noOfDigitsInAnyBase(n,base));
//    }
//}
