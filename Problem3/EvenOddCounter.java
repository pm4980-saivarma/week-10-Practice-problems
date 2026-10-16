import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            input.append(scanner.nextLine()).append(' ');
        }

        Matcher matcher = Pattern.compile("-?\\d+").matcher(input);
        int even = 0;
        int odd = 0;
        while (matcher.find()) {
            if (Integer.parseInt(matcher.group()) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
