import java.util.Scanner;
public class lab5B6{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number to print diamond=");
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			for(int k=0;k<num-1-i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
				System.out.println("");
		}
		for(int i=num-2;i>=0;i--){
			for (int k=0;k<num-1-i;k++) {
				System.out.print(" ");
				
			}
			for (int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}