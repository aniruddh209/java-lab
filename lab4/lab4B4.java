import java.util.Scanner;
public class lab4B4{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string=");
		String s1=sc.nextLine();
		int length=s1.length();
		System.out.println("length of the string="+length);
		for (int i=0;i<length/2 ;i++) {
			System.out.println(s1.charAt(i));
		}
	}
}