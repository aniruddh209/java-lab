import java.util.Scanner;
public class lab3A2{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number=");
		int num=sc.nextInt();
		if (num%2==0) {
			System.out.println("num is even");	
		}
		else{
			System.out.println("num is odd");
		}

}}