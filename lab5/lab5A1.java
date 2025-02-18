import java.util.Scanner;
public class lab5A1{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string=");
		String input=sc.nextLine();
		System.out.println("enter the length of the string=");
		int length=input.length();
		for (int i=1;i<=length;i++ ) {
			System.out.println(input.substring(i,0));
			
		}
		
	}

}
//Stream=0,1=input i=1 so print only 0 index