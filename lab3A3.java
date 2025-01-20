import java.util.Scanner;
public class lab3A3{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enterd a number 1=");
		double num1=sc.nextDouble();
		System.out.println("enterd a number 2=");
		double num2=sc.nextDouble();
		System.out.println("enterd a number 3=");
		double num3=sc.nextDouble();
		if (num1==num2&&num2==num3&&num1==num3) {
			System.out.println("number is equal");
		}else{
		 double largest=(num1>num2)?((num1>num3)?(num1):(num3)):((num2>num3)?(num2):num3);
		 System.out.println("largest="+largest);

	}}
}