package day5;

public class Student {
	 String name;
	    int age;

	    
	    public Student() {
	        
	    }

	    
	    public Student(String n) {
	        name = n;    
	    }

	    public Student(String n, int a) {
	        name = n;
	        age = a;
	    }

	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }



}
