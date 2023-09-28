package KunalKushwahJava;

import java.util.Scanner;

public class MaxWealth {
    //Leetcode question : 1672
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer = sc.nextInt();
        int bank = sc.nextInt();
        int[][] accounts = new int[customer][bank];

    }
    static int maximumWealth(int[][] accounts){
        //person = row
        // account =coloumn
        int max =Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
            //take a new sum for each row
            int rowsum =0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum+= accounts[person][account];
            }
            if(rowsum>max)
                max =rowsum;
        }
        return max;
    }
}
