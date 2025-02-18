import java.util.Scanner;
public class lab1B5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a length into meter=");
		double m=sc.nextDouble();
		double f=m*3.28084;
		System.out.println("meter to feet="+f);
	}
}