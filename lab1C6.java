import java.util.Scanner;
public class lab1C6{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter=");
		String input=sc.next();
		if(input.length()!=1||!Character.isLetter(input.charAt(0))){
			System.out.println("Invalid input");
		}else{
			char letter=input.charAt(0);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("The letter is a consonant.");
            }
		}
	}
}