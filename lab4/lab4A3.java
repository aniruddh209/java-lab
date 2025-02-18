import java.util.Scanner;
public class lab4A3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of the arry=");
		int length=sc.nextInt();
		int[] arr=new int[length];
		for (int i=0;i<length ;i++ ) {
			System.out.println("Enter the arry elemants");
			arr[i]=sc.nextInt();
		}
		System.out.println("reverse=");
		for (int i=length-1;i>=0 ;i-- ) {
			System.out.println(" "+arr[i]);
		}
	}
}