package shiv;

import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

       
        String[] students = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = sc.nextLine();
        }

        
        char[][] attendance = new char[n][7];
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        
        System.out.println("\nEnter attendance (P/A) for each student and day:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student: " + students[i]);
            for (int d = 0; d < 7; d++) {
                System.out.print(days[d] + ": ");
                attendance[i][d] = sc.next().toUpperCase().charAt(0);
            }
        }

        
        System.out.println("\nAttendance Record:");
        System.out.print(String.format("%-10s", "Name"));
        for (String day : days) {
            System.out.print(String.format("%5s", day));
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(String.format("%-10s", students[i]));
            for (int d = 0; d < 7; d++) {
                System.out.print(String.format("%5c", attendance[i][d]));
            }
            System.out.println();
        }

        sc.close();
    }
}
