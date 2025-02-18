import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.print("Enter the target value: ");
        int target = sc.nextInt();


        int targetIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex != -1) {
            System.out.println("Printing from " + target + " onward:");

            for (int i = targetIndex; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }

            for (int i = 0; i < targetIndex; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println(); 
        } else {
            System.out.println(target + " not found in the array.");
        }

        sc.close();
    }
}