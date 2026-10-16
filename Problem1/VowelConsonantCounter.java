import java.util.Locale;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            return;
        }

        String word = scanner.next().toLowerCase(Locale.ROOT);
        int vowels = 0;
        int consonants = 0;

        for (char character : word.toCharArray()) {
            if ("aeiou".indexOf(character) >= 0) {
                vowels++;
            } else {
                consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
