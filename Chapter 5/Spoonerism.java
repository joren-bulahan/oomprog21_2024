import java.util.Scanner;

public class Spoonerism {
    
    // Function to check if a word starts with a vowel
    public static boolean startsWithVowel(String word) {
        char firstChar = Character.toLowerCase(word.charAt(0));
        return "aeiou".indexOf(firstChar) != -1;
    }

    // Function to perform spoonerism
    public static String spoonerize(String word1, String word2) {
        if (startsWithVowel(word1) || startsWithVowel(word2)) {
            return word1 + " and " + word2 + " are not good words to spoonerize.";
        }
        
        // Swap the first characters
        String newWord1 = word2.charAt(0) + word1.substring(1);
        String newWord2 = word1.charAt(0) + word2.substring(1);
        
        return word1 + " and " + word2 + " spoonerized are " + newWord1 + " " + newWord2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Word 1: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter Word 2: ");
        String word2 = scanner.nextLine();
        
        // Display the result
        System.out.println(spoonerize(word1, word2));
        
        scanner.close();
    }
}
