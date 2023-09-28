package KunalKushwahJava.Recursion;

import java.util.Scanner;
import java.util.*;

public class RecursionSubsetSubsequenceStringQuestions {
//    Kunal Kushwah video no : 32
//    given a string write a function to remove all the 'a' from it
    static String remove_a(String str) {
        String ans = new String();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a') {
                ans += str.charAt(i);
            }
        }
        return ans;
    }

//    Subsets :  Non adjacent collection
//    ex: [3,5,9] == [3],[5],[9],[3,5],[5,9],[3,9],[3,5,9]
//     NOTE: [3,5] is equal to [5,3], i.e [a,b] = [b,a]
//      Subsets are known as subsequences in case of strings
//    Given a string find all the subsequences of the string
    static void subsequences(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + "  ");
            return;
        }
        char ch = up.charAt(0);
        subsequences(p+ch,up.substring(1));
        subsequences(p,up.substring(1));
    }
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = remove_a(str);
        System.out.println("String formed after removing all the a from it : ");
        System.out.println(ans);

        System.out.println("Problem : Find all the subsequences of the entered String ");
        System.out.println("Enter the String");
        String sub = sc.next();
        subsequences("", sub);
    }
}

