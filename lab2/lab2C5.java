import java.util.Scanner;
public class lab2C5{
	public static void main(String[]args){
		Scanner ani=new Scanner(System.in);
		System.out.println("ente a number 1=");
		double a=ani.nextDouble();
		System.out.println("enter a second number 2=");
		double b=ani.nextDouble();
		System.out.println("enter a third number 3=");
		double c=ani.nextDouble();
		if(a>b){
			if(a>c){
				System.out.println("a is largest");
			}else{
				System.out.println("c is largest");
			}
		  }else if(b>a){
		  	if(b>c){
		  		System.out.println("b is largest");
		  	}else{
		  		System.out.println("C is largest");
		  	}
		  }


		  }
		}