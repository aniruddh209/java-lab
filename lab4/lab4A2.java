import java.util.Scanner;
public class lab4A2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the array=");
		int length=sc.nextInt();
		int[]arr=new int[length];
		for(int i=0;i<arr.length;i++){
			System.out.println("enter a elemant=");
			arr[i]=sc.nextInt();
		}
		int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

		double avg = (double) sum / arr.length;
		System.out.println("avg=" +avg);

	}
}