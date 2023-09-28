package KunalKushwahJava.MathsForDataStructures;
import javax.swing.*;
import java.util.Scanner;

public class NewtonsRaphsonsMethodSquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Answer: " + sqrt(n));
    }
    public static double sqrt(int n){
        double x = n;//x = assumed root
        double root;
        while(true){
            root = (x+(n/x))/2;//this is the newtons formula

            if(Math.abs(root - x) < 0.5){//(root-x) is also called error
                break;//we have found the answer
            }
            //else update the assumed value to root
            x = root;
        }
        return root;
    }
}
