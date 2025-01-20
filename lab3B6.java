import java.util.Scanner;
public class lab3B6{
	public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int reverse=0;
	System.out.println("Enter a number=");
	int number=sc.nextInt();
	int orignalnumber=number;
	while(number!=0){
		int digit=number%10;
		reverse=reverse*10+digit;
		number/=10;	
	}
	if(orignalnumber==reverse)
		System.out.println("Palindrom num="+reverse);

	else
		System.out.println("not palndrom");
	}
}