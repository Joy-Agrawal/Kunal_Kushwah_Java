package KunalKushwahJava.Recursion.SubsetSubsequenceStrings;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string whose substring are to be calculated");
        String str = sc.next();
        substrings("",str);
        System.out.println();

        ArrayList<String> ans = substrings2("",str);
        System.out.println(ans);
    }

    static void substrings(String p, String up){
        if(up.length() == 0){
            System.out.print(p + "\t");
            return;
        }
        char ch = up.charAt(0);
        substrings(p+ch,up.substring(1));//either add the character to the processed or not add
        substrings(p,up.substring(1));
    }

    //Another method
    //adding all the substrings in an arraylist
    static ArrayList<String> substrings2(String p, String up){
        if(up.length() == 0){
            ArrayList<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = substrings2(p+ch,up.substring(1));
        ArrayList<String> right = substrings2(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
