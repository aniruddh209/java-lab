import java.util.Scanner;
public class lab3A1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Mark in maths=");
	    double mark1=sc.nextDouble();
		System.out.println("enter a Mark in phy=");
		double mark2=sc.nextDouble();
		System.out.println("enter a Mark in chem=");
		double mark3=sc.nextDouble();
		System.out.println("enter a Mark in java=");
		double mark4=sc.nextDouble();
		System.out.println("enter a Mark in phython=");
		double mark5=sc.nextDouble();
		double total=(mark1+mark2+mark3+mark4+mark5)/5;
		if (total>=60) {
			System.out.println("First Division");
		}
		if (total>=50 && total<=59) {
			System.out.println("Second Division");	
		}
		if (total>=40 && total<=49) {
			System.out.println("third devison");
			
		}
		if (total<40) {
			System.out.println("You faill my friend");
			
		}

	}
}