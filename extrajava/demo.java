import java.util.Scanner;

public class RotatedArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Input target
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Perform linear search
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break; // Stop searching once found
            }
        }

        // Output the result
        if (result != -1) {
            System.out.println("Index of " + target + ": " + result);
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }
}