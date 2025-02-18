import java.util.Scanner;

public class lab4A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();

        int vowel = 0;
        int consonants = 0;
        int length = s1.length();
        char ch;

        for (int i = 0; i < length; i++) {
            ch = s1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel++;
            } else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                consonants++;
            }
        }

        System.out.println("Vowels = " + vowel);
        System.out.println("Consonants = " + consonants);
    }
}