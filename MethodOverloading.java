package KunalKushwahJava;

public class MethodOverloading  {
//    Method Overloading is an act of having several methods having same name with different parameters
//    ex:
    static int add (int a, int b){
        System.out.println("Inside First Add");
        return a+b;

    }
    static String add (String a, String b){
        System.out.println("Inside Second Add");
        return a+b;

    }

    public static void main(String[] args) {

        System.out.println(add(56,48));
        System.out.println(add("Hello","World"));
    }
}
