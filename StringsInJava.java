package KunalKushwahJava;

public class StringsInJava {
    public static void main(String[] args) {
        //Strings variables can be created as an object of String class
        // The strings are stored in java in string pool
//        the string pool is like a separate portion created in memory
//        if there are n string variables containing the same strig value then only one object is created in string pool
        // all the variables containing the same value will point to the single object
//        for ex:
//        String a = "Hello welcome to strings";
        String b = "Hello welcome to strings";
//        Now both the variable a and b will point to single object

//        Strings are immutable i.e once the value is assigned it cannot be modified
//        this immutability cannot be seen in real working as the variables value can be changed
//        The immutability refers that when we change the value of variable so a new object will be created in string pool rather than overwriting or replacing the old object
//        for ex
        String a = "Joy";
        System.out.println(a);

        a = "Joy Agrawal";
        //now here rather than updating the old object , a new object is created
        // this immutability is for security purposes
        System.out.println(a);




//        Print all alphabets
        String series = "";
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i );
            series = series +ch;
        }
        
        System.out.println(series);
        //here so many objects are created hence this method is not efficient

        //Another Method
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i );
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
