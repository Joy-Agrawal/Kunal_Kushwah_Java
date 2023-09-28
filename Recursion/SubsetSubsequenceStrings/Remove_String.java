package KunalKushwahJava.Recursion.SubsetSubsequenceStrings;

public class Remove_String {
//    //in previous question we removed a particular character
//    if we want to remove any particular sub string from the string then
    //for example remove all the substring "app" from the given string

    public static String remove(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")){
            return remove(up.substring("app".length()));
        }
        else{
            return up.charAt(0) + remove(up.substring(1));
        }
    }
    //another funciton to remove only app and not apple ,i.e only remove the substring if it is not a part of another substring
    public static String remove2(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")  && !up.startsWith("apple")){
            return remove2(up.substring("app".length()));
        }
        else{
            return up.charAt(0) + remove2(up.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "apphelloapplehuuehfhappnffapp";
        System.out.println("Original String :"+str);
        String ans = remove(str);
        System.out.println("After removing :" +ans);

        String ans2 = remove2(str);
        System.out.println("After removing only app and not apple : "+ans2);
    }
}
