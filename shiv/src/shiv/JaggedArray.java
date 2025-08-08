package shiv;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] project = new int[2][];
        project[0] = new int[3]; 
        project[1] = new int[2];

        // Input elements
        System.out.println("Enter 3 numbers for first row:");
        for (int i = 0; i < 3; i++) {
        	project[0][i] = sc.nextInt();
        }

        System.out.println("Enter 2 numbers for second row:");
        for (int i = 0; i < 2; i++) {
        	project[1][i] = sc.nextInt();
        }

        
        System.out.println("project array:");
        for (int i = 0; i < project.length; i++) {
            for (int j = 0; j < project[i].length; j++) {
                System.out.print(project[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
