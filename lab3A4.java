import java.util.Scanner;
public class lab3A4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number=");
		double num=sc.nextDouble();
		for (int i=2;i<=num;i++ ) {
			if(num%i==0){
			System.out.println(" not prime this is");
			return ;
			}
		}
		System.out.println("prime");
}}