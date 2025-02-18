import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;
        
        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to exit): ");
            String sentence = scanner.nextLine();3
            
            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }
            
            int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
            
            for (char ch : sentence.toLowerCase().toCharArray()) {
                switch (ch) {
                    case 'a': countA++; totalA++; break;
                    case 'e': countE++; totalE++; break;
                    case 'i': countI++; totalI++; break;
                    case 'o': countO++; totalO++; break;
                    case 'u': countU++; totalU++; break;
                }
            }
            
            System.out.println("Vowel count in this sentence:");
            System.out.println("A: " + countA);
            System.out.println("E: " + countE);
            System.out.println("I: " + countI);
            System.out.println("O: " + countO);
            System.out.println("U: " + countU);
            System.out.println();
        }
        
        System.out.println("Total vowel count for all sentences:");
        System.out.println("A: " + totalA);
        System.out.println("E: " + totalE);
        System.out.println("I: " + totalI);
        System.out.println("O: " + totalO);
        System.out.println("U: " + totalU);
        
        scanner.close();
    }
}
