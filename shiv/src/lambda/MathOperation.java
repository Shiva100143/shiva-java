package lambda;

interface MathOperation {
int operate(int a, int b);
}

public class MathOperation {
public static void main(String[] args) {

MathOperation add = (a, b) -> a + b;

MathOperation subtract = (a, b) -> a - b;

MathOperation multiply = (a, b) -> a * b;

MathOperation divide = (a, b) -> {
 if (b == 0) {
 System.out.println("Cannot divide by zero.");
 return 0;
 }
 return a / b;
};


// int x = 20;
// int y = 10;
//
//System.out.println("Addition: " + add.operate(x, y));
//System.out.println("Subtraction: " + subtract.operate(x, y));
//System.out.println("Multiplication: " + multiply.operate(x, y));
//System.out.println("Division: " + divide.operate(x, y));
}
}
