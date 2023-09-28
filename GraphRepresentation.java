package KunalKushwahJava;

import java.util.Scanner;

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//no of vertices

        int m = sc.nextInt();//no of edges
        int [][] adjMatrix =new int[n][n];
        for(int i=0;i<m;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1;
        }
        System.out.println(adjMatrix);
    }
}
