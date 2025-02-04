package KunalKushwahJava;

public class PalindromeString {
    //A String is said to be palindromic if it is read as same as orginal and after reversing it
    static boolean isPalindrome(String str){
        if(str== null || str.length()==0){
            return true;
        }
        else{
            str = str.toLowerCase();
            for(int i = 0;i<str.length()/2;i++){
                char start = str.charAt(i);
                char end = str.charAt(str.length()-i-1);
                if(start !=end){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        String str ="abcdcba";
        System.out.println(isPalindrome(str));
    }
}
