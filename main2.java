import java.util.Scanner;
public class main2 {
    public static void main (String []args) {
Scanner scanner = new Scanner (System.in);
System.out.println("Enter first number: ");
double num1 = scanner.nextDouble();

System.out.println("Enter second number: ");
double num2 = scanner.nextDouble();

System.out.println("Addition: " + (num1 + num2));
System.out.println("Subtraction:" + (num1 - num2));
System.out.println("Multiplication: " + (num1 * num2) );

if (num2 != 0) {
    System.out.println("Division: " + (num1 / num2));
} else {
    System.out.println("Division by zero is not possible");
}
    }
}
