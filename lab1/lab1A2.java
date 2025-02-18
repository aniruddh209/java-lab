public class lab1A2{
	public static void main(String[]args){
        // Check if two arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide two numbers as arguments.");
            return;
        }

        // Read command-line arguments
        String arg1 = args[0];
        String arg2 = args[1];

        // Convert arguments to integers
        int num1 = Integer.parseInt(arg1);
        int num2 = Integer.parseInt(arg2);

        // Perform addition
        int sum = num1 + num2;

        // Display the result
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}