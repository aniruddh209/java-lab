import java.util.Scanner;

public class calsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();


        if (operation.equals("+")) {
            System.out.println("sum="+(num1+num2));
        } else if (operation.equals("-")) {
            System.out.println("sum="+(num1-num2));
        } else if (operation.equals("*")) {
           System.out.println("sum="+(num1*num2));        } 

           else if (operation.equals("/")) {
            if (num2 != 0) {
                System.out.println("sum="+(num1/num2));
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } else {
            System.out.println("Error: Invalid operation.");
        }
    }
}