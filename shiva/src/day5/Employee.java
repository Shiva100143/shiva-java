package day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Employee {
	int id; String name; double salary;
    Employee(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public String toString() { return id + " " + name + " " + salary; }
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
            new Employee(101, "Alice", 50000),
            new Employee(102, "Bob", 70000),
            new Employee(103, "Charlie", 40000),
            new Employee(104, "David", 60000)
        );
        list.sort(Comparator.comparingDouble(e -> e.salary));
        list.forEach(System.out::println);;
}




}
