package KunalKushwahJava;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string and target character");
        String str = sc.next();
        char target = sc.next().charAt(0);
        System.out.println(search(str,target));
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
