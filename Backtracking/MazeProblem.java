package KunalKushwahJava.Backtracking;

import java.util.Scanner;

public class MazeProblem {
//    given a matrix , starting from the first cell we have to reach the last cell by only applying two kind of moves
//    i.e. either right or down
    public static int count(int row ,int col){
        if(row == 1 || col == 1){//i.e last row/coloumn ,, since we are considering first row/coloumn as of index n
            return 1;
        }
        int down = count(row-1,col);
        int right = count(row,col-1);
        return down +right;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("Enter the no of rows and coloumns");
        row = sc.nextInt();
        col = sc.nextInt();
        count(row,col);
    }
}
