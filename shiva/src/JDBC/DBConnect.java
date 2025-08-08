package JDBC;
import java.sql.*;
import java.util.Scanner;

public class DBConnect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/hospital", "root", "Shiva@1234567"
            );
            System.out.println(" Connected to hospital database");

           
            String createTableSQL = "CREATE TABLE IF NOT EXISTS patients ("
                    + "id INT PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR(100), "
                    + "age INT, "
                    + "disease VARCHAR(100), "
                    + "admission_date DATE, "
                    + "doctor_assigned VARCHAR(100))";

            Statement stmt = con.createStatement();         
            stmt.executeUpdate(createTableSQL);              

          
            System.out.print("Enter Patient Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Enter Disease: ");
            String disease = sc.nextLine();

            System.out.print("Enter Admission Date (YYYY-MM-DD): ");
            String admissionDate = sc.nextLine();

            System.out.print("Enter Doctor Assigned: ");
            String doctor = sc.nextLine();

           
            String insertSQL = "INSERT INTO patients(name, age, disease, admission_date, doctor_assigned) "
                             + "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pstmt = con.prepareStatement(insertSQL); 
            pstmt.setString(1, name);                   
            pstmt.setInt(2, age);                       
            pstmt.setString(3, disease);              
            pstmt.setDate(4, Date.valueOf(admissionDate));
            pstmt.setString(5, doctor);                

          
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Patient registered successfully!");
            }
            pstmt.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace(); 
        }

        sc.close(); 
    }
}
