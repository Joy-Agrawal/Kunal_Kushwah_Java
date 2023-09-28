package KunalKushwahJava.Recursion.SubsetSubsequenceStrings;

public class RemoveAll_a {

    public static void remove(String p,String up){//p-> processed, up-> Unprocessed
        if(up.isEmpty()){//if unprocessed string becomes empty then print the processed string
            System.out.println(p);
            return ;
        }
        char ch = up.charAt(0);
        if(ch == 'a' || ch == 'A'){
            remove(p,up.substring(1));//substring from index 1,means that the string except the first character is passed
        }
        else{
            remove(p+ch,up.substring(1));//the character will be added to processed string
        }
    }
//    another method
    public static String remove(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch =='a' || ch == 'A'){
            return remove(str.substring(1));//i.e skipping that character
        }
        else {
            return ch + remove(str.substring(1));//adding the character to answer
        }
    }

    public static void main(String[] args) {
        String str = "aabbbbdjdhgkjdfgdaklgfa";
        remove("",str);
//      another  method
        String ans = remove(str);
        System.out.println(ans);
    }
}
