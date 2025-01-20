import java.util.Scanner;
public class p4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterd a number");
		double a = sc.nextDouble();
		int b = sc.nextInt();
		System.out.println("Enterd int number ="+b);
		System.out.println("Enterd double number="+a);
		System.out.println(a+b);
		sc.nextLine();
		System.out.println("Entered String");
		String s1 = sc.nextLine();
		String s2 =sc.next();
		System.out.println("string first="+s1);
		System.out.println("string second="+s2);

	}
}