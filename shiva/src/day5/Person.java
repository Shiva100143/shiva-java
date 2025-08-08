package day5;

public class Person {
	 String name;
	int age;

	 public Person(String name, int age) {
	 this.name = name;
	 this.age = age;
     System.out.println("Explicit constructor called!");;
	}


   public Person() {
	  this.name = "Shiva";
	  this.age = 24;
  System.out.println("!");;
	 }

  public void display() {
	System.out.println("Name: " + name + ", Age: " + age);;
}

	
}
