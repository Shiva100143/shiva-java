package day8;

public class String {

	public static void main(java.lang.String[] args) {
		 java.lang.String input = "123";
	        try {
	            int number = Integer.parseInt(input);  
	            System.out.println("Converted number: " + number);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Cannot convert to int.");
	}
}

}
