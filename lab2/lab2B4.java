import java.util.Scanner;
public class taprature{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enterd Tamprature in Ferhnhit=");
		double f=sc.nextDouble();
		double c=(f-32)*5/9;
		System.out.println("calcuius="+c);
	}
}