import java.util.Scanner;
public class lab3B5{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a Year you check=");
		int year=sc.nextInt();
		if(year%400==0){
			System.out.println("leap Year");
		}
		else if(year%100==0){
			System.out.println("not a leap yer");
		}
		else if(year%4==0){
			System.out.println("leap year");
		}
		else{
			System.out.println("not a leap year");
		}
		}

	}